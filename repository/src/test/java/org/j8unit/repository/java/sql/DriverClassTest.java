package org.j8unit.repository.java.sql;

import java.sql.Driver;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link Driver} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.java.sql.DriverClassTests}).
 */

@RunWith(J8Unit4.class)
public class DriverClassTest
implements DriverClassTests<Driver> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.sql.Driver]

    @Override
    public Class<Driver> createNewSUT() {
        return Driver.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.sql.Driver]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.sql.Driver]

}
