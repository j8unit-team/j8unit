package org.j8unit.repository.javax.management;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class MBeanServerClassTest
implements org.j8unit.repository.javax.management.MBeanServerClassTests<javax.management.MBeanServer> {

    @Override
    public Class<javax.management.MBeanServer> createNewSUT() {
        return javax.management.MBeanServer.class;
    }

}
