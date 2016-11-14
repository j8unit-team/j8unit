package org.j8unit.repository.java.awt;

import java.awt.ScrollPaneAdjustable;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link ScrollPaneAdjustable} (by simply
 * reusing the J8Unit test interface {@link org.j8unit.repository.java.awt.ScrollPaneAdjustableTests}).
 */

@RunWith(J8Unit4.class)
public class ScrollPaneAdjustableTest
implements ScrollPaneAdjustableTests<ScrollPaneAdjustable> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.awt.ScrollPaneAdjustable]

    @Override
    public ScrollPaneAdjustable createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.awt.ScrollPaneAdjustable], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.awt.ScrollPaneAdjustable]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.awt.ScrollPaneAdjustable]

}
