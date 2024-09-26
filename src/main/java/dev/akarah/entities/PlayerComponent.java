package dev.akarah.entities;

import dev.akarah.component.AbstractComponent;

import java.util.Optional;

public interface PlayerComponent extends AbstractComponent<PlayerComponent, Entity, EntityComponent> {
    GUIComponent gui();

    InventoryComponent inventory();

    @Override
    default PlayerComponent get(Entity holder) {
        return holder.unsafe().player;
    }
}
