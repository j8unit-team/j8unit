package org.j8unit.repository.javax.management;

import javax.management.MBeanServerConnection;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class MBeanServerConnectionClassTest
implements org.j8unit.repository.javax.management.MBeanServerConnectionClassTests<MBeanServerConnection> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.management.MBeanServerConnection]

    @Override
    public Class<MBeanServerConnection> createNewSUT() {
        return MBeanServerConnection.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.management.MBeanServerConnection]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.management.MBeanServerConnection]

}
