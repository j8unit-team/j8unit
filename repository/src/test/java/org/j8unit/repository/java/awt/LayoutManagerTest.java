package org.j8unit.repository.java.awt;

import java.awt.LayoutManager;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link LayoutManager} (by simply reusing the
 * J8Unit test interface {@link LayoutManagerTests}).
 */

@RunWith(J8Unit4.class)
public class LayoutManagerTest
implements LayoutManagerTests<LayoutManager> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.awt.LayoutManager]

    @Override
    public LayoutManager createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.awt.LayoutManager], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.awt.LayoutManager]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.awt.LayoutManager]

}
