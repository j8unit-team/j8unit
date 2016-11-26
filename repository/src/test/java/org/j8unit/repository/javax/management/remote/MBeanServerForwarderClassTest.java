package org.j8unit.repository.javax.management.remote;

import javax.management.remote.MBeanServerForwarder;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link MBeanServerForwarder} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.javax.management.remote.MBeanServerForwarderClassTests}).
 */
@RunWith(J8Unit4.class)
public class MBeanServerForwarderClassTest
implements MBeanServerForwarderClassTests<MBeanServerForwarder> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.management.remote.MBeanServerForwarder]

    @Override
    public Class<MBeanServerForwarder> createNewSUT() {
        return MBeanServerForwarder.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.management.remote.MBeanServerForwarder]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.management.remote.MBeanServerForwarder]

}
