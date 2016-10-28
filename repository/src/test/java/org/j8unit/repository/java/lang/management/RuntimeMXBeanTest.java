package org.j8unit.repository.java.lang.management;

import java.lang.management.RuntimeMXBean;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class RuntimeMXBeanTest
implements org.j8unit.repository.java.lang.management.RuntimeMXBeanTests<RuntimeMXBean> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.lang.management.RuntimeMXBean]

    @Override
    public RuntimeMXBean createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.lang.management.RuntimeMXBean], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.lang.management.RuntimeMXBean]

}
