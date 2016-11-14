package org.j8unit.repository.java.util.logging;

import java.util.logging.LoggingMXBean;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link LoggingMXBean} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.util.logging.LoggingMXBeanTests}).
 */

@RunWith(J8Unit4.class)
public class LoggingMXBeanTest
implements LoggingMXBeanTests<LoggingMXBean> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.logging.LoggingMXBean]

    @Override
    public LoggingMXBean createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.util.logging.LoggingMXBean], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.util.logging.LoggingMXBean]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.util.logging.LoggingMXBean]

}
