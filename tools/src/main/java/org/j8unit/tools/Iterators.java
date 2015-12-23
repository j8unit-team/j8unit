package org.j8unit.tools;

import java.util.Iterator;
import java.util.NoSuchElementException;

final class Iterators {

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
