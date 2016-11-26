package org.j8unit.repository.javax.management;

import javax.management.NotificationFilter;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link NotificationFilter} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.javax.management.NotificationFilterClassTests}).
 */
@RunWith(J8Unit4.class)
public class NotificationFilterClassTest
implements NotificationFilterClassTests<NotificationFilter> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.management.NotificationFilter]

    @Override
    public Class<NotificationFilter> createNewSUT() {
        return NotificationFilter.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.management.NotificationFilter]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.management.NotificationFilter]

}
