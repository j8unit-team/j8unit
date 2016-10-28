package org.j8unit.repository.javax.management.loading;

import javax.management.loading.MLetMBean;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class MLetMBeanTest
implements org.j8unit.repository.javax.management.loading.MLetMBeanTests<MLetMBean> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.management.loading.MLetMBean]

    @Override
    public MLetMBean createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.management.loading.MLetMBean], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.management.loading.MLetMBean]

}
