package org.j8unit.repository.javax.management;

import javax.management.MBeanServerConnection;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class MBeanServerConnectionTest
implements org.j8unit.repository.javax.management.MBeanServerConnectionTests<MBeanServerConnection> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.management.MBeanServerConnection]

    @Override
    public MBeanServerConnection createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.management.MBeanServerConnection], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.management.MBeanServerConnection]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.management.MBeanServerConnection]

}
