package org.j8unit.repository.java.awt.dnd;

import java.awt.dnd.DragSourceContext;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link DragSourceContext} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.java.awt.dnd.DragSourceContextTests}).
 */
@RunWith(J8Unit4.class)
public class DragSourceContextTest
implements DragSourceContextTests<DragSourceContext> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.awt.dnd.DragSourceContext]

    @Override
    public DragSourceContext createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.awt.dnd.DragSourceContext], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.awt.dnd.DragSourceContext]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.awt.dnd.DragSourceContext]

}
