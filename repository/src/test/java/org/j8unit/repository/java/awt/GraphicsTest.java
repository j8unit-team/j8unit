package org.j8unit.repository.java.awt;

import java.awt.Graphics;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link Graphics} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.awt.GraphicsTests}).
 */
@RunWith(J8Unit4.class)
public class GraphicsTest
implements GraphicsTests<Graphics> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.awt.Graphics]

    @Override
    public Graphics createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.awt.Graphics], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.awt.Graphics]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.awt.Graphics]

}
