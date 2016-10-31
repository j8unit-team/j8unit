package org.j8unit.repository.javax.swing.event;

import javax.swing.event.UndoableEditEvent;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class UndoableEditEventClassTest
implements org.j8unit.repository.javax.swing.event.UndoableEditEventClassTests<UndoableEditEvent> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.event.UndoableEditEvent]

    @Override
    public Class<UndoableEditEvent> createNewSUT() {
        return UndoableEditEvent.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.swing.event.UndoableEditEvent#UndoableEditEvent(Object, javax.swing.undo.UndoableEdit) public
     * javax.swing.event.UndoableEditEvent(java.lang.Object,javax.swing.undo.UndoableEdit)}.
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
    public void create_UndoableEditEvent_Object_UndoableEdit()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final UndoableEditEvent sut = null; // = new UndoableEditEvent(Object, javax.swing.undo.UndoableEdit);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.event.UndoableEditEvent]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.event.UndoableEditEvent]

}
