package dev.akarah;

import dev.akarah.datatypes.Dimension;
import dev.akarah.datatypes.ResourceKey;
import dev.akarah.entities.Player;

import java.util.stream.Stream;

public interface ServerInstance {
    Stream<Player> players();
    Dimension dimension(ResourceKey<Dimension> name);
    void runSync(Runnable runnable);
}
