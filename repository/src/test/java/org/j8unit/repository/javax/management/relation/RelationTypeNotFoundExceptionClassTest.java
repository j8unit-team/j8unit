package org.j8unit.repository.javax.management.relation;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class RelationTypeNotFoundExceptionClassTest
implements org.j8unit.repository.javax.management.relation.RelationTypeNotFoundExceptionClassTests<javax.management.relation.RelationTypeNotFoundException> {

    @Override
    public Class<javax.management.relation.RelationTypeNotFoundException> createNewSUT() {
        return javax.management.relation.RelationTypeNotFoundException.class;
    }

}
