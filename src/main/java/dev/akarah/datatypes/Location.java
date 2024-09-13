package dev.akarah.datatypes;

import dev.akarah.meta.ApiUsage;

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
