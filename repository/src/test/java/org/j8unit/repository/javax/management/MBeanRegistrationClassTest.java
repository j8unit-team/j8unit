package org.j8unit.repository.javax.management;

import javax.management.MBeanRegistration;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link MBeanRegistration} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.management.MBeanRegistrationClassTests}).
 */

@RunWith(J8Unit4.class)
public class MBeanRegistrationClassTest
implements MBeanRegistrationClassTests<MBeanRegistration> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.management.MBeanRegistration]

    @Override
    public Class<MBeanRegistration> createNewSUT() {
        return MBeanRegistration.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.management.MBeanRegistration]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.management.MBeanRegistration]

}
