package dev.akarah.entities;

import dev.akarah.objective.Objective;
import dev.akarah.objective.ObjectiveSlot;

public interface GUIComponent {
    void sendMessage(String message);

    void sendActionBar(String message);

    void sendTitle(String title);

    void sendSubtitle(String subtitle);

    void sendTitleTimes(int duration, int fadeIn, int fadeOut);

    void setObjectiveSlot(Objective objective, ObjectiveSlot slot);

    InventoryComponent currentOpenMenu();
}
