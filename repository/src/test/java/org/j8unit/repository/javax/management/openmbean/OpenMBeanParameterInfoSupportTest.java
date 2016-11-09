package org.j8unit.repository.javax.management.openmbean;

import javax.management.openmbean.OpenMBeanParameterInfoSupport;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link OpenMBeanParameterInfoSupport} (by
 * simply reusing the J8Unit test interface {@link OpenMBeanParameterInfoSupportTests}).
 */

@RunWith(J8Unit4.class)
public class OpenMBeanParameterInfoSupportTest
implements OpenMBeanParameterInfoSupportTests<OpenMBeanParameterInfoSupport> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.management.openmbean.OpenMBeanParameterInfoSupport]

    @Override
    public OpenMBeanParameterInfoSupport createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.management.openmbean.OpenMBeanParameterInfoSupport], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.management.openmbean.OpenMBeanParameterInfoSupport]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.management.openmbean.OpenMBeanParameterInfoSupport]

}
