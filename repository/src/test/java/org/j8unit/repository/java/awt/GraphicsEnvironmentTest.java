package org.j8unit.repository.java.awt;

import java.awt.GraphicsEnvironment;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link GraphicsEnvironment} (by simply
 * reusing the J8Unit test interface {@link org.j8unit.repository.java.awt.GraphicsEnvironmentTests}).
 */
@RunWith(J8Unit4.class)
public class GraphicsEnvironmentTest
implements GraphicsEnvironmentTests<GraphicsEnvironment> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.awt.GraphicsEnvironment]

    @Override
    public GraphicsEnvironment createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.awt.GraphicsEnvironment], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.awt.GraphicsEnvironment]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.awt.GraphicsEnvironment]

}
