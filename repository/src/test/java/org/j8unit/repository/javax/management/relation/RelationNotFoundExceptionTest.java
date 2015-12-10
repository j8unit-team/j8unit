package org.j8unit.repository.javax.management.relation;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class RelationNotFoundExceptionTest
implements org.j8unit.repository.javax.management.relation.RelationNotFoundExceptionTests<javax.management.relation.RelationNotFoundException> {

    @Override
    public javax.management.relation.RelationNotFoundException createNewSUT() {
        return new javax.management.relation.RelationNotFoundException();
    }

}
