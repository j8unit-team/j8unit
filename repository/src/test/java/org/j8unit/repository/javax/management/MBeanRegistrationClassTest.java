package org.j8unit.repository.javax.management;

import javax.management.MBeanRegistration;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class MBeanRegistrationClassTest
implements org.j8unit.repository.javax.management.MBeanRegistrationClassTests<MBeanRegistration> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.management.MBeanRegistration]

    @Override
    public Class<MBeanRegistration> createNewSUT() {
        return MBeanRegistration.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.management.MBeanRegistration]

}
