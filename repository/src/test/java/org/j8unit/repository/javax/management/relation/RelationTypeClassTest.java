package org.j8unit.repository.javax.management.relation;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class RelationTypeClassTest
implements org.j8unit.repository.javax.management.relation.RelationTypeClassTests<javax.management.relation.RelationType> {

    @Override
    public Class<javax.management.relation.RelationType> createNewSUT() {
        return javax.management.relation.RelationType.class;
    }

}
