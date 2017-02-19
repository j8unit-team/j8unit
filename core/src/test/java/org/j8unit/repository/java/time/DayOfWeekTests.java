package org.j8unit.repository.java.time;

import static org.junit.Assert.assertEquals;
import java.time.DayOfWeek;
import org.j8unit.J8UnitTest;
import org.junit.Test;

public abstract interface DayOfWeekTests<SUT extends DayOfWeek>
extends J8UnitTest<SUT> {

    @Test
    public default void dayOfNextWeekIsSimilar() {
        final SUT sut = this.createNewSUT();
        assert sut != null;
        assertEquals(sut, sut.plus(7));
    }

}
