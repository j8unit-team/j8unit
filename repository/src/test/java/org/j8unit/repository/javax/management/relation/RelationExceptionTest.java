package org.j8unit.repository.javax.management.relation;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class RelationExceptionTest
implements org.j8unit.repository.javax.management.relation.RelationExceptionTests<javax.management.relation.RelationException> {

    @Override
    public javax.management.relation.RelationException createNewSUT() {
        return new javax.management.relation.RelationException();
    }

}
