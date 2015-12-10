package org.j8unit.repository.javax.management.relation;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class InvalidRoleInfoExceptionTest
implements org.j8unit.repository.javax.management.relation.InvalidRoleInfoExceptionTests<javax.management.relation.InvalidRoleInfoException> {

    @Override
    public javax.management.relation.InvalidRoleInfoException createNewSUT() {
        return new javax.management.relation.InvalidRoleInfoException();
    }

}
