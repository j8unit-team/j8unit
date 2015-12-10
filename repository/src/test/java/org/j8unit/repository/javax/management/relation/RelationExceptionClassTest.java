package org.j8unit.repository.javax.management.relation;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class RelationExceptionClassTest
implements org.j8unit.repository.javax.management.relation.RelationExceptionClassTests<javax.management.relation.RelationException> {

    @Override
    public Class<javax.management.relation.RelationException> createNewSUT() {
        return javax.management.relation.RelationException.class;
    }

}
