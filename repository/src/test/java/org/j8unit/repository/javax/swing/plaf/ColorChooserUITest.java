package org.j8unit.repository.javax.swing.plaf;

import javax.swing.plaf.ColorChooserUI;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link ColorChooserUI} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.javax.swing.plaf.ColorChooserUITests}).
 */

@RunWith(J8Unit4.class)
public class ColorChooserUITest
implements ColorChooserUITests<ColorChooserUI> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.plaf.ColorChooserUI]

    @Override
    public ColorChooserUI createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.swing.plaf.ColorChooserUI], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.plaf.ColorChooserUI]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.plaf.ColorChooserUI]

}
