package org.j8unit.repository.java.sql;

import java.sql.DriverAction;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DriverActionTest
implements org.j8unit.repository.java.sql.DriverActionTests<DriverAction> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.sql.DriverAction]

    @Override
    public DriverAction createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.sql.DriverAction], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.sql.DriverAction]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.sql.DriverAction]

}
