package org.j8unit.repository.java.awt.dnd;

import java.awt.dnd.DropTargetEvent;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DropTargetEventClassTest
implements org.j8unit.repository.java.awt.dnd.DropTargetEventClassTests<DropTargetEvent> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.awt.dnd.DropTargetEvent]

    @Override
    public Class<DropTargetEvent> createNewSUT() {
        return DropTargetEvent.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.awt.dnd.DropTargetEvent#DropTargetEvent(java.awt.dnd.DropTargetContext) public
     * java.awt.dnd.DropTargetEvent(java.awt.dnd.DropTargetContext)}.
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
    public void create_DropTargetEvent_DropTargetContext()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final DropTargetEvent sut = null; // = new DropTargetEvent(java.awt.dnd.DropTargetContext);
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.awt.dnd.DropTargetEvent]

}
