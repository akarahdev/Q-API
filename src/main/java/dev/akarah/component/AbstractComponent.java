package dev.akarah.component;

import java.util.Optional;

public interface AbstractComponent<
        Type,
        Holder extends ComponentHolder<Holder, Master>,
        Master extends ComponentMaster<Holder, Master>
        > {
    public Optional<Type> get(Holder holder);
    public boolean isPresent(Holder holder);
}
