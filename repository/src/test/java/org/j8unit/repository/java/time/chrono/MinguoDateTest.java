package org.j8unit.repository.java.time.chrono;

import java.time.chrono.MinguoDate;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class MinguoDateTest
implements org.j8unit.repository.java.time.chrono.MinguoDateTests<MinguoDate> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.time.chrono.MinguoDate]

    @Override
    public MinguoDate createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.time.chrono.MinguoDate], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.time.chrono.MinguoDate]

}
