package org.j8unit.repository.javax.management.relation;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class InvalidRelationTypeExceptionClassTest
implements org.j8unit.repository.javax.management.relation.InvalidRelationTypeExceptionClassTests<javax.management.relation.InvalidRelationTypeException> {

    @Override
    public Class<javax.management.relation.InvalidRelationTypeException> createNewSUT() {
        return javax.management.relation.InvalidRelationTypeException.class;
    }

}
