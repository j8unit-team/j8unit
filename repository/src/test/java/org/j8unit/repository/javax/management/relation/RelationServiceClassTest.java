package org.j8unit.repository.javax.management.relation;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class RelationServiceClassTest
implements org.j8unit.repository.javax.management.relation.RelationServiceClassTests<javax.management.relation.RelationService> {

    @Override
    public Class<javax.management.relation.RelationService> createNewSUT() {
        return javax.management.relation.RelationService.class;
    }

}
