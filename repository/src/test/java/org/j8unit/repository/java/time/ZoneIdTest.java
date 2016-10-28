package org.j8unit.repository.java.time;

import java.time.ZoneId;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ZoneIdTest
implements org.j8unit.repository.java.time.ZoneIdTests<ZoneId> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.time.ZoneId]

    @Override
    public ZoneId createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.time.ZoneId], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.time.ZoneId]

}
