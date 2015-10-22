package org.j8unit.repository.java.util;

import java.util.Collection;
import java.util.Collections;
import org.j8unit.repository.java.lang.UnmodifiableIterableTests;
import org.junit.Test;

public interface UnmodifiableCollectionTests<UC extends Collection<E>, E>
extends UnmodifiableIterableTests<UC, E>, CollectionTests<UC, E> {

    @Test(expected = UnsupportedOperationException.class)
    public default void testForbiddenAdd() {
        final UC sut = this.createNewSUT();
        final E element = null;
        sut.add(element);
    }

    @Test(expected = UnsupportedOperationException.class)
    public default void testForbiddenAddAll() {
        final UC sut = this.createNewSUT();
        sut.addAll(sut);
    }

    @Test(expected = UnsupportedOperationException.class)
    public default void testForbiddenRemove() {
        final UC sut = this.createNewSUT();
        final E element = null;
        sut.remove(element);
    }

    @Test(expected = UnsupportedOperationException.class)
    public default void testForbiddenRemoveAll() {
        final UC sut = this.createNewSUT();
        sut.removeAll(sut);
    }

    @Test(expected = UnsupportedOperationException.class)
    public default void testForbiddenRemoveIf() {
        final UC sut = this.createNewSUT();
        sut.removeIf(e -> true);
    }

    @Test(expected = UnsupportedOperationException.class)
    public default void testForbiddenRetainAll() {
        final UC sut = this.createNewSUT();
        sut.retainAll(Collections.emptyList());
    }

    @Test(expected = UnsupportedOperationException.class)
    public default void testForbiddenClear() {
        final UC sut = this.createNewSUT();
        sut.clear();
    }

}
