package org.j8unit.repository.javax.swing.text;

import javax.swing.text.BoxView;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link BoxView} (by simply reusing the
 * J8Unit test interface {@link BoxViewTests}).
 */

@RunWith(J8Unit4.class)
public class BoxViewTest
implements BoxViewTests<BoxView> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.text.BoxView]

    @Override
    public BoxView createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.swing.text.BoxView], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.text.BoxView]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.text.BoxView]

}
