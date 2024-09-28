package dev.akarah.commands;

public class Argument {
    public static Argument of(
        String name,
        ArgumentType type
    ) {
        return new Argument();
    }
}
