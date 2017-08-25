package org.j8unit.generator.util;

import java.util.AbstractMap.SimpleImmutableEntry;
import java.util.Map.Entry;

/**
 * <p>
 * Utility enum (aka. helper class) providing fancy {@link java.util.Map}/{@link java.util.Map.Entry} stuff.
 * </p>
 */
public enum Maps {
    ;

    /**
     * Returns an immutable {@linkplain java.util.Map.Entry entry} with the specified {@code key} and the specified
     * {@code value}.
     *
     * @param key
     *            the {@link java.util.Map.Entry#getKey() key} of the new entry
     * @param value
     *            the {@link java.util.Map.Entry#getValue() value} of the new entry
     * @param <K>
     *            the type of the key
     * @param <V>
     *            the type of the value
     * @return an entry with the specified {@code key} and the specified {@code value}
     */
    public static final <K, V> Entry<K, V> entry(final K key, final V value) {
        return new SimpleImmutableEntry<>(key, value);
    }

}
