package org.j8unit.repository.javax.management.relation;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class InvalidRelationIdExceptionTest
implements org.j8unit.repository.javax.management.relation.InvalidRelationIdExceptionTests<javax.management.relation.InvalidRelationIdException> {

    @Override
    public javax.management.relation.InvalidRelationIdException createNewSUT() {
        return new javax.management.relation.InvalidRelationIdException();
    }

}
