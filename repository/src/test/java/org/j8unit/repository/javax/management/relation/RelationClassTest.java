package org.j8unit.repository.javax.management.relation;

import javax.management.relation.Relation;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class RelationClassTest
implements org.j8unit.repository.javax.management.relation.RelationClassTests<Relation> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.management.relation.Relation]

    @Override
    public Class<Relation> createNewSUT() {
        return Relation.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.management.relation.Relation]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.management.relation.Relation]

}
