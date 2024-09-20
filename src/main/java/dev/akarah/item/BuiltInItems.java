package dev.akarah.item;

import dev.akarah.datatypes.nbt.JsonToNbtParser;
import dev.akarah.datatypes.nbt.NbtElement;
import dev.akarah.datatypes.server.Identifier;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class BuiltInItems {
    public static void generate(Path generatedDataDirectory) throws IOException {
        var path = generatedDataDirectory.resolve("./reports/items.json");
        var raw = Files.readString(path);
        var json = new JsonToNbtParser(raw).parse();
        if(json instanceof NbtElement.CompoundValue compoundValue) {
            for(var key : compoundValue.value().keySet()) {
                System.out.println(
                    "public static Identifier<Item> {hname} = Identifier.of(\"{name}\");"
                        .replace("{hname}", key.replace("minecraft:", "").toUpperCase())
                        .replace("{name}", key)
                );
            }
        }
    }

    public static Identifier<Item> OAK_PLANKS = Identifier.of("minecraft:oak_planks");
}
