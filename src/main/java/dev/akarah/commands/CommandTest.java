package dev.akarah.commands;

class CommandTest {
    @CommandProvider
    private static Node test() {
        return Node.group(
            Node.literal("execute"),
            Node.optional(Node.group(
                    Node.literal("as"),
                    Node.argument("target", ParameterType.GREEDY_STRING)
            )),
                Node.execute(() -> {

                })
        );
    }
}
