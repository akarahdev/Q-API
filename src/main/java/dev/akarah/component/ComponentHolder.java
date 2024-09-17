package dev.akarah.component;

public abstract class ComponentHolder<
        Holder extends ComponentHolder<Holder, Master>,
        Master extends ComponentMaster<Holder, Master>
        > {

    public <T> T component(AbstractComponent<T, Holder, Master> component) {
        return component.get((Holder) this);
    }

    public <T> Holder component(MutableComponent<T, Holder, Master> component, T value) {
        component.set((Holder) this, value);
        return (Holder) this;
    }

    public abstract Holder copy();
}
