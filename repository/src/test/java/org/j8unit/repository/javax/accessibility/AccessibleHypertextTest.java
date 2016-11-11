package org.j8unit.repository.javax.accessibility;

import javax.accessibility.AccessibleHypertext;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link AccessibleHypertext} (by simply
 * reusing the J8Unit test interface {@link org.j8unit.repository.javax.accessibility.AccessibleHypertextTests}).
 */

@RunWith(J8Unit4.class)
public class AccessibleHypertextTest
implements AccessibleHypertextTests<AccessibleHypertext> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.accessibility.AccessibleHypertext]

    @Override
    public AccessibleHypertext createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.accessibility.AccessibleHypertext], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.accessibility.AccessibleHypertext]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.accessibility.AccessibleHypertext]

}
