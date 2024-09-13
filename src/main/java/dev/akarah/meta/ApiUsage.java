package dev.akarah.meta;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

public interface ApiUsage {
    /**
     * Apply this annotation when a part of the API is experimental.
     * This means this part of the API may be changed or deleted at any time with no notice or warning.
     */
    @Retention(RetentionPolicy.RUNTIME)
    @interface Experimental {}

    /**
     * This represents a part of the API that should exclusively be used by implementations.
     * Using these incorrectly may lead to undefined behavior.
     */
    @Retention(RetentionPolicy.RUNTIME)
    @interface Internal {}

    /**
     * This represents a part of the API that contains undefined behavior.
     * This means that if you use this method incorrectly, you will invoke undefined behavior.
     * If you use these API parts, add a part of your code that explains why it's safe:
     * <code>
     * // Safety: This is safe because ...
     * </code>
     */
    @Retention(RetentionPolicy.RUNTIME)
    @interface Unsafe {}
}
