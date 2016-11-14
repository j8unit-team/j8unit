package org.j8unit.repository.java.sql;

import java.sql.DriverManager;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link DriverManager} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.sql.DriverManagerTests}).
 */

@RunWith(J8Unit4.class)
public class DriverManagerTest
implements DriverManagerTests<DriverManager> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.sql.DriverManager]

    @Override
    public DriverManager createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.sql.DriverManager], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.sql.DriverManager]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.sql.DriverManager]

}
