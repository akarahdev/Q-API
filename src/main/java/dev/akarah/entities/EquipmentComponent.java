package dev.akarah.entities;

import dev.akarah.component.AbstractComponent;
import dev.akarah.component.MutableComponent;
import dev.akarah.item.Item;

public class EquipmentComponent implements MutableComponent<EquipmentComponent, Entity, EntityComponent> {
    Item helmet;
    Item chestplate;
    Item leggings;
    Item boots;
    Item mainHand;
    Item offHand;

    public EquipmentComponent(Item helmet, Item chestplate, Item leggings, Item boots, Item mainHand, Item offHand) {
        this.helmet = helmet;
        this.chestplate = chestplate;
        this.leggings = leggings;
        this.boots = boots;
        this.mainHand = mainHand;
        this.offHand = offHand;
    }


    public Item helmet() {
        return this.helmet;
    }

    public EquipmentComponent helmet(Item helmet) {
        return new EquipmentComponent(helmet, chestplate, leggings, boots, mainHand, offHand);
    }

    public Item chestplate() {
        return this.chestplate;
    }

    public EquipmentComponent chestplate(Item chestplate) {
        return new EquipmentComponent(helmet, chestplate, leggings, boots, mainHand, offHand);
    }

    public Item leggings() {
        return this.leggings;
    }

    public EquipmentComponent leggings(Item leggings) {
        return new EquipmentComponent(helmet, chestplate, leggings, boots, mainHand, offHand);
    }

    public Item boots() {
        return this.helmet;
    }

    public EquipmentComponent boots(Item boots) {
        return new EquipmentComponent(helmet, chestplate, leggings, boots, mainHand, offHand);
    }

    public Item mainHand() {
        return this.mainHand;
    }

    public EquipmentComponent mainHand(Item mainHand) {
        return new EquipmentComponent(helmet, chestplate, leggings, boots, mainHand, offHand);
    }

    public Item offHand() {
        return this.offHand;
    }

    public EquipmentComponent offHand(Item offHand) {
        return new EquipmentComponent(helmet, chestplate, leggings, boots, mainHand, offHand);
    }

    @Override
    public void set(Entity holder, EquipmentComponent value) {
        holder.unsafe().equipment = value;
    }

    @Override
    public EquipmentComponent get(Entity holder) {
        return holder.unsafe().equipment;
    }

    @Override
    public boolean isPresent(Entity holder) {
        return holder.unsafe().equipment != null;
    }
}
