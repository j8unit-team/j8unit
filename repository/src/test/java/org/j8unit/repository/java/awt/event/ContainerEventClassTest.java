package org.j8unit.repository.java.awt.event;

import java.awt.Component;
import java.awt.event.ContainerEvent;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ContainerEventClassTest
implements org.j8unit.repository.java.awt.event.ContainerEventClassTests<ContainerEvent> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.awt.event.ContainerEvent]

    @Override
    public Class<ContainerEvent> createNewSUT() {
        return ContainerEvent.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link ContainerEvent#ContainerEvent(Component, int, Component) public
     * java.awt.event.ContainerEvent(java.awt.Component,int,java.awt.Component)}.
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
    public void create_ContainerEvent_Component_int_Component()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final ContainerEvent sut = null; // = new ContainerEvent(Component, int, Component);
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.awt.event.ContainerEvent]

}
