package dev.akarah.dimension;

import dev.akarah.datatypes.server.Identifier;

public class BlockComponent<T> {
    public static BlockComponent<Integer> AGE = new BlockComponent<>(Identifier.of("age"));

    Identifier<?> internalName;

    public BlockComponent(Identifier<?> internalName) {
        this.internalName = internalName;
    }

    public Identifier<?> internalName() {
        return this.internalName;
    }

    @Override
    public int hashCode() {
        return this.internalName.hashCode();
    }
}
