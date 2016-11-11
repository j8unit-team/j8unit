package org.j8unit.repository.javax.accessibility;

import javax.accessibility.AccessibleHyperlink;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link AccessibleHyperlink} (by simply
 * reusing the J8Unit test interface {@link org.j8unit.repository.javax.accessibility.AccessibleHyperlinkTests}).
 */

@RunWith(J8Unit4.class)
public class AccessibleHyperlinkTest
implements AccessibleHyperlinkTests<AccessibleHyperlink> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.accessibility.AccessibleHyperlink]

    @Override
    public AccessibleHyperlink createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.accessibility.AccessibleHyperlink], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.accessibility.AccessibleHyperlink]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.accessibility.AccessibleHyperlink]

}
