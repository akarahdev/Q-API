package dev.akarah;

import dev.akarah.dimension.Dimension;
import dev.akarah.datatypes.server.Identifier;
import dev.akarah.entities.Entity;

import java.util.stream.Stream;

public interface ServerInstance {
    Stream<Entity> players();

    Dimension dimension(Identifier<Dimension> name);

    void runSync(Runnable runnable);
}
