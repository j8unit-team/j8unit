package org.j8unit.repository.java.util.logging;

import java.util.logging.LoggingMXBean;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class LoggingMXBeanTest
implements org.j8unit.repository.java.util.logging.LoggingMXBeanTests<LoggingMXBean> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.logging.LoggingMXBean]

    @Override
    public LoggingMXBean createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.util.logging.LoggingMXBean], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.logging.LoggingMXBean]

}
