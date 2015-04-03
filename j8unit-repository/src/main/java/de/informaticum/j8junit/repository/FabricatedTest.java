package de.informaticum.j8junit.repository;

import java.util.function.Supplier;

@FunctionalInterface
public abstract interface FabricatedTest<T> {

    public abstract Supplier<T> factory();

    public default T getNewSubjectUnderTest() {
        final Supplier<T> factory = this.factory();
        assert factory != null;
        final T sut = factory.get();
        assert sut != null;
        return sut;
    }

}
