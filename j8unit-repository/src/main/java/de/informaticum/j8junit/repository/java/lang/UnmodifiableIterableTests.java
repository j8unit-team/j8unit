package de.informaticum.j8junit.repository.java.lang;

import java.util.Iterator;
import org.junit.Test;

@FunctionalInterface
public abstract interface UnmodifiableIterableTests<UI extends Iterable<E>, E>
extends IterableTests<UI, E> {

    @Test(expected = UnsupportedOperationException.class)
    public default void testForbiddenRemoveViaIterator() {
        final UI sut = this.getNewSubjectUnderTest();
        final Iterator<E> iterator = sut.iterator();
        if (iterator.hasNext()) {
            iterator.next();
            iterator.remove();
        } else {
            throw new UnsupportedOperationException();
        }
    }

}
