package org.j8unit.repository.javax.management.relation;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class RoleStatusClassTest
implements org.j8unit.repository.javax.management.relation.RoleStatusClassTests<javax.management.relation.RoleStatus> {

    @Override
    public Class<javax.management.relation.RoleStatus> createNewSUT() {
        return javax.management.relation.RoleStatus.class;
    }

}
