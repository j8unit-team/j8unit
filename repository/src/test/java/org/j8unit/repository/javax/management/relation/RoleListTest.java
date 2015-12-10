package org.j8unit.repository.javax.management.relation;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class RoleListTest
implements org.j8unit.repository.javax.management.relation.RoleListTests<javax.management.relation.RoleList> {

    @Override
    public javax.management.relation.RoleList createNewSUT() {
        return new javax.management.relation.RoleList();
    }

}
