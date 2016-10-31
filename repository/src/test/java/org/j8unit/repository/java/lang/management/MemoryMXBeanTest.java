package org.j8unit.repository.java.lang.management;

import java.lang.management.MemoryMXBean;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class MemoryMXBeanTest
implements org.j8unit.repository.java.lang.management.MemoryMXBeanTests<MemoryMXBean> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.lang.management.MemoryMXBean]

    @Override
    public MemoryMXBean createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.lang.management.MemoryMXBean], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.lang.management.MemoryMXBean]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.lang.management.MemoryMXBean]

}
