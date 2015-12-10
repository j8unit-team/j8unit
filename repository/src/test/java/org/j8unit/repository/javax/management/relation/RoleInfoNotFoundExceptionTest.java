package org.j8unit.repository.javax.management.relation;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class RoleInfoNotFoundExceptionTest
implements org.j8unit.repository.javax.management.relation.RoleInfoNotFoundExceptionTests<javax.management.relation.RoleInfoNotFoundException> {

    @Override
    public javax.management.relation.RoleInfoNotFoundException createNewSUT() {
        return new javax.management.relation.RoleInfoNotFoundException();
    }

}
