package dev.akarah;


import java.lang.reflect.InvocationTargetException;

public class PluginConfiguration {
    public String id;

    private PluginConfiguration() {
    }

    public static PluginConfiguration id(String id, ServerPlugin plugin) {
        var pc = new PluginConfiguration();
        pc.id = id;
        MinecraftServer.registerPlugin(plugin);
        return pc;
    }
}
