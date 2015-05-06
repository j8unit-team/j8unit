package de.informaticum.j8junit.repository.java.lang;

import static org.junit.Assert.assertNotNull;
import org.junit.Test;
import de.informaticum.j8junit.repository.J8UnitTest;

@FunctionalInterface
public abstract interface IterableTests<I extends Iterable<E>, E>
extends J8UnitTest<I> {

    @Test
    public default void testNonNullIterator() {
        final I sut = this.getNewSubjectUnderTest();
        assertNotNull(sut.iterator());
    }

}
