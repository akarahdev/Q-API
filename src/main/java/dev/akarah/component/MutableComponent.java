package dev.akarah.component;

public interface MutableComponent<
    Type,
    Holder extends ComponentHolder<Holder, Master>,
    Master extends ComponentMaster<Holder, Master>
    > extends AbstractComponent<Type, Holder, Master> {
    void set(Holder holder, Type value);
}