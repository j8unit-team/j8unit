package org.j8unit.repository.javax.swing.event;

import javax.swing.event.ChangeEvent;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ChangeEventClassTest
implements org.j8unit.repository.javax.swing.event.ChangeEventClassTests<ChangeEvent> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.event.ChangeEvent]

    @Override
    public Class<ChangeEvent> createNewSUT() {
        return ChangeEvent.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.swing.event.ChangeEvent#ChangeEvent(Object) public javax.swing.event.ChangeEvent(java.lang.Object)}.
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
    public void create_ChangeEvent_Object()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final ChangeEvent sut = null; // = new ChangeEvent(Object);
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.event.ChangeEvent]

}
