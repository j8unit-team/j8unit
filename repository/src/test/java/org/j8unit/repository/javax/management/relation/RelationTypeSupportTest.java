package org.j8unit.repository.javax.management.relation;

import javax.management.relation.RelationTypeSupport;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link RelationTypeSupport} (by simply
 * reusing the J8Unit test interface {@link org.j8unit.repository.javax.management.relation.RelationTypeSupportTests}).
 */

@RunWith(J8Unit4.class)
public class RelationTypeSupportTest
implements RelationTypeSupportTests<RelationTypeSupport> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.management.relation.RelationTypeSupport]

    @Override
    public RelationTypeSupport createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.management.relation.RelationTypeSupport], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.management.relation.RelationTypeSupport]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.management.relation.RelationTypeSupport]

}
