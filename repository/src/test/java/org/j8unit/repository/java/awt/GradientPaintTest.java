package org.j8unit.repository.java.awt;

import java.awt.GradientPaint;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link GradientPaint} (by simply reusing the
 * J8Unit test interface {@link GradientPaintTests}).
 */

@RunWith(J8Unit4.class)
public class GradientPaintTest
implements GradientPaintTests<GradientPaint> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.awt.GradientPaint]

    @Override
    public GradientPaint createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.awt.GradientPaint], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.awt.GradientPaint]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.awt.GradientPaint]

}
