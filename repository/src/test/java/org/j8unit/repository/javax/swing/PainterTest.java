package org.j8unit.repository.javax.swing;

import javax.swing.Painter;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link Painter} (by simply reusing the
 * J8Unit test interface {@link PainterTests}).
 */

@RunWith(J8Unit4.class)
public class PainterTest<T>
implements PainterTests<Painter<T>, T> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.Painter]

    @Override
    public Painter<T> createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.swing.Painter], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.Painter]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.Painter]

}
