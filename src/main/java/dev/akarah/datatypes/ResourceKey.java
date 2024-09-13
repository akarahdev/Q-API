package dev.akarah.datatypes;

public class ResourceKey<T> {
    String namespace;
    String location;

    private ResourceKey(String namespace, String location) {
        this.namespace = namespace;
        this.location = location;
    }

    public static <T> ResourceKey<T> of(String path) {
        if (path.contains(":")) {
            return new ResourceKey<>(
                path.split(":")[0],
                path.split(":")[1]
            );
        }
        return new ResourceKey<>(
            "minecraft",
            path
        );
    }

    @Override
    public String toString() {
        return this.namespace + ":" + this.location;
    }

    @Override
    public int hashCode() {
        return this.toString().hashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (!(other instanceof ResourceKey<?> orl))
            return false;
        return this.namespace.equals(orl.namespace)
            && this.location.equals(orl.location);
    }
}
