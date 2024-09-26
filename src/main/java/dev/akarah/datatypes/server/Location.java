package dev.akarah.datatypes.server;

import dev.akarah.meta.ApiUsage;

/**
 * Represents a location in a {@link dev.akarah.dimension.Dimension}. This can represent the location of an entity,
 * block, or anything else in a Dimension.
 * This class is immutable, so you are unable to mutate the fields. To create a new {@link Location}, use
 * the factory methods:
 * - {@link Location#of(double, double, double, float, float)}
 * - {@link Location#of(double, double, double)},
 * or the with methods:
 * - {@link Location#withX(double)}
 * - {@link Location#withY(double)}
 * - {@link Location#withZ(double)}
 * - {@link Location#withPitch(float)}
 * - {@link Location#withYaw(float)}
 *
 * Since locations are not dimension-specific, you must have an instance of a {@link dev.akarah.dimension.Dimension}
 * in order to use them to interact with Minecraft.
 */
public class Location {
    double x;
    double y;
    double z;
    float pitch;
    float yaw;

    @ApiUsage.Internal
    public Location(double x, double y, double z, float pitch, float yaw) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.pitch = pitch;
        this.yaw = yaw;
    }

    public static Location of(double x, double y, double z) {
        return new Location(x, y, z, 0f, 0f);
    }

    public static Location of(double x, double y, double z, float pitch, float yaw) {
        return new Location(x, y, z, pitch, yaw);
    }

    public double x() {
        return x;
    }

    public double y() {
        return y;
    }

    public double z() {
        return z;
    }

    public float pitch() {
        return pitch;
    }

    public float yaw() {
        return yaw;
    }

    public Location withX(double newX) {
        return new Location(newX, y, z, pitch, yaw);
    }

    public Location withY(double newY) {
        return new Location(x, newY, z, pitch, yaw);
    }

    public Location withZ(double newZ) {
        return new Location(x, y, newZ, pitch, yaw);
    }

    public Location withPitch(float newPitch) {
        return new Location(x, y, z, newPitch, yaw);
    }

    public Location withYaw(float newYaw) {
        return new Location(x, y, z, pitch, newYaw);
    }
}
