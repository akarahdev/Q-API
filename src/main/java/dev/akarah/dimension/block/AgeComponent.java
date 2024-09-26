package dev.akarah.dimension.block;

import dev.akarah.component.MutableComponent;

public class AgeComponent implements MutableComponent<Integer, Block, BlockComponent> {
    @Override
    public void set(Block holder, Integer value) {
        holder.age = value;
    }

    @Override
    public Integer get(Block holder) {
        return holder.age;
    }

    @Override
    public boolean isPresent(Block holder) {
        return true;
    }
}
