package org.j8unit.repository.java.lang.management;

import java.lang.management.ThreadMXBean;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ThreadMXBeanTest
implements org.j8unit.repository.java.lang.management.ThreadMXBeanTests<ThreadMXBean> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.lang.management.ThreadMXBean]

    @Override
    public ThreadMXBean createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.lang.management.ThreadMXBean], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.lang.management.ThreadMXBean]

}
