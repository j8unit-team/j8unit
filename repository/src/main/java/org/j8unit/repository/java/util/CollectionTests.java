package org.j8unit.repository.java.util;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;
import java.util.Collection;
import java.util.Iterator;
import org.j8unit.repository.java.lang.IterableTests;
import org.junit.Test;

@FunctionalInterface
public abstract interface CollectionTests<C extends Collection<E>, E>
extends IterableTests<C, E> {

    @Test
    public default void testIteratorAccordingToIsEmpty() {
        final C sut = this.createNewSUT();
        assert sut != null;
        final Iterator<E> iterator = sut.iterator();
        if (sut.isEmpty()) {
            assertFalse(iterator.hasNext());
        } else {
            assertTrue(iterator.hasNext());
        }
    }

    @Test
    public default void testNonNegativeSize() {
        final C sut = this.createNewSUT();
        assert sut != null;
        assertFalse(sut.size() < 0);
    }

    @Test
    public default void testSizeAccordingToIsEmpty() {
        final C sut = this.createNewSUT();
        assert sut != null;
        if (sut.isEmpty()) {
            assertEquals(0, sut.size());
        } else {
            assertNotEquals(0, sut.size());
        }
    }

    @Test
    public default void testToArraySize() {
        final C sut = this.createNewSUT();
        assert sut != null;
        final Object[] array = sut.toArray();
        assertEquals(sut.size(), array.length);
    }

}
