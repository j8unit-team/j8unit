package org.j8unit.repository.javax.management.relation;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class RoleNotFoundExceptionTest
implements org.j8unit.repository.javax.management.relation.RoleNotFoundExceptionTests<javax.management.relation.RoleNotFoundException> {

    @Override
    public javax.management.relation.RoleNotFoundException createNewSUT() {
        return new javax.management.relation.RoleNotFoundException();
    }

}
