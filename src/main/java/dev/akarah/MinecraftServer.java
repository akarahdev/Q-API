package dev.akarah;

import dev.akarah.entities.Player;
import dev.akarah.event.DynamicRegistryListener;
import dev.akarah.event.PlayerEventListener;
import dev.akarah.event.StaticRegistryListener;
import dev.akarah.util.EventPair;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class MinecraftServer {
    static ServerInstance backingInstance;
    static List<ServerPlugin> plugins = new ArrayList<>();
    static List<EventPair<PlayerEventListener>> playerEventListeners = new ArrayList<>();
    static List<EventPair<DynamicRegistryListener>> dynamicRegistryListeners = new ArrayList<>();
    static List<EventPair<StaticRegistryListener>> staticRegistryListeners = new ArrayList<>();

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

    public static ServerListeners listeners() {
        return new ServerListeners();
    }

    public static ServerInstance getBackingInstance() {
        return backingInstance;
    }

    public static ServerInstance setBackingInstance(ServerInstance instance) {
        MinecraftServer.backingInstance = instance;
        return MinecraftServer.backingInstance;
    }

    public static Stream<Player> players() {
        return backingInstance.players();
    }

    public static void registerListener(PlayerEventListener listener, String pluginId) {
        MinecraftServer.playerEventListeners.add(new EventPair<>(pluginId, listener));
    }

    public static void registerListener(DynamicRegistryListener listener, String pluginId) {
        MinecraftServer.dynamicRegistryListeners.add(new EventPair<>(pluginId, listener));
    }

    public static void registerListener(StaticRegistryListener listener, String pluginId) {
        MinecraftServer.staticRegistryListeners.add(new EventPair<>(pluginId, listener));
    }

    public static void registerPlugin(ServerPlugin plugin) {
        MinecraftServer.plugins.add(plugin);
    }

    public static void deregisterListenersFor(String pluginId) {
        var lists = List.of(
            MinecraftServer.listeners().dynamicRegistryListeners(),
            MinecraftServer.listeners().staticRegistryListeners(),
            MinecraftServer.listeners().playerEventListeners()
        );

        for(var sublist : lists) {
            var markedForRemoval = new ArrayList<EventPair<?>>();
            for(var eventPair : sublist) {
                if(eventPair.pluginId().equals(pluginId)) {
                    markedForRemoval.add(eventPair);
                }
            }
            for(var remove : markedForRemoval) {
                sublist.remove(remove);
            }
        }
    }

    public static void deregisterPlugin(ServerPlugin plugin) {
        MinecraftServer.plugins.remove(plugin);
    }
}
