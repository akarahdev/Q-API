package dev.akarah.component;

public abstract class Component<
        Type,
        Output,
        Holder extends ComponentHolder<Output, Holder, Master>,
        Master extends ComponentMaster<Output, Holder, Master>
        > {
    public abstract void set(Holder holder, Type value);
    public abstract Type get(Holder holder);
}
