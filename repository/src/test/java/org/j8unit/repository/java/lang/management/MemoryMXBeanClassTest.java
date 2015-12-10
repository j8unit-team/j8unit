package org.j8unit.repository.java.lang.management;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class MemoryMXBeanClassTest
implements org.j8unit.repository.java.lang.management.MemoryMXBeanClassTests<java.lang.management.MemoryMXBean> {

    @Override
    public Class<java.lang.management.MemoryMXBean> createNewSUT() {
        return java.lang.management.MemoryMXBean.class;
    }

}
