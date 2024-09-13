package dev.akarah.dimension;

import dev.akarah.datatypes.Identifier;

public class BlockType {
    Identifier<?> internalName;

    public BlockType(Identifier<?> internalName) {
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
