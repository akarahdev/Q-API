package dev.akarah.component;

/**
 * Represents a {@link AbstractComponent} that can be modified.
 * @param <Type> The type this component manipulates on. Can be itself.
 * @param <Holder> The type that holds this component.
 * @param <Master> The type this component may originate from.
 */
public interface MutableComponent<
    Type,
    Holder extends ComponentHolder<Holder, Master>,
    Master extends ComponentMaster<Holder, Master>
    > extends AbstractComponent<Type, Holder, Master> {
    void set(Holder holder, Type value);
}