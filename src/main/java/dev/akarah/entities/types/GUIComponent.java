package dev.akarah.entities.types;

public interface GUIComponent {
    void sendMessage(String message);

    void sendActionBar(String message);

    void sendTitle(String title);

    void sendSubtitle(String subtitle);

    void sendTitleTimes(int duration, int fadeIn, int fadeOut);

    void setSidebarName(String name);

    void setSidebarLine(String text, int line);

    InventoryComponent currentOpenMenu();
}
