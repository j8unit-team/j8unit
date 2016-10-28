package org.j8unit.repository.javax.management;

import javax.management.MXBean;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class MXBeanTest
implements org.j8unit.repository.javax.management.MXBeanTests<MXBean> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.management.MXBean]

    @Override
    public MXBean createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.management.MXBean], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.management.MXBean]

}
