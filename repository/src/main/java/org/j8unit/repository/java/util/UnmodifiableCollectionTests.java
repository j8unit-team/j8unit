package org.j8unit.repository.java.util;

import java.util.Collection;
import java.util.Collections;
import org.j8unit.repository.java.lang.UnmodifiableIterableTests;
import org.junit.Test;

@FunctionalInterface
public interface UnmodifiableCollectionTests<UC extends Collection<E>, E>
extends UnmodifiableIterableTests<UC, E>, CollectionTests<UC, E> {

    @Test(expected = UnsupportedOperationException.class)
    public default void testUnsupportedAdd() {
        final UC sut = this.createNewSUT();
        assert sut != null;
        final E element = null;
        sut.add(element);
    }

    @Test(expected = UnsupportedOperationException.class)
    public default void testUnsupportedAddAll() {
        final UC sut = this.createNewSUT();
        assert sut != null;
        sut.addAll(sut);
    }

    @Test(expected = UnsupportedOperationException.class)
    public default void testUnsupportedClear() {
        final UC sut = this.createNewSUT();
        assert sut != null;
        sut.clear();
    }

    @Test(expected = UnsupportedOperationException.class)
    public default void testUnsupportedRemove() {
        final UC sut = this.createNewSUT();
        assert sut != null;
        final E element = null;
        sut.remove(element);
    }

    @Test(expected = UnsupportedOperationException.class)
    public default void testUnsupportedRemoveAll() {
        final UC sut = this.createNewSUT();
        assert sut != null;
        sut.removeAll(sut);
    }

    @Test(expected = UnsupportedOperationException.class)
    public default void testUnsupportedRemoveIf() {
        final UC sut = this.createNewSUT();
        assert sut != null;
        sut.removeIf(e -> true);
    }

    @Test(expected = UnsupportedOperationException.class)
    public default void testUnsupportedRetainAll() {
        final UC sut = this.createNewSUT();
        assert sut != null;
        sut.retainAll(Collections.emptyList());
    }

}
