package org.j8unit.repository.java.sql;

import java.sql.DriverPropertyInfo;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DriverPropertyInfoTest
implements org.j8unit.repository.java.sql.DriverPropertyInfoTests<DriverPropertyInfo> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.sql.DriverPropertyInfo]

    @Override
    public DriverPropertyInfo createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.sql.DriverPropertyInfo], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.sql.DriverPropertyInfo]

}
