package de.informaticum.j8junit.repository.java.lang;

import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import org.junit.Test;
import de.informaticum.j8junit.repository.J8UnitTest;

@FunctionalInterface
public abstract interface ObjectTests<SUT extends Object>
extends J8UnitTest<SUT> {

    @Test
    public default void toStringMustReturnNotNull() {
        final SUT sut = this.getNewSubjectUnderTest();
        assertNotNull(sut.toString());
    }

    @Test
    public default void testNonZeroHashcode() {
        final SUT sut = this.getNewSubjectUnderTest();
        assertNotEquals(0, sut.hashCode());
    }

    @Test
    public default void testReflexiveEquals() {
        final SUT sut = this.getNewSubjectUnderTest();
        assertTrue(sut.equals(sut));
    }

}
