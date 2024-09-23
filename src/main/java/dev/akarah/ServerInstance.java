package dev.akarah;

import dev.akarah.entities.Entity;

import java.util.stream.Stream;

public interface ServerInstance {
    Stream<Entity> players();

    void runSync(Runnable runnable);
}
