package dev.akarah;

import dev.akarah.datatypes.event.EventPair;
import dev.akarah.entities.Entity;
import dev.akarah.meta.ApiUsage;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class MinecraftServer {
    static ServerInstance backingInstance;
    static List<ServerPlugin> plugins = new ArrayList<>();


    @ApiUsage.Internal
    public static ServerInstance getBackingInstance() {
        return backingInstance;
    }

    @ApiUsage.Internal
    public static ServerInstance setBackingInstance(ServerInstance instance) {
        MinecraftServer.backingInstance = instance;
        return MinecraftServer.backingInstance;
    }

    public static Stream<Entity> players() {
        return backingInstance.players();
    }

    @ApiUsage.Internal
    public static void registerPlugin(ServerPlugin plugin) {
        MinecraftServer.plugins.add(plugin);
    }

    public static void runSync(Runnable task) {
        MinecraftServer.backingInstance.runSync(task);
    }
}
