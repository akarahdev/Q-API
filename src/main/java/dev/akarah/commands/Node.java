package dev.akarah.commands;

public sealed interface Node {
    record Group(Node[] nodes) implements Node {
        
    }
    record Literal(String content) implements Node {

    }

    record Argument(String name, ParameterType parameterType) implements Node {

    }

    record Optional(Node child) implements Node {

    }

    record Execute(Runnable task) implements Node {

    }

    static Node group(Node... nodes) {
        return new Group(nodes);
    }

    static Node literal(String content) {
        return new Literal(content);
    }

    static Node argument(String name, ParameterType parameterType) {
        return new Argument(name, parameterType);
    }

    static Node optional(Node child) {
        return new Optional(child);
    }

    static Node execute(Runnable runnable) {
        return new Execute(runnable);
    }
}
