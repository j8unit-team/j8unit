package org.j8unit.repository.java.awt;

import java.awt.Stroke;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link Stroke} (by simply reusing the J8Unit
 * test interface {@link StrokeTests}).
 */

@RunWith(J8Unit4.class)
public class StrokeTest
implements StrokeTests<Stroke> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.awt.Stroke]

    @Override
    public Stroke createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.awt.Stroke], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.awt.Stroke]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.awt.Stroke]

}
