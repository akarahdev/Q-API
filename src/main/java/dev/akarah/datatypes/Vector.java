package dev.akarah.datatypes;

public class Vector {
    double x;
    double y;
    double z;

    public Vector(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public static Vector of(double x, double y, double z) {
        return new Vector(x, y, z);
    }

    public Vector withX(double newX) {
        return new Vector(newX, y, z);
    }

    public Vector withY(double newY) {
        return new Vector(x, newY, z);
    }

    public Vector withZ(double newZ) {
        return new Vector(x, y, newZ);
    }
}
