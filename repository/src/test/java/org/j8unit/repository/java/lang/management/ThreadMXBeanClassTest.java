package org.j8unit.repository.java.lang.management;

import java.lang.management.ThreadMXBean;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ThreadMXBeanClassTest
implements org.j8unit.repository.java.lang.management.ThreadMXBeanClassTests<ThreadMXBean> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.lang.management.ThreadMXBean]

    @Override
    public Class<ThreadMXBean> createNewSUT() {
        return ThreadMXBean.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.lang.management.ThreadMXBean]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.lang.management.ThreadMXBean]

}
