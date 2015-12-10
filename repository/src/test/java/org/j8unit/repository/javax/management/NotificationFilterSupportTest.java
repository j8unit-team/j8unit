package org.j8unit.repository.javax.management;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class NotificationFilterSupportTest
implements org.j8unit.repository.javax.management.NotificationFilterSupportTests<javax.management.NotificationFilterSupport> {

    @Override
    public javax.management.NotificationFilterSupport createNewSUT() {
        return new javax.management.NotificationFilterSupport();
    }

}
