package org.j8unit.repository.java.awt.event;

import java.awt.event.ComponentEvent;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link ComponentEvent} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.awt.event.ComponentEventClassTests}).
 */

@RunWith(J8Unit4.class)
public class ComponentEventClassTest
implements ComponentEventClassTests<ComponentEvent> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.awt.event.ComponentEvent]

    @Override
    public Class<ComponentEvent> createNewSUT() {
        return ComponentEvent.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.awt.event.ComponentEvent#ComponentEvent(java.awt.Component, int) public
     * java.awt.event.ComponentEvent(java.awt.Component,int)}.
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
    public void create_ComponentEvent_Component_int()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final ComponentEvent sut = null; // = new ComponentEvent(java.awt.Component, int);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.awt.event.ComponentEvent]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.awt.event.ComponentEvent]

}
