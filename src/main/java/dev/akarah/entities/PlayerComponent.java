package dev.akarah.entities;

import dev.akarah.component.AbstractComponent;

import java.util.Optional;

public interface PlayerComponent extends AbstractComponent<PlayerComponent, Entity, EntityComponent> {
    GUIComponent gui();

    InventoryComponent inventory();

    @Override
    default Optional<PlayerComponent> get(Entity holder) {
        return Optional.ofNullable(holder.unsafe().player);
    }
}
