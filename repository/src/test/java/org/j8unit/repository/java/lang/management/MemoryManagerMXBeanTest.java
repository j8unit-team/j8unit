package org.j8unit.repository.java.lang.management;

import java.lang.management.MemoryManagerMXBean;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class MemoryManagerMXBeanTest
implements org.j8unit.repository.java.lang.management.MemoryManagerMXBeanTests<MemoryManagerMXBean> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.lang.management.MemoryManagerMXBean]

    @Override
    public MemoryManagerMXBean createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.lang.management.MemoryManagerMXBean], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.lang.management.MemoryManagerMXBean]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.lang.management.MemoryManagerMXBean]

}
