package org.j8unit.repository.java.awt.image;

import java.awt.image.ColorConvertOp;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link ColorConvertOp} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.java.awt.image.ColorConvertOpTests}).
 */
@RunWith(J8Unit4.class)
public class ColorConvertOpTest
implements ColorConvertOpTests<ColorConvertOp> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.awt.image.ColorConvertOp]

    @Override
    public ColorConvertOp createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.awt.image.ColorConvertOp], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.awt.image.ColorConvertOp]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.awt.image.ColorConvertOp]

}
