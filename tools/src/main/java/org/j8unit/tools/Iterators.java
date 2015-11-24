package org.j8unit.tools;

import java.util.Iterator;

final class Iterators {

    public static final Iterator<Class<?>> classHierarchy(final Class<?> clazz) {
        return new Iterator<Class<?>>() {

            Class<?> current = clazz;

            @Override
            public boolean hasNext() {
                return this.current != null;
            }

            @Override
            public Class<?> next() {
                final Class<?> c = this.current;
                this.current = this.current.getSuperclass();
                return c;
            }

        };
    }

}
