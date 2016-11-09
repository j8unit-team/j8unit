package org.j8unit.repository.java.lang.management;

import java.lang.management.PlatformLoggingMXBean;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link PlatformLoggingMXBean} (by simply
 * reusing the J8Unit test interface {@link PlatformLoggingMXBeanTests}).
 */

@RunWith(J8Unit4.class)
public class PlatformLoggingMXBeanTest
implements PlatformLoggingMXBeanTests<PlatformLoggingMXBean> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.lang.management.PlatformLoggingMXBean]

    @Override
    public PlatformLoggingMXBean createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.lang.management.PlatformLoggingMXBean], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.lang.management.PlatformLoggingMXBean]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.lang.management.PlatformLoggingMXBean]

}
