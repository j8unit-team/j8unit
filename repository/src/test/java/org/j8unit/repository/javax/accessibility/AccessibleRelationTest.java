package org.j8unit.repository.javax.accessibility;

import javax.accessibility.AccessibleRelation;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link AccessibleRelation} (by simply
 * reusing the J8Unit test interface {@link org.j8unit.repository.javax.accessibility.AccessibleRelationTests}).
 */

@RunWith(J8Unit4.class)
public class AccessibleRelationTest
implements AccessibleRelationTests<AccessibleRelation> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.accessibility.AccessibleRelation]

    @Override
    public AccessibleRelation createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.accessibility.AccessibleRelation], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.accessibility.AccessibleRelation]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.accessibility.AccessibleRelation]

}
