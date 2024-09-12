package dev.akarah.entities;

import dev.akarah.datatypes.Location;
import dev.akarah.item.Item;

public interface Player extends Entity {
    void sendMessage(String message);
    void sendActionBar(String message);

    void sendTitle(String title);
    void sendSubtitle(String subtitle);
    void sendTitleTimes(int duration, int fadeIn, int fadeOut);

    void giveItem(Item item);
    void giveItems(Item... items);
    void setItem(Item item, int slot);
    boolean hasItems(Item item);
    void removeItems(Item item);

    void setSidebarName(String name);
    void setSidebarLine(String text, int line);
}
