package org.j8unit.repository.javax.management.relation;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class RoleListClassTest
implements org.j8unit.repository.javax.management.relation.RoleListClassTests<javax.management.relation.RoleList> {

    @Override
    public Class<javax.management.relation.RoleList> createNewSUT() {
        return javax.management.relation.RoleList.class;
    }

}
