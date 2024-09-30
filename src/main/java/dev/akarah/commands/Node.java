package dev.akarah.commands;

public interface Node {
    static Node group(Node... nodes) {

    }

    static Node literal(String content) {

    }

    static Node argument(String name, ParameterType parameterType) {

    }

    static Node optional(Node child) {

    }

    static Node execute(Runnable runnable) {

    }
}
