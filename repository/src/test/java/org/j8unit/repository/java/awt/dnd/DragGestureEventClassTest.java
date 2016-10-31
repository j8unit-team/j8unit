package org.j8unit.repository.java.awt.dnd;

import java.awt.dnd.DragGestureEvent;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DragGestureEventClassTest
implements org.j8unit.repository.java.awt.dnd.DragGestureEventClassTests<DragGestureEvent> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.awt.dnd.DragGestureEvent]

    @Override
    public Class<DragGestureEvent> createNewSUT() {
        return DragGestureEvent.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.awt.dnd.DragGestureEvent#DragGestureEvent(java.awt.dnd.DragGestureRecognizer, int, java.awt.Point, java.util.List)
     * public java.awt.dnd.DragGestureEvent(java.awt.dnd.DragGestureRecognizer,int,java.awt.Point,java.util.List<?
     * extends java.awt.event.InputEvent>)}.
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
    public void create_DragGestureEvent_DragGestureRecognizer_int_Point_List()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final DragGestureEvent sut = null; // = new DragGestureEvent(java.awt.dnd.DragGestureRecognizer, int,
                                           // java.awt.Point, java.util.List);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.awt.dnd.DragGestureEvent]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.awt.dnd.DragGestureEvent]

}
