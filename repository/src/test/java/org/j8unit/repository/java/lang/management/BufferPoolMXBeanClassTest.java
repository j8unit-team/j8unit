package org.j8unit.repository.java.lang.management;

import java.lang.management.BufferPoolMXBean;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link BufferPoolMXBean} (by simply reusing the
 * J8Unit test interface {@link BufferPoolMXBeanClassTests}).
 */

@RunWith(J8Unit4.class)
public class BufferPoolMXBeanClassTest
implements BufferPoolMXBeanClassTests<BufferPoolMXBean> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.lang.management.BufferPoolMXBean]

    @Override
    public Class<BufferPoolMXBean> createNewSUT() {
        return BufferPoolMXBean.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.lang.management.BufferPoolMXBean]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.lang.management.BufferPoolMXBean]

}
