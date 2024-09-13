package dev.akarah;

import dev.akarah.dimension.Dimension;
import dev.akarah.datatypes.Identifier;
import dev.akarah.entities.Player;

import java.util.stream.Stream;

public interface ServerInstance {
    Stream<Player> players();

    Dimension dimension(Identifier<Dimension> name);

    void runSync(Runnable runnable);
}
