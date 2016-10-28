package org.j8unit.repository.java.lang.management;

import java.lang.management.PlatformLoggingMXBean;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class PlatformLoggingMXBeanClassTest
implements org.j8unit.repository.java.lang.management.PlatformLoggingMXBeanClassTests<PlatformLoggingMXBean> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.lang.management.PlatformLoggingMXBean]

    @Override
    public Class<PlatformLoggingMXBean> createNewSUT() {
        return PlatformLoggingMXBean.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.lang.management.PlatformLoggingMXBean]

}
