package org.j8unit.repository.javax.management;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class MBeanServerNotificationClassTest
implements org.j8unit.repository.javax.management.MBeanServerNotificationClassTests<javax.management.MBeanServerNotification> {

    @Override
    public Class<javax.management.MBeanServerNotification> createNewSUT() {
        return javax.management.MBeanServerNotification.class;
    }

}
