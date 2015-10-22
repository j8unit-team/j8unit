package org.j8unit.repository.java.lang;

import static org.junit.Assert.assertNotNull;
import org.j8unit.J8UnitTest;
import org.junit.Test;

@FunctionalInterface
public abstract interface IterableTests<I extends Iterable<E>, E>
extends J8UnitTest<I> {

    @Test
    public default void testNonNullIterator() {
        final I sut = this.getNewSubjectUnderTest();
        assertNotNull(sut.iterator());
    }

}
