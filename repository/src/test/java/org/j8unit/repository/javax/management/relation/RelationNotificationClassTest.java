package org.j8unit.repository.javax.management.relation;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class RelationNotificationClassTest
implements org.j8unit.repository.javax.management.relation.RelationNotificationClassTests<javax.management.relation.RelationNotification> {

    @Override
    public Class<javax.management.relation.RelationNotification> createNewSUT() {
        return javax.management.relation.RelationNotification.class;
    }

}
