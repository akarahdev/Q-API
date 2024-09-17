package dev.akarah.component;

public interface AbstractComponent<
        Type,
        Holder extends ComponentHolder<Holder, Master>,
        Master extends ComponentMaster<Holder, Master>
        > {
    public Type get(Holder holder);
    public boolean isPresent(Holder holder);
}
