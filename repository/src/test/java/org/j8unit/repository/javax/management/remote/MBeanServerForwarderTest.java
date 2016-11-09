package org.j8unit.repository.javax.management.remote;

import javax.management.remote.MBeanServerForwarder;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link MBeanServerForwarder} (by simply
 * reusing the J8Unit test interface {@link MBeanServerForwarderTests}).
 */

@RunWith(J8Unit4.class)
public class MBeanServerForwarderTest
implements MBeanServerForwarderTests<MBeanServerForwarder> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.management.remote.MBeanServerForwarder]

    @Override
    public MBeanServerForwarder createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.management.remote.MBeanServerForwarder], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.management.remote.MBeanServerForwarder]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.management.remote.MBeanServerForwarder]

}
