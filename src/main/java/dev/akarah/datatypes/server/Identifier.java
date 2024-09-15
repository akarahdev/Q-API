package dev.akarah.datatypes.server;

public class Identifier<T> {
    String namespace;
    String location;

    private Identifier(String namespace, String location) {
        this.namespace = namespace;
        this.location = location;
    }

    public static <T> Identifier<T> of(String path) {
        if (path.contains(":")) {
            return new Identifier<>(
                path.split(":")[0],
                path.split(":")[1]
            );
        }
        return new Identifier<>(
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
        if (!(other instanceof Identifier<?> orl))
            return false;
        return this.namespace.equals(orl.namespace)
            && this.location.equals(orl.location);
    }
}
