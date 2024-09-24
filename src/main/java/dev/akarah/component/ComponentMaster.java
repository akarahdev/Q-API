package dev.akarah.component;

public interface ComponentMaster<
    H extends ComponentHolder<H, M>,
    M extends ComponentMaster<H, M>
    > {
}
