package org.j8unit.repository.javax.management;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class MBeanServerFactoryClassTest
implements org.j8unit.repository.javax.management.MBeanServerFactoryClassTests<javax.management.MBeanServerFactory> {

    @Override
    public Class<javax.management.MBeanServerFactory> createNewSUT() {
        return javax.management.MBeanServerFactory.class;
    }

}
