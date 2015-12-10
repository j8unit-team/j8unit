package org.j8unit.repository.javax.management.relation;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class RoleStatusTest
implements org.j8unit.repository.javax.management.relation.RoleStatusTests<javax.management.relation.RoleStatus> {

    @Override
    public javax.management.relation.RoleStatus createNewSUT() {
        return new javax.management.relation.RoleStatus();
    }

}
