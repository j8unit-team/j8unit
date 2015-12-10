package org.j8unit.repository.javax.management.relation;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class RoleUnresolvedClassTest
implements org.j8unit.repository.javax.management.relation.RoleUnresolvedClassTests<javax.management.relation.RoleUnresolved> {

    @Override
    public Class<javax.management.relation.RoleUnresolved> createNewSUT() {
        return javax.management.relation.RoleUnresolved.class;
    }

}
