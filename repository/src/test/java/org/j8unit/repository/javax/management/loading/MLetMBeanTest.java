package org.j8unit.repository.javax.management.loading;

import javax.management.loading.MLetMBean;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link MLetMBean} (by simply reusing the
 * J8Unit test interface {@link MLetMBeanTests}).
 */

@RunWith(J8Unit4.class)
public class MLetMBeanTest
implements MLetMBeanTests<MLetMBean> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.management.loading.MLetMBean]

    @Override
    public MLetMBean createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.management.loading.MLetMBean], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.management.loading.MLetMBean]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.management.loading.MLetMBean]

}
