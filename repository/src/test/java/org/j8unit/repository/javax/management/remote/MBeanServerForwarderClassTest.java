package org.j8unit.repository.javax.management.remote;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class MBeanServerForwarderClassTest
implements org.j8unit.repository.javax.management.remote.MBeanServerForwarderClassTests<javax.management.remote.MBeanServerForwarder> {

    @Override
    public Class<javax.management.remote.MBeanServerForwarder> createNewSUT() {
        return javax.management.remote.MBeanServerForwarder.class;
    }

}
