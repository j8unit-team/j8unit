package org.j8unit.generator.util;

import java.util.function.Supplier;

@FunctionalInterface
public abstract interface NameBasedSupplier<S>
extends Supplier<S> {

    public abstract S name();

    @Override
    public default S get() {
        return this.name();
    }

}
