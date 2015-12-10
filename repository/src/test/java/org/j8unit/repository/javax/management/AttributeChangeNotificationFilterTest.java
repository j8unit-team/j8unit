package org.j8unit.repository.javax.management;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class AttributeChangeNotificationFilterTest
implements org.j8unit.repository.javax.management.AttributeChangeNotificationFilterTests<javax.management.AttributeChangeNotificationFilter> {

    @Override
    public javax.management.AttributeChangeNotificationFilter createNewSUT() {
        return new javax.management.AttributeChangeNotificationFilter();
    }

}
