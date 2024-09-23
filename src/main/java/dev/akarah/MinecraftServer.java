package dev.akarah;

import dev.akarah.entities.Entity;
import dev.akarah.event.DynamicRegistryListener;
import dev.akarah.event.PlayerEventListener;
import dev.akarah.event.StaticRegistryListener;
import dev.akarah.meta.ApiUsage;
import dev.akarah.datatypes.event.EventPair;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class MinecraftServer {
    static ServerInstance backingInstance;
    static List<ServerPlugin> plugins = new ArrayList<>();
    static List<EventPair<PlayerEventListener>> playerEventListeners = new ArrayList<>();
    static List<EventPair<DynamicRegistryListener>> dynamicRegistryListeners = new ArrayList<>();
    static List<EventPair<StaticRegistryListener>> staticRegistryListeners = new ArrayList<>();

    public static ServerListeners listeners() {
        return new ServerListeners();
    }

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
    public static void registerListener(PlayerEventListener listener, String pluginId) {
        MinecraftServer.playerEventListeners.add(new EventPair<>(pluginId, listener));
    }

    @ApiUsage.Internal
    public static void registerListener(DynamicRegistryListener listener, String pluginId) {
        MinecraftServer.dynamicRegistryListeners.add(new EventPair<>(pluginId, listener));
    }

    @ApiUsage.Internal
    public static void registerListener(StaticRegistryListener listener, String pluginId) {
        MinecraftServer.staticRegistryListeners.add(new EventPair<>(pluginId, listener));
    }

    @ApiUsage.Internal
    public static void registerPlugin(ServerPlugin plugin) {
        MinecraftServer.plugins.add(plugin);
    }

    @ApiUsage.Internal
    public static void deregisterListenersFor(String pluginId) {
        var lists = List.of(
            MinecraftServer.listeners().dynamicRegistryListeners(),
            MinecraftServer.listeners().staticRegistryListeners(),
            MinecraftServer.listeners().playerEventListeners()
        );

        for (var sublist : lists) {
            var markedForRemoval = new ArrayList<EventPair<?>>();
            for (var eventPair : sublist) {
                if (eventPair.pluginId().equals(pluginId)) {
                    markedForRemoval.add(eventPair);
                }
            }
            for (var remove : markedForRemoval) {
                sublist.remove(remove);
            }
        }
    }

    @ApiUsage.Internal
    public static void deregisterPlugin(ServerPlugin plugin) {
        MinecraftServer.plugins.remove(plugin);
    }

    public static void runSync(Runnable task) {
        MinecraftServer.backingInstance.runSync(task);
    }

    public static class ServerListeners {
        public List<EventPair<DynamicRegistryListener>> dynamicRegistryListeners() {
            return MinecraftServer.dynamicRegistryListeners;
        }

        public List<EventPair<StaticRegistryListener>> staticRegistryListeners() {
            return MinecraftServer.staticRegistryListeners;
        }

        public List<EventPair<PlayerEventListener>> playerEventListeners() {
            return MinecraftServer.playerEventListeners;
        }
    }
}
