package org.j8unit.repository.javax.management.remote;

import javax.management.remote.MBeanServerForwarder;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class MBeanServerForwarderClassTest
implements org.j8unit.repository.javax.management.remote.MBeanServerForwarderClassTests<MBeanServerForwarder> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.management.remote.MBeanServerForwarder]

    @Override
    public Class<MBeanServerForwarder> createNewSUT() {
        return MBeanServerForwarder.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.management.remote.MBeanServerForwarder]

}
