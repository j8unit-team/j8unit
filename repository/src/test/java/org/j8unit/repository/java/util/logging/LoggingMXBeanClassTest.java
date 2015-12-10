package org.j8unit.repository.java.util.logging;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class LoggingMXBeanClassTest
implements org.j8unit.repository.java.util.logging.LoggingMXBeanClassTests<java.util.logging.LoggingMXBean> {

    @Override
    public Class<java.util.logging.LoggingMXBean> createNewSUT() {
        return java.util.logging.LoggingMXBean.class;
    }

}
