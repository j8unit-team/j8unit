package org.j8unit.generator.util;

import java.util.function.Consumer;

/**
 * <p>
 * Utility enum (aka. helper class) providing fancy {@link Consumer} stuff.
 * </p>
 */
public enum Consumers {
    ;

    /**
     * A <em>no operation</em> (NOOP) consumer that returns immediately, without doing any action.
     */
    public static final Consumer<Object> NOOP = any -> {};

}
