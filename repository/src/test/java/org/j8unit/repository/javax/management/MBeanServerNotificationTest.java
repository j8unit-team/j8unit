package org.j8unit.repository.javax.management;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class MBeanServerNotificationTest
implements org.j8unit.repository.javax.management.MBeanServerNotificationTests<javax.management.MBeanServerNotification> {

    @Override
    public javax.management.MBeanServerNotification createNewSUT() {
        throw new AssumptionViolatedException("There is no default constructor for [javax.management.MBeanServerNotification] available.");
    }

}