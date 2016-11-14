package org.j8unit.repository.javax.swing.event;

import javax.swing.event.InternalFrameEvent;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link InternalFrameEvent} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.javax.swing.event.InternalFrameEventClassTests}).
 */

@RunWith(J8Unit4.class)
public class InternalFrameEventClassTest
implements InternalFrameEventClassTests<InternalFrameEvent> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.event.InternalFrameEvent]

    @Override
    public Class<InternalFrameEvent> createNewSUT() {
        return InternalFrameEvent.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.swing.event.InternalFrameEvent#InternalFrameEvent(javax.swing.JInternalFrame, int) public
     * javax.swing.event.InternalFrameEvent(javax.swing.JInternalFrame,int)}.
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
    public void create_InternalFrameEvent_JInternalFrame_int()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final InternalFrameEvent sut = null; // = new InternalFrameEvent(javax.swing.JInternalFrame, int);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.event.InternalFrameEvent]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.event.InternalFrameEvent]

}
