package some.reusable.j8unit.test.repository.java.lang;

import static org.junit.Assert.assertNotNull;
import org.j8unit.J8UnitTest;
import org.junit.Test;

public abstract interface ObjectTests<SUT extends Object>
extends J8UnitTest<SUT> {

    @Test
    public default void toStringMustReturnNotNull() {
        final SUT sut = this.createNewSUT();
        assert sut != null;
        assertNotNull(sut.toString());
    }

}
