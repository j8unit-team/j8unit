package org.j8unit.repository.javax.management.openmbean;

import javax.management.openmbean.OpenMBeanConstructorInfo;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link OpenMBeanConstructorInfo} (by simply
 * reusing the J8Unit test interface
 * {@link org.j8unit.repository.javax.management.openmbean.OpenMBeanConstructorInfoTests}).
 */
@RunWith(J8Unit4.class)
public class OpenMBeanConstructorInfoTest
implements OpenMBeanConstructorInfoTests<OpenMBeanConstructorInfo> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.management.openmbean.OpenMBeanConstructorInfo]

    @Override
    public OpenMBeanConstructorInfo createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.management.openmbean.OpenMBeanConstructorInfo], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.management.openmbean.OpenMBeanConstructorInfo]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.management.openmbean.OpenMBeanConstructorInfo]

}
