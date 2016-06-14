package org.j8unit.generator.util;

import static java.util.Arrays.stream;
import static java.util.stream.Collectors.toList;
import static java.util.stream.Stream.concat;
import java.util.Collection;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

public enum Lists {
    ;

    public static final <T> List<T> join(final List<T> x, final List<T> y) {
        return concat(x.stream(), y.stream()).collect(toList());
    }

    public static final <T> List<T> join(final T t, final List<T> y) {
        return concat(Stream.of(t), y.stream()).collect(toList());
    }

    public static final <T> List<T> join(final T t, final T... y) {
        return concat(Stream.of(t), stream(y)).collect(toList());
    }

    /**
     * Similar to {@link List#replaceAll(java.util.function.UnaryOperator)} but with type conversion.
     *
     * @param origin
     *            the origin list
     * @param mapper
     *            a non-interfering, stateless function to apply to each element
     * @return the resulting list
     */
    public static final <T, R> List<R> convert(final Collection<T> origin, final Function<? super T, ? extends R> mapper) {
        return origin.stream().map(mapper).collect(toList());
    }

    public static final <T, R> List<R> convert(final T[] origin, final Function<? super T, ? extends R> mapper) {
        return stream(origin).map(mapper).collect(toList());
    }

}
