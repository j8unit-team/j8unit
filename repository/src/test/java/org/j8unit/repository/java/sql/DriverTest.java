package org.j8unit.repository.java.sql;

import java.sql.Driver;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DriverTest
implements org.j8unit.repository.java.sql.DriverTests<Driver> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.sql.Driver]

    @Override
    public Driver createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.sql.Driver], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.sql.Driver]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.sql.Driver]

}
