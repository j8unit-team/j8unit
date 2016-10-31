package org.j8unit.repository.javax.management;

import javax.management.StandardMBean;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class StandardMBeanTest
implements org.j8unit.repository.javax.management.StandardMBeanTests<StandardMBean> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.management.StandardMBean]

    @Override
    public StandardMBean createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.management.StandardMBean], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.management.StandardMBean]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.management.StandardMBean]

}
