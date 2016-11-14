package org.j8unit.repository.javax.swing;

import javax.swing.Scrollable;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link Scrollable} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.swing.ScrollableTests}).
 */

@RunWith(J8Unit4.class)
public class ScrollableTest
implements ScrollableTests<Scrollable> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.Scrollable]

    @Override
    public Scrollable createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.swing.Scrollable], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.Scrollable]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.Scrollable]

}
