package dev.akarah;

import dev.akarah.event.DynamicRegistryListener;
import dev.akarah.event.PlayerEventListener;
import dev.akarah.event.StaticRegistryListener;

import java.lang.reflect.InvocationTargetException;

public class PluginConfiguration {
    public String id;

    private PluginConfiguration() {}

    public static PluginConfiguration id(String id, ServerPlugin plugin) {
        var pc = new PluginConfiguration();
        pc.id = id;
        MinecraftServer.registerPlugin(plugin);
        return pc;
    }

    public PluginConfiguration registerPlayerEventListener(Class<? extends PlayerEventListener> listener) {
        try {
            var constructor = listener.getConstructor();
            var inst = constructor.newInstance();
            MinecraftServer.registerListener(inst, this.id);
        } catch (NoSuchMethodException | InstantiationException | IllegalAccessException | InvocationTargetException exception) {
            System.err.println("Failed to add Player Event listener " + listener.getName());
            System.err.println("Class must have a valid empty constructor");
        }
        return this;
    }

    public PluginConfiguration registerDynamicRegistryListener(Class<? extends DynamicRegistryListener> listener) {
        try {
            var constructor = listener.getConstructor();
            var inst = constructor.newInstance();
            MinecraftServer.registerListener(inst, this.id);
        } catch (NoSuchMethodException | InstantiationException | IllegalAccessException | InvocationTargetException exception) {
            System.err.println("Failed to add Dynamic Registry listener " + listener.getName());
            System.err.println("Class must have a valid empty constructor");
        }
        return this;
    }

    public PluginConfiguration registerStaticRegistryListener(Class<? extends StaticRegistryListener> listener) {
        try {
            var constructor = listener.getConstructor();
            var inst = constructor.newInstance();
            MinecraftServer.registerListener(inst, this.id);
        } catch (NoSuchMethodException | InstantiationException | IllegalAccessException | InvocationTargetException exception) {
            System.err.println("Failed to add Static Registry listener " + listener.getName());
            System.err.println("Class must have a valid empty constructor");
        }
        return this;
    }
}
