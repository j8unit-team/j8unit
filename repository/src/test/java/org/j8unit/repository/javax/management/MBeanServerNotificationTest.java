package org.j8unit.repository.javax.management;

import javax.management.MBeanServerNotification;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class MBeanServerNotificationTest
implements org.j8unit.repository.javax.management.MBeanServerNotificationTests<MBeanServerNotification> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.management.MBeanServerNotification]

    @Override
    public MBeanServerNotification createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.management.MBeanServerNotification], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.management.MBeanServerNotification]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.management.MBeanServerNotification]

}
