package org.j8unit.repository.javax.management.relation;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class InvalidRelationIdExceptionClassTest
implements org.j8unit.repository.javax.management.relation.InvalidRelationIdExceptionClassTests<javax.management.relation.InvalidRelationIdException> {

    @Override
    public Class<javax.management.relation.InvalidRelationIdException> createNewSUT() {
        return javax.management.relation.InvalidRelationIdException.class;
    }

}
