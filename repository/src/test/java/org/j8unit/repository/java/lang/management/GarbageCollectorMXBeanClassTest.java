package org.j8unit.repository.java.lang.management;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class GarbageCollectorMXBeanClassTest
implements org.j8unit.repository.java.lang.management.GarbageCollectorMXBeanClassTests<java.lang.management.GarbageCollectorMXBean> {

    @Override
    public Class<java.lang.management.GarbageCollectorMXBean> createNewSUT() {
        return java.lang.management.GarbageCollectorMXBean.class;
    }

}
