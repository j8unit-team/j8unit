package org.j8unit.repository.java.awt.dnd;

import java.awt.dnd.DropTargetContext;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link DropTargetContext} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.awt.dnd.DropTargetContextClassTests}).
 */
@RunWith(J8Unit4.class)
public class DropTargetContextClassTest
implements DropTargetContextClassTests<DropTargetContext> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.awt.dnd.DropTargetContext]

    @Override
    public Class<DropTargetContext> createNewSUT() {
        return DropTargetContext.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.awt.dnd.DropTargetContext]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.awt.dnd.DropTargetContext]

}
