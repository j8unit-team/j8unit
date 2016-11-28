package org.j8unit.repository.javax.management;

import javax.management.MBeanRegistration;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link MBeanRegistration} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.javax.management.MBeanRegistrationTests}).
 */
@RunWith(J8Unit4.class)
public class MBeanRegistrationTest
implements MBeanRegistrationTests<MBeanRegistration> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.management.MBeanRegistration]

    @Override
    public MBeanRegistration createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.management.MBeanRegistration], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.management.MBeanRegistration]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.management.MBeanRegistration]

}
