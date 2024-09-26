package dev.akarah.component;

import java.util.Optional;

/**
 * Represents an object that can hold components.
 * This is an interface used in the Registry-Component system to ensure safety.
 * @param <Holder> Represents the holder of the components. This type should be itself.
 *                If it is not itself, you may encounter strange behavior.
 * @param <Master> This represents the Component Master - or a standard source for the relevant components.
 *                This exists purely to ensure type safety.
 */
public interface ComponentHolder<
    Holder extends ComponentHolder<Holder, Master>,
    Master extends ComponentMaster<Holder, Master>
    > {

    default <T> Optional<T> getOptional(AbstractComponent<T, Holder, Master> component) {
        return Optional.ofNullable(this.get(component));
    }

    default <T> T get(AbstractComponent<T, Holder, Master> component) {
        return component.get((Holder) this);
    }

    default <T> Holder set(MutableComponent<T, Holder, Master> component, T value) {
        component.set((Holder) this, value);
        return (Holder) this;
    }

    default <T> boolean hasComponent(AbstractComponent<T, Holder, Master> component) {
        return component.isPresent((Holder) this);
    }

    Holder copy();
}
