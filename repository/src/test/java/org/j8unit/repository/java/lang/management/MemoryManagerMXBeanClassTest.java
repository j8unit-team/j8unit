package org.j8unit.repository.java.lang.management;

import java.lang.management.MemoryManagerMXBean;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class MemoryManagerMXBeanClassTest
implements org.j8unit.repository.java.lang.management.MemoryManagerMXBeanClassTests<MemoryManagerMXBean> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.lang.management.MemoryManagerMXBean]

    @Override
    public Class<MemoryManagerMXBean> createNewSUT() {
        return MemoryManagerMXBean.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.lang.management.MemoryManagerMXBean]

}
