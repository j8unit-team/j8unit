package org.j8unit.repository.java.lang.management;

import java.lang.management.BufferPoolMXBean;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link BufferPoolMXBean} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.java.lang.management.BufferPoolMXBeanTests}).
 */

@RunWith(J8Unit4.class)
public class BufferPoolMXBeanTest
implements BufferPoolMXBeanTests<BufferPoolMXBean> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.lang.management.BufferPoolMXBean]

    @Override
    public BufferPoolMXBean createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.lang.management.BufferPoolMXBean], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.lang.management.BufferPoolMXBean]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.lang.management.BufferPoolMXBean]

}
