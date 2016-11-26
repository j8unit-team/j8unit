package org.j8unit.repository.java.awt.image;

import java.awt.image.ColorModel;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link ColorModel} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.awt.image.ColorModelTests}).
 */
@RunWith(J8Unit4.class)
public class ColorModelTest
implements ColorModelTests<ColorModel> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.awt.image.ColorModel]

    @Override
    public ColorModel createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.awt.image.ColorModel], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.awt.image.ColorModel]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.awt.image.ColorModel]

}
