package org.j8unit.repository.java.util;

import java.util.EventObject;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link EventObject} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.util.EventObjectClassTests}).
 */
@RunWith(J8Unit4.class)
public class EventObjectClassTest
implements EventObjectClassTests<EventObject> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.util.EventObject]

    @Override
    public Class<EventObject> createNewSUT() {
        return EventObject.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link java.util.EventObject#EventObject(Object)
     * public java.util.EventObject(java.lang.Object)}.
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
    public void create_EventObject_Object()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final EventObject sut = null; // = new EventObject(Object);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.util.EventObject]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.util.EventObject]

}
