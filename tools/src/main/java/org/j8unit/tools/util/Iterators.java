package org.j8unit.tools.util;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * <p>
 * Utility enum (aka. helper class) providing fancy {@link Iterator}/{@link Iterable} stuff.
 * </p>
 */
public enum Iterators {
    ;

    /**
     * <p>
     * Returns an {@linkplain Iterator iterator} that represents the given {@link Class entity}'s class hierarchy. In
     * detail, there are <strong>five cases</strong> to concern:
     * </p>
     *
     * <dl>
     * <dt>Case A: Class</dt>
     * <dd>If the given {@code entity} represents a class, the iterator provides the following elements: the class
     * itself, its super class, its super super class, its super super super class, and so on.
     *
     * If, finally, {@link Object} is reached, there will be no further super class and, thus, any execution of
     * {@link Iterator#hasNext()} will return {@code false} and any execution of {@link Iterator#next()} will cause a
     * {@link NoSuchElementException}.</dd>
     *
     * <dt>Case B: Interface</dt>
     * <dd>If the given {@code entity} {@linkplain Class#isInterface() represents an interface}, the iterator will
     * return the interface class itself and does not hold any further element.
     *
     * That is because even if interfaces extend other interfaces these super interfaces do not represent
     * {@linkplain Class#getSuperclass() super classes}.</dd>
     *
     * <dt>Cases C, D: Primitive, Void</dt>
     * <dd>Similar, any primitive type or {@code void} will have no other hierarchy element but itself.</dd>
     *
     * <dt>Case E: Array</dt> Further, any array type will provide {@link Object} as its immediate super class.</dd>
     * </dl>
     *
     * <p>
     * Note, this method is {@code null} safe, though the returned iterator will provide no element at all.
     * </p>
     *
     * @see Class#getSuperclass()
     *
     * @param entity
     *            the entity to query its class hierarchy
     * @return an iterator of the given {@code entity}'s class hierarchy
     */
    public static final Iterator<Class<?>> classHierarchy(final Class<?> entity) {
        return new Iterator<Class<?>>() {

            Class<?> current = entity;

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
