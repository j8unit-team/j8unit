package org.j8unit.repository.java.awt;

import java.awt.Paint;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link Paint} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.java.awt.PaintTests}).
 */
@RunWith(J8Unit4.class)
public class PaintTest
implements PaintTests<Paint> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.awt.Paint]

    @Override
    public Paint createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.awt.Paint], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.awt.Paint]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.awt.Paint]

}
