package org.j8unit.repository.javax.management.relation;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class RelationTypeNotFoundExceptionTest
implements org.j8unit.repository.javax.management.relation.RelationTypeNotFoundExceptionTests<javax.management.relation.RelationTypeNotFoundException> {

    @Override
    public javax.management.relation.RelationTypeNotFoundException createNewSUT() {
        return new javax.management.relation.RelationTypeNotFoundException();
    }

}
