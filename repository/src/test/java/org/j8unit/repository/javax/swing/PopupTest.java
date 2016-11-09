package org.j8unit.repository.javax.swing;

import javax.swing.Popup;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link Popup} (by simply reusing the J8Unit
 * test interface {@link PopupTests}).
 */

@RunWith(J8Unit4.class)
public class PopupTest
implements PopupTests<Popup> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.Popup]

    @Override
    public Popup createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.swing.Popup], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.Popup]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.Popup]

}
