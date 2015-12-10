package org.j8unit.repository.javax.management.relation;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class InvalidRelationTypeExceptionTest
implements org.j8unit.repository.javax.management.relation.InvalidRelationTypeExceptionTests<javax.management.relation.InvalidRelationTypeException> {

    @Override
    public javax.management.relation.InvalidRelationTypeException createNewSUT() {
        return new javax.management.relation.InvalidRelationTypeException();
    }

}
