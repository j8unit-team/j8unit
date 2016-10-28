package org.j8unit.repository.javax.management.relation;

import javax.management.relation.Relation;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class RelationTest
implements org.j8unit.repository.javax.management.relation.RelationTests<Relation> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.management.relation.Relation]

    @Override
    public Relation createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.management.relation.Relation], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.management.relation.Relation]

}
