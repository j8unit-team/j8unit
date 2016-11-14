package org.j8unit.repository.javax.management;

import javax.management.DynamicMBean;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link DynamicMBean} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.management.DynamicMBeanTests}).
 */

@RunWith(J8Unit4.class)
public class DynamicMBeanTest
implements DynamicMBeanTests<DynamicMBean> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.management.DynamicMBean]

    @Override
    public DynamicMBean createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.management.DynamicMBean], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.management.DynamicMBean]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.management.DynamicMBean]

}
