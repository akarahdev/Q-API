package dev.akarah.component;

public abstract class ComponentHolder<
        Output,
        Holder extends ComponentHolder<Output, Holder, Master>,
        Master extends ComponentMaster<Output, Holder, Master>
        > {

    public <T> T component(Component<T, Output, Holder, Master> component) {
        return component.get((Holder) this);
    }

    public <T> Holder component(Component<T, Output, Holder, Master> component, T value) {
        component.set((Holder) this, value);
        return (Holder) this;
    }
}
