package org.j8unit.repository.javax.management;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class NotificationTest
implements org.j8unit.repository.javax.management.NotificationTests<javax.management.Notification> {

    @Override
    public javax.management.Notification createNewSUT() {
        throw new AssertionError("There is no default constructor for [javax.management.Notification] available.");
    }

}
