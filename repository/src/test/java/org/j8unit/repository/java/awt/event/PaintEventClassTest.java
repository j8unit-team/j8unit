package org.j8unit.repository.java.awt.event;

import java.awt.Component;
import java.awt.Rectangle;
import java.awt.event.PaintEvent;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class PaintEventClassTest
implements org.j8unit.repository.java.awt.event.PaintEventClassTests<PaintEvent> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.awt.event.PaintEvent]

    @Override
    public Class<PaintEvent> createNewSUT() {
        return PaintEvent.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link PaintEvent#PaintEvent(Component, int, Rectangle) public
     * java.awt.event.PaintEvent(java.awt.Component,int,java.awt.Rectangle)}.
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
    public void create_PaintEvent_Component_int_Rectangle()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final PaintEvent sut = null; // = new PaintEvent(Component, int, Rectangle);
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.awt.event.PaintEvent]

}
