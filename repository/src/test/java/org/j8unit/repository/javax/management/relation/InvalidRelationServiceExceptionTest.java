package org.j8unit.repository.javax.management.relation;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class InvalidRelationServiceExceptionTest
implements org.j8unit.repository.javax.management.relation.InvalidRelationServiceExceptionTests<javax.management.relation.InvalidRelationServiceException> {

    @Override
    public javax.management.relation.InvalidRelationServiceException createNewSUT() {
        return new javax.management.relation.InvalidRelationServiceException();
    }

}
