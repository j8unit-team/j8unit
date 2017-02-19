package org.j8unit.util;

import java.util.function.Consumer;
import java.util.function.Predicate;

/**
 * <p>
 * Utility enum (aka. helper class) providing fancy functional stuff.
 * </p>
 *
 * @since 4.12.2
 */
public enum Functional {

    ;

    /**
     * Returns a wrapper {@linkplain Predicate predicate} that, in addition to the origin predicate, relays any
     * non-matching argument to the given {@linkplain Consumer consumer}.
     *
     * @param predicate
     *            the origin predicate
     * @param consumer
     *            the consumer of any non-matching argument
     * @return a wrapper predicate
     */
    public static final <T> Predicate<T> consumeFalse(final Predicate<T> predicate, final Consumer<? super T> consumer) {
        return t -> {
            final boolean b = predicate.test(t);
            if (!b) {
                consumer.accept(t);
            }
            return b;
        };
    }

}
