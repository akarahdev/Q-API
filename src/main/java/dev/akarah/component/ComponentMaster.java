package dev.akarah.component;

/**
 * Represents a source for components.
 * @param <H> The target holder of these components.
 * @param <M> The master of these components. This should be itself. If this type parameter is not itself,
 *            you may encounter strange behavior.
 */
public interface ComponentMaster<
    H extends ComponentHolder<H, M>,
    M extends ComponentMaster<H, M>
    > {
}
