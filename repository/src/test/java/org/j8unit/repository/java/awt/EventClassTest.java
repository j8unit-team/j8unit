package org.j8unit.repository.java.awt;

import java.awt.Event;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link Event} (by simply reusing the J8Unit test
 * interface {@link org.j8unit.repository.java.awt.EventClassTests}).
 */
@RunWith(J8Unit4.class)
public class EventClassTest
implements EventClassTests<Event> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.awt.Event]

    @Override
    public Class<Event> createNewSUT() {
        return Event.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.awt.Event#Event(Object, long, int, int, int, int, int) public
     * java.awt.Event(java.lang.Object,long,int,int,int,int,int)}.
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
    public void create_Event_Object_long_int_int_int_int_int()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final Event sut = null; // = new Event(Object, long, int, int, int, int, int);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.awt.Event#Event(Object, long, int, int, int, int, int, Object) public
     * java.awt.Event(java.lang.Object,long,int,int,int,int,int,java.lang.Object)}.
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
    public void create_Event_Object_long_int_int_int_int_int_Object()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final Event sut = null; // = new Event(Object, long, int, int, int, int, int, Object);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link java.awt.Event#Event(Object, int, Object)
     * public java.awt.Event(java.lang.Object,int,java.lang.Object)}.
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
    public void create_Event_Object_int_Object()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final Event sut = null; // = new Event(Object, int, Object);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.awt.Event]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.awt.Event]

}
