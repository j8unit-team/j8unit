package org.j8unit.repository.javax.management;

import javax.management.NotificationFilter;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class NotificationFilterClassTest
implements org.j8unit.repository.javax.management.NotificationFilterClassTests<NotificationFilter> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.management.NotificationFilter]

    @Override
    public Class<NotificationFilter> createNewSUT() {
        return NotificationFilter.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.management.NotificationFilter]

}
