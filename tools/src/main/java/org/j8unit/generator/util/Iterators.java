package org.j8unit.generator.util;

import static java.util.Objects.requireNonNull;
import java.util.Iterator;
import java.util.NoSuchElementException;
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
     * TODO: JavaDoc!
     *
     * TODO: Is there something similar in the Oracle's Java universe? If yes, use it in preference!
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

}
