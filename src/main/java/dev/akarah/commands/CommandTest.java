package dev.akarah.commands;

class CommandTest {
    @Command({
        @Literal("hi"),
        @Argument(name = "hey", type = ArgumentType.GREEDY_STRING)
    })
    private static void test() {

    }
}
