package org.j8unit.repository.javax.management;

import javax.management.MBeanRegistrationException;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link MBeanRegistrationException} (by
 * simply reusing the J8Unit test interface {@link MBeanRegistrationExceptionTests}).
 */

@RunWith(J8Unit4.class)
public class MBeanRegistrationExceptionTest
implements MBeanRegistrationExceptionTests<MBeanRegistrationException> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.management.MBeanRegistrationException]

    @Override
    public MBeanRegistrationException createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.management.MBeanRegistrationException], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.management.MBeanRegistrationException]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.management.MBeanRegistrationException]

}
