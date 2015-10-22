package org.j8unit.repository.java.util;

import java.util.Comparator;
import java.util.List;
import java.util.function.UnaryOperator;
import org.junit.Test;

@FunctionalInterface
public abstract interface UnmodifiableListTests<L extends List<E>, E>
extends UnmodifiableCollectionTests<L, E>, ListTests<L, E> {

    @Test(expected = UnsupportedOperationException.class)
    public default void testForbiddenReplaceAll() {
        final L sut = this.createNewSUT();
        sut.replaceAll(UnaryOperator.identity());
    }

    @Test(expected = UnsupportedOperationException.class)
    public default void testForbiddenSort() {
        final L sut = this.createNewSUT();
        sut.sort(Comparator.comparing(Object::toString));
    }

}
