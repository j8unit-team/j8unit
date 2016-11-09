package org.j8unit.repository.javax.swing;

import javax.swing.ScrollPaneConstants;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link ScrollPaneConstants} (by simply
 * reusing the J8Unit test interface {@link ScrollPaneConstantsTests}).
 */

@RunWith(J8Unit4.class)
public class ScrollPaneConstantsTest
implements ScrollPaneConstantsTests<ScrollPaneConstants> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.ScrollPaneConstants]

    @Override
    public ScrollPaneConstants createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.swing.ScrollPaneConstants], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.ScrollPaneConstants]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.ScrollPaneConstants]

}
