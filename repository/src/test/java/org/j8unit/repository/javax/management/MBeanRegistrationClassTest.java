package org.j8unit.repository.javax.management;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class MBeanRegistrationClassTest
implements org.j8unit.repository.javax.management.MBeanRegistrationClassTests<javax.management.MBeanRegistration> {

    @Override
    public Class<javax.management.MBeanRegistration> createNewSUT() {
        return javax.management.MBeanRegistration.class;
    }

}
