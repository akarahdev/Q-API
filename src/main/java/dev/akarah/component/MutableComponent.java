package dev.akarah.component;

public abstract class MutableComponent<
        Type,
        Holder extends ComponentHolder<Holder, Master>,
        Master extends ComponentMaster<Holder, Master>
        > extends AbstractComponent<Type, Holder, Master> {
    public abstract void set(Holder holder, Type value);
}
