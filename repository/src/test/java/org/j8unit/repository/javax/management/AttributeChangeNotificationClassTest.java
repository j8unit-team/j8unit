package org.j8unit.repository.javax.management;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class AttributeChangeNotificationClassTest
implements org.j8unit.repository.javax.management.AttributeChangeNotificationClassTests<javax.management.AttributeChangeNotification> {

    @Override
    public Class<javax.management.AttributeChangeNotification> createNewSUT() {
        return javax.management.AttributeChangeNotification.class;
    }

}
