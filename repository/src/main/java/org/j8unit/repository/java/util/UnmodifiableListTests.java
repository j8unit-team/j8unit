package org.j8unit.repository.java.util;

import java.util.Comparator;
import java.util.List;
import java.util.function.UnaryOperator;
import org.junit.Test;

@FunctionalInterface
public abstract interface UnmodifiableListTests<UL extends List<E>, E>
extends UnmodifiableCollectionTests<UL, E>, ListTests<UL, E> {

    @Test(expected = UnsupportedOperationException.class)
    public default void testUnsupportedReplaceAll() {
        final UL sut = this.createNewSUT();
        assert sut != null;
        sut.replaceAll(UnaryOperator.identity());
    }

    @Test(expected = UnsupportedOperationException.class)
    public default void testUnsupportedSort() {
        final UL sut = this.createNewSUT();
        assert sut != null;
        sut.sort(Comparator.comparing(Object::toString));
    }

}
