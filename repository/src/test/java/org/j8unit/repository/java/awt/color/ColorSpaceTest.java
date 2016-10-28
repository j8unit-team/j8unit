package org.j8unit.repository.java.awt.color;

import java.awt.color.ColorSpace;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ColorSpaceTest
implements org.j8unit.repository.java.awt.color.ColorSpaceTests<ColorSpace> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.awt.color.ColorSpace]

    @Override
    public ColorSpace createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.awt.color.ColorSpace], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.awt.color.ColorSpace]

}
