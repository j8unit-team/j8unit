package org.j8unit.repository.java.awt.event;

import java.awt.event.FocusEvent;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link FocusEvent} (by simply reusing the J8Unit
 * test interface {@link FocusEventClassTests}).
 */

@RunWith(J8Unit4.class)
public class FocusEventClassTest
implements FocusEventClassTests<FocusEvent> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.awt.event.FocusEvent]

    @Override
    public Class<FocusEvent> createNewSUT() {
        return FocusEvent.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.awt.event.FocusEvent#FocusEvent(java.awt.Component, int, boolean, java.awt.Component) public
     * java.awt.event.FocusEvent(java.awt.Component,int,boolean,java.awt.Component)}.
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
    public void create_FocusEvent_Component_int_boolean_Component()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final FocusEvent sut = null; // = new FocusEvent(java.awt.Component, int, boolean, java.awt.Component);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.awt.event.FocusEvent#FocusEvent(java.awt.Component, int) public
     * java.awt.event.FocusEvent(java.awt.Component,int)}.
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
    public void create_FocusEvent_Component_int()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final FocusEvent sut = null; // = new FocusEvent(java.awt.Component, int);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.awt.event.FocusEvent#FocusEvent(java.awt.Component, int, boolean) public
     * java.awt.event.FocusEvent(java.awt.Component,int,boolean)}.
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
    public void create_FocusEvent_Component_int_boolean()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final FocusEvent sut = null; // = new FocusEvent(java.awt.Component, int, boolean);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.awt.event.FocusEvent]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.awt.event.FocusEvent]

}
