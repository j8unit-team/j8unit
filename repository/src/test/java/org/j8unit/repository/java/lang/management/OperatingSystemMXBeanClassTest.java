package org.j8unit.repository.java.lang.management;

import java.lang.management.OperatingSystemMXBean;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link OperatingSystemMXBean} (by simply reusing
 * the J8Unit test interface {@link OperatingSystemMXBeanClassTests}).
 */

@RunWith(J8Unit4.class)
public class OperatingSystemMXBeanClassTest
implements OperatingSystemMXBeanClassTests<OperatingSystemMXBean> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.lang.management.OperatingSystemMXBean]

    @Override
    public Class<OperatingSystemMXBean> createNewSUT() {
        return OperatingSystemMXBean.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.lang.management.OperatingSystemMXBean]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.lang.management.OperatingSystemMXBean]

}
