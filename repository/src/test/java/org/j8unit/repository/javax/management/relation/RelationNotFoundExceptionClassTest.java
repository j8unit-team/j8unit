package org.j8unit.repository.javax.management.relation;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class RelationNotFoundExceptionClassTest
implements org.j8unit.repository.javax.management.relation.RelationNotFoundExceptionClassTests<javax.management.relation.RelationNotFoundException> {

    @Override
    public Class<javax.management.relation.RelationNotFoundException> createNewSUT() {
        return javax.management.relation.RelationNotFoundException.class;
    }

}
