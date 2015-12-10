package org.j8unit.repository.javax.management.relation;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class InvalidRoleValueExceptionTest
implements org.j8unit.repository.javax.management.relation.InvalidRoleValueExceptionTests<javax.management.relation.InvalidRoleValueException> {

    @Override
    public javax.management.relation.InvalidRoleValueException createNewSUT() {
        return new javax.management.relation.InvalidRoleValueException();
    }

}
