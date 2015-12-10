package org.j8unit.repository.javax.management.remote;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class NotificationResultClassTest
implements org.j8unit.repository.javax.management.remote.NotificationResultClassTests<javax.management.remote.NotificationResult> {

    @Override
    public Class<javax.management.remote.NotificationResult> createNewSUT() {
        return javax.management.remote.NotificationResult.class;
    }

}
