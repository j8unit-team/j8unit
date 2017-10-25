package org.j8unit.generator.util;

import java.util.Map;

public abstract interface NamedElement<V>
extends Map.Entry<String, V> {

    public abstract String name();

    @Override
    default String getKey() {
        return this.name();
    }

    @Override
    default V setValue(final V value) {
        throw new UnsupportedOperationException("The <tt>put</tt> operation is not supported by the backing element.");
    }

}