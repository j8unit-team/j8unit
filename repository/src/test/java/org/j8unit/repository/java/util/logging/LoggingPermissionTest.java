package org.j8unit.repository.java.util.logging;

import java.util.logging.LoggingPermission;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link LoggingPermission} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.java.util.logging.LoggingPermissionTests}).
 */

@RunWith(J8Unit4.class)
public class LoggingPermissionTest
implements LoggingPermissionTests<LoggingPermission> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.logging.LoggingPermission]

    @Override
    public LoggingPermission createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.util.logging.LoggingPermission], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.util.logging.LoggingPermission]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.util.logging.LoggingPermission]

}
