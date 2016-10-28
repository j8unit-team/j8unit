package org.j8unit.repository.java.awt.dnd;

import java.awt.Cursor;
import java.awt.Image;
import java.awt.Point;
import java.awt.datatransfer.Transferable;
import java.awt.dnd.DragGestureEvent;
import java.awt.dnd.DragSourceContext;
import java.awt.dnd.DragSourceListener;
import java.awt.dnd.peer.DragSourceContextPeer;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DragSourceContextClassTest
implements org.j8unit.repository.java.awt.dnd.DragSourceContextClassTests<DragSourceContext> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.awt.dnd.DragSourceContext]

    @Override
    public Class<DragSourceContext> createNewSUT() {
        return DragSourceContext.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link DragSourceContext#DragSourceContext(DragSourceContextPeer, DragGestureEvent, Cursor, Image, Point, Transferable, DragSourceListener)
     * public
     * java.awt.dnd.DragSourceContext(java.awt.dnd.peer.DragSourceContextPeer,java.awt.dnd.DragGestureEvent,java.awt.Cursor,java.awt.Image,java.awt.Point,java.awt.datatransfer.Transferable,java.awt.dnd.DragSourceListener)}
     * .
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
    public void create_DragSourceContext_DragSourceContextPeer_DragGestureEvent_Cursor_Image_Point_Transferable_DragSourceListener()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final DragSourceContext sut = null; // = new DragSourceContext(DragSourceContextPeer, DragGestureEvent, Cursor,
                                            // Image, Point, Transferable, DragSourceListener);
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.awt.dnd.DragSourceContext]

}
