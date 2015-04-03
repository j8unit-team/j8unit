package de.informaticum.j8junit.repository.java.util;

import java.util.Collection;
import java.util.Collections;
import org.junit.Test;
import de.informaticum.j8junit.repository.java.lang.UnmodifiableIterableTests;

public interface UnmodifiableCollectionTests<UC extends Collection<E>, E>
extends UnmodifiableIterableTests<UC, E>, CollectionTests<UC, E> {

    @Test(expected = UnsupportedOperationException.class)
    public default void testForbiddenAdd() {
        final UC sut = this.getNewSubjectUnderTest();
        final E element = null;
        sut.add(element);
    }

    @Test(expected = UnsupportedOperationException.class)
    public default void testForbiddenAddAll() {
        final UC sut = this.getNewSubjectUnderTest();
        sut.addAll(sut);
    }

    @Test(expected = UnsupportedOperationException.class)
    public default void testForbiddenRemove() {
        final UC sut = this.getNewSubjectUnderTest();
        final E element = null;
        sut.remove(element);
    }

    @Test(expected = UnsupportedOperationException.class)
    public default void testForbiddenRemoveAll() {
        final UC sut = this.getNewSubjectUnderTest();
        sut.removeAll(sut);
    }

    @Test(expected = UnsupportedOperationException.class)
    public default void testForbiddenRemoveIf() {
        final UC sut = this.getNewSubjectUnderTest();
        sut.removeIf(e -> true);
    }

    @Test(expected = UnsupportedOperationException.class)
    public default void testForbiddenRetainAll() {
        final UC sut = this.getNewSubjectUnderTest();
        sut.retainAll(Collections.emptyList());
    }

    @Test(expected = UnsupportedOperationException.class)
    public default void testForbiddenClear() {
        final UC sut = this.getNewSubjectUnderTest();
        sut.clear();
    }

}
