package org.j8unit.repository.java.awt.dnd;

import java.awt.dnd.DropTargetDragEvent;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link DropTargetDragEvent} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.java.awt.dnd.DropTargetDragEventClassTests}).
 */

@RunWith(J8Unit4.class)
public class DropTargetDragEventClassTest
implements DropTargetDragEventClassTests<DropTargetDragEvent> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.awt.dnd.DropTargetDragEvent]

    @Override
    public Class<DropTargetDragEvent> createNewSUT() {
        return DropTargetDragEvent.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.awt.dnd.DropTargetDragEvent#DropTargetDragEvent(java.awt.dnd.DropTargetContext, java.awt.Point, int, int)
     * public java.awt.dnd.DropTargetDragEvent(java.awt.dnd.DropTargetContext,java.awt.Point,int,int)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void create_DropTargetDragEvent_DropTargetContext_Point_int_int()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final DropTargetDragEvent sut = null; // = new DropTargetDragEvent(java.awt.dnd.DropTargetContext,
                                              // java.awt.Point, int, int);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.awt.dnd.DropTargetDragEvent]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.awt.dnd.DropTargetDragEvent]

}
