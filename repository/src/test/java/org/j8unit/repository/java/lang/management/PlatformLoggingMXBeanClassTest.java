package org.j8unit.repository.java.lang.management;

import java.lang.management.PlatformLoggingMXBean;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link PlatformLoggingMXBean} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.java.lang.management.PlatformLoggingMXBeanClassTests}).
 */
@RunWith(J8Unit4.class)
public class PlatformLoggingMXBeanClassTest
implements PlatformLoggingMXBeanClassTests<PlatformLoggingMXBean> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.lang.management.PlatformLoggingMXBean]

    @Override
    public Class<PlatformLoggingMXBean> createNewSUT() {
        return PlatformLoggingMXBean.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.lang.management.PlatformLoggingMXBean]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.lang.management.PlatformLoggingMXBean]

}
