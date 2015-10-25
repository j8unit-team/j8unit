package org.j8unit.repository.java.lang;

import java.util.Iterator;
import org.junit.Assert;
import org.junit.Assume;
import org.junit.Test;

@FunctionalInterface
public abstract interface UnmodifiableIterableTests<UI extends Iterable<E>, E>
extends IterableTests<UI, E> {

    @Test(expected = UnsupportedOperationException.class)
    public default void testUnsupportedRemoveViaIterator() {
        final UI sut = this.createNewSUT();
        final Iterator<E> iterator = sut.iterator();
        Assert.assertNotNull(iterator);
        Assume.assumeTrue("The given Iterable subject returned an Iterator without any next element.", iterator.hasNext());
        iterator.next();
        iterator.remove();
    }

}
