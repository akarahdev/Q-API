package dev.akarah.datatypes.nbt;

import java.util.Arrays;
import java.util.HashMap;
import java.util.stream.Collectors;

public sealed interface NbtElement {
    String toJson();

    String toStringifiedNbt();

    NbtTag tag();

    record Byte(byte value) implements NbtElement {
        @Override
        public String toJson() {
            return String.valueOf(this.value);
        }

        @Override
        public String toStringifiedNbt() {
            return this.value + "b";
        }

        @Override
        public NbtTag tag() {
            return new NbtTag.Byte();
        }
    }

    record Short(short value) implements NbtElement {
        @Override
        public String toJson() {
            return String.valueOf(this.value);
        }

        @Override
        public String toStringifiedNbt() {
            return this.value + "s";
        }

        @Override
        public NbtTag tag() {
            return new NbtTag.Short();
        }
    }

    record Int(int value) implements NbtElement {
        @Override
        public String toJson() {
            return String.valueOf(this.value);
        }

        @Override
        public String toStringifiedNbt() {
            return String.valueOf(this.value);
        }

        @Override
        public NbtTag tag() {
            return new NbtTag.Int();
        }
    }

    record Long(long value) implements NbtElement {
        @Override
        public String toJson() {
            return String.valueOf(this.value);
        }

        @Override
        public String toStringifiedNbt() {
            return this.value + "L";
        }

        @Override
        public NbtTag tag() {
            return new NbtTag.Long();
        }
    }

    record Float(float value) implements NbtElement {
        @Override
        public String toJson() {
            return String.valueOf(this.value);
        }

        @Override
        public String toStringifiedNbt() {
            return this.value + "f";
        }

        @Override
        public NbtTag tag() {
            return new NbtTag.Float();
        }
    }

    record Double(double value) implements NbtElement {
        @Override
        public String toJson() {
            return String.valueOf(this.value);
        }

        @Override
        public String toStringifiedNbt() {
            return this.value + "d";
        }

        @Override
        public NbtTag tag() {
            return new NbtTag.Double();
        }
    }

    record StringValue(String value) implements NbtElement {
        @Override
        public String toJson() {
            return this.toStringifiedNbt();
        }

        @Override
        public String toStringifiedNbt() {
            return '"' + this.value.replace("\"", "\\\"") + '"';
        }

        @Override
        public NbtTag tag() {
            return new NbtTag.String();
        }
    }

    record ListValue(NbtElement[] value) implements NbtElement {
        @Override
        public String toJson() {
            return '[' + Arrays.stream(this.value)
                .map(NbtElement::toJson)
                .collect(Collectors.joining(",")) + ']';
        }

        @Override
        public String toStringifiedNbt() {
            return '[' + Arrays.stream(this.value)
                .map(NbtElement::toStringifiedNbt)
                .collect(Collectors.joining(",")) + ']';
        }

        @Override
        public NbtTag tag() {
            return new NbtTag.List();
        }
    }

    record CompoundValue(HashMap<String, NbtElement> value) implements NbtElement {
        @Override
        public String toJson() {
            return '{' + (this.value).keySet().stream()
                .map(key -> key + ':' + this.value.get(key).toJson())
                .collect(Collectors.joining(",")) + '}';
        }

        @Override
        public String toStringifiedNbt() {
            return '{' + (this.value).keySet().stream()
                .map(key -> key + ':' + this.value.get(key).toStringifiedNbt())
                .collect(Collectors.joining(",")) + '}';
        }

        @Override
        public NbtTag tag() {
            return new NbtTag.List();
        }
    }

}
