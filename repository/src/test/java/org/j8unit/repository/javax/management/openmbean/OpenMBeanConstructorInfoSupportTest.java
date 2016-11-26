package org.j8unit.repository.javax.management.openmbean;

import javax.management.openmbean.OpenMBeanConstructorInfoSupport;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link OpenMBeanConstructorInfoSupport} (by
 * simply reusing the J8Unit test interface
 * {@link org.j8unit.repository.javax.management.openmbean.OpenMBeanConstructorInfoSupportTests}).
 */
@RunWith(J8Unit4.class)
public class OpenMBeanConstructorInfoSupportTest
implements OpenMBeanConstructorInfoSupportTests<OpenMBeanConstructorInfoSupport> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.management.openmbean.OpenMBeanConstructorInfoSupport]

    @Override
    public OpenMBeanConstructorInfoSupport createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.management.openmbean.OpenMBeanConstructorInfoSupport], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.management.openmbean.OpenMBeanConstructorInfoSupport]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.management.openmbean.OpenMBeanConstructorInfoSupport]

}
