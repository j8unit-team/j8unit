package org.j8unit.repository.java.util.logging;

import java.util.logging.LoggingMXBean;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link LoggingMXBean} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.util.logging.LoggingMXBeanClassTests}).
 */

@RunWith(J8Unit4.class)
public class LoggingMXBeanClassTest
implements LoggingMXBeanClassTests<LoggingMXBean> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.util.logging.LoggingMXBean]

    @Override
    public Class<LoggingMXBean> createNewSUT() {
        return LoggingMXBean.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.util.logging.LoggingMXBean]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.util.logging.LoggingMXBean]

}
