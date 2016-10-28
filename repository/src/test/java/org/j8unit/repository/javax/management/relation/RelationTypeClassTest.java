package org.j8unit.repository.javax.management.relation;

import javax.management.relation.RelationType;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class RelationTypeClassTest
implements org.j8unit.repository.javax.management.relation.RelationTypeClassTests<RelationType> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.management.relation.RelationType]

    @Override
    public Class<RelationType> createNewSUT() {
        return RelationType.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.management.relation.RelationType]

}
