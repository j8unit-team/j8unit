package org.j8unit.repository.java.awt.color;

import java.awt.color.ColorSpace;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link ColorSpace} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.awt.color.ColorSpaceTests}).
 */
@RunWith(J8Unit4.class)
public class ColorSpaceTest
implements ColorSpaceTests<ColorSpace> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.awt.color.ColorSpace]

    @Override
    public ColorSpace createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.awt.color.ColorSpace], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.awt.color.ColorSpace]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.awt.color.ColorSpace]

}
