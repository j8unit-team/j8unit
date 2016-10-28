package org.j8unit.repository.java.lang.management;

import java.lang.management.OperatingSystemMXBean;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class OperatingSystemMXBeanClassTest
implements org.j8unit.repository.java.lang.management.OperatingSystemMXBeanClassTests<OperatingSystemMXBean> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.lang.management.OperatingSystemMXBean]

    @Override
    public Class<OperatingSystemMXBean> createNewSUT() {
        return OperatingSystemMXBean.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.lang.management.OperatingSystemMXBean]

}
