package org.j8unit.repository.java.sql;

import java.sql.DriverAction;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link DriverAction} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.sql.DriverActionClassTests}).
 */

@RunWith(J8Unit4.class)
public class DriverActionClassTest
implements DriverActionClassTests<DriverAction> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.sql.DriverAction]

    @Override
    public Class<DriverAction> createNewSUT() {
        return DriverAction.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.sql.DriverAction]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.sql.DriverAction]

}
