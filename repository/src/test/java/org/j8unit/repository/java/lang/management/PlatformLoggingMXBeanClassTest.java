package org.j8unit.repository.java.lang.management;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class PlatformLoggingMXBeanClassTest
implements org.j8unit.repository.java.lang.management.PlatformLoggingMXBeanClassTests<java.lang.management.PlatformLoggingMXBean> {

    @Override
    public Class<java.lang.management.PlatformLoggingMXBean> createNewSUT() {
        return java.lang.management.PlatformLoggingMXBean.class;
    }

}