package org.j8unit.repository.java.lang.management;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class MemoryPoolMXBeanClassTest
implements org.j8unit.repository.java.lang.management.MemoryPoolMXBeanClassTests<java.lang.management.MemoryPoolMXBean> {

    @Override
    public Class<java.lang.management.MemoryPoolMXBean> createNewSUT() {
        return java.lang.management.MemoryPoolMXBean.class;
    }

}
