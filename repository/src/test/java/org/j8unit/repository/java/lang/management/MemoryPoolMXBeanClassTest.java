package org.j8unit.repository.java.lang.management;

import java.lang.management.MemoryPoolMXBean;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link MemoryPoolMXBean} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.lang.management.MemoryPoolMXBeanClassTests}).
 */
@RunWith(J8Unit4.class)
public class MemoryPoolMXBeanClassTest
implements MemoryPoolMXBeanClassTests<MemoryPoolMXBean> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.lang.management.MemoryPoolMXBean]

    @Override
    public Class<MemoryPoolMXBean> createNewSUT() {
        return MemoryPoolMXBean.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.lang.management.MemoryPoolMXBean]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.lang.management.MemoryPoolMXBean]

}
