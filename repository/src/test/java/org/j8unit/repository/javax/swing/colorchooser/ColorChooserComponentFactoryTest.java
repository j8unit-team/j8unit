package org.j8unit.repository.javax.swing.colorchooser;

import javax.swing.colorchooser.ColorChooserComponentFactory;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link ColorChooserComponentFactory} (by
 * simply reusing the J8Unit test interface {@link ColorChooserComponentFactoryTests}).
 */

@RunWith(J8Unit4.class)
public class ColorChooserComponentFactoryTest
implements ColorChooserComponentFactoryTests<ColorChooserComponentFactory> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.colorchooser.ColorChooserComponentFactory]

    @Override
    public ColorChooserComponentFactory createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.swing.colorchooser.ColorChooserComponentFactory], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.colorchooser.ColorChooserComponentFactory]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.colorchooser.ColorChooserComponentFactory]

}
