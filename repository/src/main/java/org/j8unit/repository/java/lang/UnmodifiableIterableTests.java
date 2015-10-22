package org.j8unit.repository.java.lang;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assume.assumeTrue;
import java.util.Iterator;
import org.junit.Test;

@FunctionalInterface
public abstract interface UnmodifiableIterableTests<UI extends Iterable<E>, E>
extends IterableTests<UI, E> {

    @Test(expected = UnsupportedOperationException.class)
    public default void testForbiddenRemoveViaIterator() {
        final UI sut = this.createNewSUT();
        final Iterator<E> iterator = sut.iterator();
        assertNotNull(iterator);
        assumeTrue("The given Iterable subject returned an Iterator without any next element.", iterator.hasNext());
        iterator.next();
        iterator.remove();
    }
}
