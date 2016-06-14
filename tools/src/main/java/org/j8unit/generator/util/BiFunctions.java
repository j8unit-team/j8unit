package org.j8unit.generator.util;

import java.util.function.BiFunction;
import java.util.function.Function;

public enum BiFunctions {
    ;

    public static final <T, U, R> Function<U, R> curryFirst(final BiFunction<? super T, ? super U, ? extends R> bi, final T t) {
        return (final U u) -> bi.apply(t, u);
    }

    public static final <T, U, R> Function<T, R> currySecond(final BiFunction<? super T, ? super U, ? extends R> bi, final U u) {
        return (final T t) -> bi.apply(t, u);
    }

}
