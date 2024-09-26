package dev.akarah.component;

import java.util.Optional;

public interface AbstractComponent<
    Type,
    Holder extends ComponentHolder<Holder, Master>,
    Master extends ComponentMaster<Holder, Master>
    > {
    Type get(Holder holder);

    boolean isPresent(Holder holder);
}
