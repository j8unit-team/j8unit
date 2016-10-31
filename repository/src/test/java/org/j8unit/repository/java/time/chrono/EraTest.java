package org.j8unit.repository.java.time.chrono;

import java.time.chrono.Era;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class EraTest
implements org.j8unit.repository.java.time.chrono.EraTests<Era> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.time.chrono.Era]

    @Override
    public Era createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.time.chrono.Era], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.time.chrono.Era]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.time.chrono.Era]

}
