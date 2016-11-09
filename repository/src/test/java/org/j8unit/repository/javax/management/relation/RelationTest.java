package org.j8unit.repository.javax.management.relation;

import javax.management.relation.Relation;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link Relation} (by simply reusing the
 * J8Unit test interface {@link RelationTests}).
 */

@RunWith(J8Unit4.class)
public class RelationTest
implements RelationTests<Relation> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.management.relation.Relation]

    @Override
    public Relation createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.management.relation.Relation], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.management.relation.Relation]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.management.relation.Relation]

}
