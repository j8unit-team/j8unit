package org.j8unit.repository.java.awt.dnd;

import java.awt.dnd.DragSourceEvent;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link DragSourceEvent} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.awt.dnd.DragSourceEventClassTests}).
 */
@RunWith(J8Unit4.class)
public class DragSourceEventClassTest
implements DragSourceEventClassTests<DragSourceEvent> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.awt.dnd.DragSourceEvent]

    @Override
    public Class<DragSourceEvent> createNewSUT() {
        return DragSourceEvent.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.awt.dnd.DragSourceEvent#DragSourceEvent(java.awt.dnd.DragSourceContext) public
     * java.awt.dnd.DragSourceEvent(java.awt.dnd.DragSourceContext)}.
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
    public void create_DragSourceEvent_DragSourceContext()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final DragSourceEvent sut = null; // = new DragSourceEvent(java.awt.dnd.DragSourceContext);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.awt.dnd.DragSourceEvent#DragSourceEvent(java.awt.dnd.DragSourceContext, int, int) public
     * java.awt.dnd.DragSourceEvent(java.awt.dnd.DragSourceContext,int,int)}.
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
    public void create_DragSourceEvent_DragSourceContext_int_int()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final DragSourceEvent sut = null; // = new DragSourceEvent(java.awt.dnd.DragSourceContext, int, int);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.awt.dnd.DragSourceEvent]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.awt.dnd.DragSourceEvent]

}
