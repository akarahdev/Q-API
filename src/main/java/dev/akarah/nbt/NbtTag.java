package dev.akarah.nbt;

public sealed interface NbtTag {
    record End() implements NbtTag {}
    record Byte() implements NbtTag {}
    record Short() implements NbtTag {}
    record Int() implements NbtTag {}
    record Long() implements NbtTag {}
    record Float() implements NbtTag {}
    record Double() implements NbtTag {}
    record ByteArray() implements NbtTag {}
    record String() implements NbtTag {}
    record List() implements NbtTag {}
    record Compound() implements NbtTag {}
    record IntArray() implements NbtTag {}
    record LongArray() implements NbtTag {}
}
