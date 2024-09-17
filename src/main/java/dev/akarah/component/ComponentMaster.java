package dev.akarah.component;

public abstract class ComponentMaster<
        H extends ComponentHolder<H, M>,
        M extends ComponentMaster<H, M>
        > {
}
