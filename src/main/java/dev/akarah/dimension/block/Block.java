package dev.akarah.dimension.block;

import dev.akarah.component.ComponentHolder;
import dev.akarah.datatypes.server.Identifier;
import dev.akarah.registry.Registries;

public class Block implements ComponentHolder<
    Block, BlockComponent> {

    BlockType blockType;

    int age = 0;

    public Block(BlockType blockType) {
        this.blockType = blockType;
    }

    public static Block of(BlockType blockType) {
        return new Block(blockType);
    }

    public static Block of(Identifier<BlockType> blockTypeIdentifier) {
        return new Block(Registries.blockTypeRegistry().get(blockTypeIdentifier));
    }

    public static Block of(String identifierString) {
        return Block.of(Identifier.of(identifierString));
    }

    public BlockType blockType() {
        return this.blockType;
    }

    @Override
    public Block copy() {
        var block = Block.of(this.blockType);
        for(var field : Block.class.getFields()) {
            try {
                field.setAccessible(true);
                field.set(block, field.get(this));
            } catch (IllegalAccessException e) {}
        }
        return this;
    }
}
