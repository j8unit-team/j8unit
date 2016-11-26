package org.j8unit.repository.javax.swing.plaf.basic;

import javax.swing.plaf.basic.ComboPopup;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link ComboPopup} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.swing.plaf.basic.ComboPopupTests}).
 */
@RunWith(J8Unit4.class)
public class ComboPopupTest
implements ComboPopupTests<ComboPopup> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.plaf.basic.ComboPopup]

    @Override
    public ComboPopup createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.swing.plaf.basic.ComboPopup], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.plaf.basic.ComboPopup]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.plaf.basic.ComboPopup]

}
