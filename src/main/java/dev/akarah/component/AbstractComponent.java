package dev.akarah.component;

import java.util.Optional;

/**
 * Represents a component.
 * @param <Type> The type this component manipulates on. Can be itself.
 * @param <Holder> The type that holds this component.
 * @param <Master> The type this component may originate from.
 */
public interface AbstractComponent<
    Type,
    Holder extends ComponentHolder<Holder, Master>,
    Master extends ComponentMaster<Holder, Master>
    > {
    Type get(Holder holder);

    boolean isPresent(Holder holder);
}
