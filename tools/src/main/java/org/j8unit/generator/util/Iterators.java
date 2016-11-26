package org.j8unit.generator.util;

import static java.util.Objects.requireNonNull;
import static java.util.Spliterators.spliteratorUnknownSize;
import static java.util.stream.Collectors.toList;
import static java.util.stream.StreamSupport.stream;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

/**
 * <p>
 * Utility enum (aka. helper class) providing fancy {@link Iterable}/{@link Iterator} stuff.
 * </p>
 */
public enum Iterators {
    ;

    /**
     * Starting with a generator {@code seed} value and repetitively using the generator function {@code f}, this method
     * iterates over these elements until that moment the given validation predicate {@code p} does not hold.
     *
     * @param seed
     *            the first value
     * @param f
     *            the generator function
     * @param p
     *            the validation predicate
     * @return an {@link Iterator} of {@code seed} and all valid successor values
     */
    public static final <T> Iterator<T> iterate(final T seed, final UnaryOperator<T> f, final Predicate<T> p) {
        return new Iterator<T>() {

            private T next = seed;

            private final UnaryOperator<T> generator = requireNonNull(f);

            private final Predicate<T> isValid = requireNonNull(p);

            @Override
            public boolean hasNext() {
                return this.isValid.test(this.next);
            }

            @Override
            public T next()
            throws NoSuchElementException {
                final T current = this.next;
                if (this.isValid.test(current)) {
                    this.next = this.generator.apply(current);
                    return current;
                } else {
                    throw new NoSuchElementException();
                }
            }

        };
    }

    public static final <T, R> Iterator<R> replaceAll(final Iterator<T> iterator, final Function<T, R> operator) {
        return stream(spliteratorUnknownSize(iterator, 0), false).map(operator).collect(toList()).iterator();
    }

}
