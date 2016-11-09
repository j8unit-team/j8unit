package org.j8unit.repository.javax.swing.text;

import javax.swing.text.ZoneView;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link ZoneView} (by simply reusing the
 * J8Unit test interface {@link ZoneViewTests}).
 */

@RunWith(J8Unit4.class)
public class ZoneViewTest
implements ZoneViewTests<ZoneView> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.text.ZoneView]

    @Override
    public ZoneView createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.swing.text.ZoneView], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.text.ZoneView]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.text.ZoneView]

}
