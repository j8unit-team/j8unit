package org.j8unit.repository.java.awt.dnd;

import java.awt.dnd.DropTargetContext;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link DropTargetContext} (by simply reusing
 * the J8Unit test interface {@link DropTargetContextTests}).
 */

@RunWith(J8Unit4.class)
public class DropTargetContextTest
implements DropTargetContextTests<DropTargetContext> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.awt.dnd.DropTargetContext]

    @Override
    public DropTargetContext createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.awt.dnd.DropTargetContext], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.awt.dnd.DropTargetContext]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.awt.dnd.DropTargetContext]

}
