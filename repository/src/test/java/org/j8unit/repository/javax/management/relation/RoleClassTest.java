package org.j8unit.repository.javax.management.relation;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class RoleClassTest
implements org.j8unit.repository.javax.management.relation.RoleClassTests<javax.management.relation.Role> {

    @Override
    public Class<javax.management.relation.Role> createNewSUT() {
        return javax.management.relation.Role.class;
    }

}
