package dev.akarah.dimension.block;

import dev.akarah.datatypes.server.Identifier;
import dev.akarah.registry.Registries;

public interface BlockType {
    Identifier<?> internalName();

    static BlockType of(Identifier<BlockType> name) {
        return Registries.blockTypeRegistry().get(name);
    }
}
