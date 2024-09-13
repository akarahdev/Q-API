package dev.akarah;

public interface ServerPlugin {
    void onInitialization();

    void onFinalization();

    PluginConfiguration configuration();

    String pluginId();
}
