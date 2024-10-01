package dev.akarah.entities;

import dev.akarah.component.MutableComponent;
import dev.akarah.item.Item;

import java.util.Optional;

public interface EquipmentComponent extends MutableComponent<EquipmentComponent, Entity, EntityComponent> {
    public Item helmet();
    public EquipmentComponent helmet(Item helmet);
    public Item chestplate();
    public EquipmentComponent chestplate(Item chestplate);
    public Item leggings();
    public EquipmentComponent leggings(Item leggings);
    public Item boots();
    public EquipmentComponent boots(Item boots);
    public Item mainHand();
    public EquipmentComponent mainHand(Item mainHand);
    public Item offHand();
    public EquipmentComponent offHand(Item offHand);
}
