package org.j8unit.repository.javax.management;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class NotificationFilterClassTest
implements org.j8unit.repository.javax.management.NotificationFilterClassTests<javax.management.NotificationFilter> {

    @Override
    public Class<javax.management.NotificationFilter> createNewSUT() {
        return javax.management.NotificationFilter.class;
    }

}
