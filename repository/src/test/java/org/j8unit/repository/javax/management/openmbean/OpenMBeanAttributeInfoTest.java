package org.j8unit.repository.javax.management.openmbean;

import javax.management.openmbean.OpenMBeanAttributeInfo;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link OpenMBeanAttributeInfo} (by simply
 * reusing the J8Unit test interface
 * {@link org.j8unit.repository.javax.management.openmbean.OpenMBeanAttributeInfoTests}).
 */
@RunWith(J8Unit4.class)
public class OpenMBeanAttributeInfoTest
implements OpenMBeanAttributeInfoTests<OpenMBeanAttributeInfo> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.management.openmbean.OpenMBeanAttributeInfo]

    @Override
    public OpenMBeanAttributeInfo createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.management.openmbean.OpenMBeanAttributeInfo], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.management.openmbean.OpenMBeanAttributeInfo]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.management.openmbean.OpenMBeanAttributeInfo]

}
