package de.informaticum.j8junit.repository.java.lang;

import static org.junit.Assert.assertNotNull;
import org.junit.Test;
import de.informaticum.j8junit.repository.FabricatedTest;

@FunctionalInterface
public abstract interface IterableTests<I extends Iterable<E>, E>
extends FabricatedTest<I> {

    @Test
    public default void testNonNullIterator() {
        final I sut = this.getNewSubjectUnderTest();
        assertNotNull(sut.iterator());
    }

}
