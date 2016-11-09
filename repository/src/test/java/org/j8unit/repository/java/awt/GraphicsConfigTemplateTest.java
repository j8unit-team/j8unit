package org.j8unit.repository.java.awt;

import java.awt.GraphicsConfigTemplate;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link GraphicsConfigTemplate} (by simply
 * reusing the J8Unit test interface {@link GraphicsConfigTemplateTests}).
 */

@RunWith(J8Unit4.class)
public class GraphicsConfigTemplateTest
implements GraphicsConfigTemplateTests<GraphicsConfigTemplate> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.awt.GraphicsConfigTemplate]

    @Override
    public GraphicsConfigTemplate createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.awt.GraphicsConfigTemplate], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.awt.GraphicsConfigTemplate]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.awt.GraphicsConfigTemplate]

}
