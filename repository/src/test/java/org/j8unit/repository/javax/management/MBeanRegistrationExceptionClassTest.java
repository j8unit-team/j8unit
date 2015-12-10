package org.j8unit.repository.javax.management;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class MBeanRegistrationExceptionClassTest
implements org.j8unit.repository.javax.management.MBeanRegistrationExceptionClassTests<javax.management.MBeanRegistrationException> {

    @Override
    public Class<javax.management.MBeanRegistrationException> createNewSUT() {
        return javax.management.MBeanRegistrationException.class;
    }

}
