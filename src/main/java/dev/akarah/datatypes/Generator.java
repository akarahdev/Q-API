package dev.akarah.datatypes;

import java.util.List;
import java.util.stream.Stream;

public interface Generator {
    Stream<String> itemIds();
    Stream<String> blockIds();
    Stream<String> entityIds();
    Stream<String> attributeIds();
}
