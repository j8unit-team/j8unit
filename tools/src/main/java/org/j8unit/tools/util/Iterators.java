package org.j8unit.tools.util;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * Utility enum (aka. helper class) providing fancy {@link Iterator}/{@link Iterable} stuff.
 *
 * @author Stefan Gasterst&auml;dt (SGA)
 */
public enum Iterators {
    ;

    /**
     * <p>
     * Returns an {@linkplain Iterator iterator} of representing some class' class hierarchy; I.&thinsp;e., contains the
     * provides the following elements: the class itself, its super class, its super super class, its super super super
     * class, and so on. If finally {@link Object} is reached, there will be no further super class and, thus,
     * {@link Iterator#hasNext()} will return {@code false} and the execution of {@link Iterator#next()} will cause an
     * {@link NoSuchElementException}.
     * </p>
     *
     * <p>
     * If the given class {@linkplain Class#isInterface() represents an interface}, the iterator will return the class
     * itself and does not hold any further element. That is because even if interfaces extend other interfaces these
     * super interfaces do not represent {@link Class#getSuperclass() super classes}.
     *
     * Similar, any primitive type or void will have no further hierarchy element but itself. Further, any array type
     * will provide {@link Object} as its immediate super class.
     * </p>
     *
     * <p>
     * Note, this method is {@code null} safe, though the returned iterator will provide no element at all.
     * </p>
     *
     * @param clazz
     *            the class to query its class hierarchy
     * @return an iterator of the given class' class hierarchy
     */
    public static final Iterator<Class<?>> classHierarchy(final Class<?> clazz) {
        return new Iterator<Class<?>>() {

            Class<?> current = clazz;

            @Override
            public boolean hasNext() {
                return this.current != null;
            }

            @Override
            public Class<?> next()
            throws NoSuchElementException {
                final Class<?> c = this.current;
                if (c == null) {
                    throw new NoSuchElementException();
                } else {
                    this.current = this.current.getSuperclass();
                    return c;
                }
            }

        };
    }

}
