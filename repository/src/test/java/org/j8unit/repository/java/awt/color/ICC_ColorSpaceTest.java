package org.j8unit.repository.java.awt.color;

import java.awt.color.ICC_ColorSpace;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link ICC_ColorSpace} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.java.awt.color.ICC_ColorSpaceTests}).
 */
@RunWith(J8Unit4.class)
public class ICC_ColorSpaceTest
implements ICC_ColorSpaceTests<ICC_ColorSpace> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.awt.color.ICC_ColorSpace]

    @Override
    public ICC_ColorSpace createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.awt.color.ICC_ColorSpace], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.awt.color.ICC_ColorSpace]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.awt.color.ICC_ColorSpace]

}
