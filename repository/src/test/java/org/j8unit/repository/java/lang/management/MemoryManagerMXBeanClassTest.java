package org.j8unit.repository.java.lang.management;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class MemoryManagerMXBeanClassTest
implements org.j8unit.repository.java.lang.management.MemoryManagerMXBeanClassTests<java.lang.management.MemoryManagerMXBean> {

    @Override
    public Class<java.lang.management.MemoryManagerMXBean> createNewSUT() {
        return java.lang.management.MemoryManagerMXBean.class;
    }

}
