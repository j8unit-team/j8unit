package org.j8unit.repository.java.lang.management;

import java.lang.management.MemoryManagerMXBean;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link MemoryManagerMXBean} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.java.lang.management.MemoryManagerMXBeanClassTests}).
 */
@RunWith(J8Unit4.class)
public class MemoryManagerMXBeanClassTest
implements MemoryManagerMXBeanClassTests<MemoryManagerMXBean> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.lang.management.MemoryManagerMXBean]

    @Override
    public Class<MemoryManagerMXBean> createNewSUT() {
        return MemoryManagerMXBean.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.lang.management.MemoryManagerMXBean]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.lang.management.MemoryManagerMXBean]

}
