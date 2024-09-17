package dev.akarah.component;

public abstract class ComponentMaster<
        O,
        H extends ComponentHolder<O, H, M>,
        M extends ComponentMaster<O, H, M>
        > {
}
