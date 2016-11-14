package org.j8unit.repository.java.sql;

import java.sql.DriverPropertyInfo;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link DriverPropertyInfo} (by simply
 * reusing the J8Unit test interface {@link org.j8unit.repository.java.sql.DriverPropertyInfoTests}).
 */

@RunWith(J8Unit4.class)
public class DriverPropertyInfoTest
implements DriverPropertyInfoTests<DriverPropertyInfo> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.sql.DriverPropertyInfo]

    @Override
    public DriverPropertyInfo createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.sql.DriverPropertyInfo], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.sql.DriverPropertyInfo]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.sql.DriverPropertyInfo]

}
