package org.j8unit.repository.javax.management.openmbean;

import javax.management.openmbean.OpenMBeanInfo;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link OpenMBeanInfo} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.management.openmbean.OpenMBeanInfoTests}).
 */

@RunWith(J8Unit4.class)
public class OpenMBeanInfoTest
implements OpenMBeanInfoTests<OpenMBeanInfo> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.management.openmbean.OpenMBeanInfo]

    @Override
    public OpenMBeanInfo createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.management.openmbean.OpenMBeanInfo], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.management.openmbean.OpenMBeanInfo]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.management.openmbean.OpenMBeanInfo]

}
