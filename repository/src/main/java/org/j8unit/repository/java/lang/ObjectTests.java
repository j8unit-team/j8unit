package org.j8unit.repository.java.lang;

import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import org.j8unit.SupplierBasedJ8UnitTest;
import org.junit.Test;

@FunctionalInterface
public abstract interface ObjectTests<SUT extends Object>
extends SupplierBasedJ8UnitTest<SUT> {

    @Test
    public default void toStringMustReturnNotNull() {
        final SUT sut = this.createNewSUT();
        assertNotNull(sut.toString());
    }

    @Test
    public default void testNonZeroHashcode() {
        final SUT sut = this.createNewSUT();
        assertNotEquals(0, sut.hashCode());
    }

    @Test
    public default void testReflexiveEquals() {
        final SUT sut = this.createNewSUT();
        assertTrue(sut.equals(sut));
    }

}
