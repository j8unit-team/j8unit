package de.informaticum.j8junit.repository.java.lang;

import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import org.junit.Test;
import de.informaticum.j8junit.repository.FabricatedTest;

@FunctionalInterface
public abstract interface ObjectTests<T extends Object>
extends FabricatedTest<T> {

    @Test
    public default void testNonNullToString() {
        final T sut = this.getNewSubjectUnderTest();
        assertNotNull(sut.toString());
    }

    @Test
    public default void testNonZeroHashcode() {
        final T sut = this.getNewSubjectUnderTest();
        assertNotEquals(0, sut.hashCode());
    }

    @Test
    public default void testReflexiveEquals() {
        final T sut = this.getNewSubjectUnderTest();
        assertTrue(sut.equals(sut));
    }

}
