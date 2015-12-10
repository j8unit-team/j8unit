package org.j8unit.repository.javax.management;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class NotificationFilterSupportClassTest
implements org.j8unit.repository.javax.management.NotificationFilterSupportClassTests<javax.management.NotificationFilterSupport> {

    @Override
    public Class<javax.management.NotificationFilterSupport> createNewSUT() {
        return javax.management.NotificationFilterSupport.class;
    }

}
