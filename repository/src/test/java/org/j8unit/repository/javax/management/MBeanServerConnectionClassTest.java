package org.j8unit.repository.javax.management;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class MBeanServerConnectionClassTest
implements org.j8unit.repository.javax.management.MBeanServerConnectionClassTests<javax.management.MBeanServerConnection> {

    @Override
    public Class<javax.management.MBeanServerConnection> createNewSUT() {
        return javax.management.MBeanServerConnection.class;
    }

}
