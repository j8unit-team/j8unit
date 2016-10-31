package org.j8unit.generator.util;

import java.util.function.Supplier;

/**
 * Extension of {@link Supplier} where the {@linkplain #get() supplied value} bases on a specific {@linkplain #name()
 * name attribute}. This extension is intended to be used by {@code enum} types but others may gain benefit as well.
 *
 * @param <T>
 *            the type of the name attribute
 */
@FunctionalInterface
public abstract interface NameBasedSupplier<T>
extends Supplier<T> {

    /**
     * The name attribute of {@code this} instance.
     *
     * @return name attribute of {@code this} instance
     */
    public abstract T name();

    /**
     * @implSpec Returns the {@linkplain #name() name} of {@code this} instance.
     */
    @Override
    public default T get() {
        return this.name();
    }

}
