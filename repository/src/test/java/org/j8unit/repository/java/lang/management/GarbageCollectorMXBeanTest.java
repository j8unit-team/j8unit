package org.j8unit.repository.java.lang.management;

import java.lang.management.GarbageCollectorMXBean;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class GarbageCollectorMXBeanTest
implements org.j8unit.repository.java.lang.management.GarbageCollectorMXBeanTests<GarbageCollectorMXBean> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.lang.management.GarbageCollectorMXBean]

    @Override
    public GarbageCollectorMXBean createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.lang.management.GarbageCollectorMXBean], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.lang.management.GarbageCollectorMXBean]

}
