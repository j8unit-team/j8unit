package org.j8unit.repository.javax.management;

import javax.management.MBeanServerDelegateMBean;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class MBeanServerDelegateMBeanTest
implements org.j8unit.repository.javax.management.MBeanServerDelegateMBeanTests<MBeanServerDelegateMBean> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.management.MBeanServerDelegateMBean]

    @Override
    public MBeanServerDelegateMBean createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.management.MBeanServerDelegateMBean], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.management.MBeanServerDelegateMBean]

}
