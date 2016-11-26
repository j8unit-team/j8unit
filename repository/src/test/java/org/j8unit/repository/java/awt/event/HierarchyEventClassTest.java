package org.j8unit.repository.java.awt.event;

import java.awt.event.HierarchyEvent;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link HierarchyEvent} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.awt.event.HierarchyEventClassTests}).
 */
@RunWith(J8Unit4.class)
public class HierarchyEventClassTest
implements HierarchyEventClassTests<HierarchyEvent> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.awt.event.HierarchyEvent]

    @Override
    public Class<HierarchyEvent> createNewSUT() {
        return HierarchyEvent.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.awt.event.HierarchyEvent#HierarchyEvent(java.awt.Component, int, java.awt.Component, java.awt.Container)
     * public java.awt.event.HierarchyEvent(java.awt.Component,int,java.awt.Component,java.awt.Container)}.
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
    public void create_HierarchyEvent_Component_int_Component_Container()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final HierarchyEvent sut = null; // = new HierarchyEvent(java.awt.Component, int, java.awt.Component,
                                         // java.awt.Container);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.awt.event.HierarchyEvent#HierarchyEvent(java.awt.Component, int, java.awt.Component, java.awt.Container, long)
     * public java.awt.event.HierarchyEvent(java.awt.Component,int,java.awt.Component,java.awt.Container,long)}.
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
    public void create_HierarchyEvent_Component_int_Component_Container_long()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final HierarchyEvent sut = null; // = new HierarchyEvent(java.awt.Component, int, java.awt.Component,
                                         // java.awt.Container, long);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.awt.event.HierarchyEvent]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.awt.event.HierarchyEvent]

}
