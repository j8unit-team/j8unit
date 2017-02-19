package some.reusable.j8unit.test.repository.java.lang;

import static org.junit.Assert.assertEquals;
import org.j8unit.J8UnitTest;
import org.junit.Test;

public abstract interface CharSequenceTests<SUT extends CharSequence>
extends J8UnitTest<SUT> {

    @Test
    public default void charSequenceMustEqualLength() {
        final SUT sut = this.createNewSUT();
        assert sut != null;
        assertEquals(sut.length(), sut.chars().count());
    }

}
