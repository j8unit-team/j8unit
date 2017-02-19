package org.j8unit.repository.java.lang;

import org.j8unit.J8UnitTest;
import org.junit.Test;

public abstract interface ComparableTests<SUT extends Comparable<T>, T>
extends J8UnitTest<SUT> {

    @Test(expected = NullPointerException.class)
    public default void compareToNullMustThrowNullPointerException() {
        final SUT sut = this.createNewSUT();
        assert sut != null;
        sut.compareTo(null);
    }

}
