package org.j8unit.repository.javax.management;

import javax.management.MBeanServer;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class MBeanServerClassTest
implements org.j8unit.repository.javax.management.MBeanServerClassTests<MBeanServer> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.management.MBeanServer]

    @Override
    public Class<MBeanServer> createNewSUT() {
        return MBeanServer.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.management.MBeanServer]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.management.MBeanServer]

}
