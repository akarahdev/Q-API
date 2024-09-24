package dev.akarah.component;

import java.util.Optional;

public interface ComponentHolder<
    Holder extends ComponentHolder<Holder, Master>,
    Master extends ComponentMaster<Holder, Master>
    > {

    default <T> Optional<T> get(AbstractComponent<T, Holder, Master> component) {
        return component.get((Holder) this);
    }

    default <T> T getOrNull(AbstractComponent<T, Holder, Master> component) {
        return this.get(component).orElse(null);
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
