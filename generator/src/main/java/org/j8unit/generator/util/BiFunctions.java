package org.j8unit.generator.util;

import java.util.function.BiFunction;
import java.util.function.Function;

/**
 * <p>
 * Utility enum (aka. helper class) providing fancy {@link BiFunction} stuff.
 * </p>
 */
public enum BiFunctions {
    ;

    /**
     * Curries the first parameter of a given {@link BiFunction} and returns the resulting {@link Function}.
     *
     * @param f
     *            the origin {@code BiFunction}
     * @param t
     *            the curry value
     * @return the curried {@code BiFunction}, which indeed is a {@code Function}
     */
    public static final <T, U, R> Function<U, R> curryFirst(final BiFunction<? super T, ? super U, ? extends R> f, final T t) {
        return u -> f.apply(t, u);
    }

    /**
     * Curries the second parameter of a given {@link BiFunction} and returns the resulting {@link Function}.
     *
     * @param f
     *            the origin {@code BiFunction}
     * @param u
     *            the curry value
     * @return the curried {@code BiFunction}, which indeed is a {@code Function}
     */
    public static final <T, U, R> Function<T, R> currySecond(final BiFunction<? super T, ? super U, ? extends R> f, final U u) {
        return t -> f.apply(t, u);
    }

}
