package org.j8unit.repository.java.lang.management;

import java.lang.management.GarbageCollectorMXBean;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link GarbageCollectorMXBean} (by simply
 * reusing the J8Unit test interface
 * {@link org.j8unit.repository.java.lang.management.GarbageCollectorMXBeanClassTests}).
 */
@RunWith(J8Unit4.class)
public class GarbageCollectorMXBeanClassTest
implements GarbageCollectorMXBeanClassTests<GarbageCollectorMXBean> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.lang.management.GarbageCollectorMXBean]

    @Override
    public Class<GarbageCollectorMXBean> createNewSUT() {
        return GarbageCollectorMXBean.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.lang.management.GarbageCollectorMXBean]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.lang.management.GarbageCollectorMXBean]

}
