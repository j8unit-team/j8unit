package org.j8unit.repository.java.lang.management;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ThreadMXBeanClassTest
implements org.j8unit.repository.java.lang.management.ThreadMXBeanClassTests<java.lang.management.ThreadMXBean> {

    @Override
    public Class<java.lang.management.ThreadMXBean> createNewSUT() {
        return java.lang.management.ThreadMXBean.class;
    }

}
