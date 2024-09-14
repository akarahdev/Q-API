package dev.akarah.entities.types;

import dev.akarah.item.Item;

public interface EquipmentComponent {


    Item helmet();

    void helmet(Item helmet);

    Item chestplate();

    void chestplate(Item chestplate);

    Item leggings();

    void leggings(Item leggings);

    Item boots();

    void boots(Item boots);

    Item mainHand();

    void mainHand(Item mainHand);

    Item offHand();

    void offHand(Item offHand);
}
