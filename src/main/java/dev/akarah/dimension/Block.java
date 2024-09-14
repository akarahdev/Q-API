package dev.akarah.dimension;

import dev.akarah.datatypes.Identifier;
import dev.akarah.item.ItemComponent;
import dev.akarah.registry.Registries;

import java.util.HashMap;
import java.util.function.Consumer;
import java.util.function.Function;

public class Block {
    BlockType blockType;
    HashMap<BlockComponent<Object>, Object> components = new HashMap<>();

    private HashMap<BlockComponent<Object>, Object> cloneComponents() {
        var hm = new HashMap<BlockComponent<Object>, Object>();
        for (var key : this.components.keySet())
            hm.put(key, this.components.get(key));
        return hm;
    }

    private Block(Block oldBlock, Consumer<Block> modification) {
        this.blockType = oldBlock.blockType;
        this.components = oldBlock.cloneComponents();
        modification.accept(this);
    }

    public BlockType blockType() {
        return this.blockType;
    }

    public Block(BlockType blockType) {
        this.blockType = blockType;
    }

    public static Block of(BlockType blockType) {
        return new Block(blockType);
    }

    public static Block of(Identifier<BlockType> blockTypeIdentifier) {
        return new Block(Registries.findRegistry(Registries.BLOCK_TYPES).get().lookup(blockTypeIdentifier).get());
    }

    public static Block of(String identifierString) {
        return Block.of(Identifier.of(identifierString));
    }

    public<T> Block with(BlockComponent<T> component, T value) {
        return new Block(this, block -> block.components.put((BlockComponent<Object>) component, value));
    }

    public<T> T get(BlockComponent<T> component) {
        return (T) this.components.get(component);
    }
}
