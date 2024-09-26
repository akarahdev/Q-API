package dev.akarah.component;

import java.util.Optional;

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
