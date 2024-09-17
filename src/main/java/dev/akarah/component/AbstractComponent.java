package dev.akarah.component;

public abstract class AbstractComponent<
        Type,
        Holder extends ComponentHolder<Holder, Master>,
        Master extends ComponentMaster<Holder, Master>
        > {
    public abstract Type get(Holder holder);
    public abstract boolean isPresent(Holder holder);
}
