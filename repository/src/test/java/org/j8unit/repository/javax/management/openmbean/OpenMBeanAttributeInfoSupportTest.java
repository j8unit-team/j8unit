package org.j8unit.repository.javax.management.openmbean;

import javax.management.openmbean.OpenMBeanAttributeInfoSupport;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link OpenMBeanAttributeInfoSupport} (by
 * simply reusing the J8Unit test interface {@link OpenMBeanAttributeInfoSupportTests}).
 */

@RunWith(J8Unit4.class)
public class OpenMBeanAttributeInfoSupportTest
implements OpenMBeanAttributeInfoSupportTests<OpenMBeanAttributeInfoSupport> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.management.openmbean.OpenMBeanAttributeInfoSupport]

    @Override
    public OpenMBeanAttributeInfoSupport createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.management.openmbean.OpenMBeanAttributeInfoSupport], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.management.openmbean.OpenMBeanAttributeInfoSupport]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.management.openmbean.OpenMBeanAttributeInfoSupport]

}
