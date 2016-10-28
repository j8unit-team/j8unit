package org.j8unit.repository.javax.swing.event;

import java.awt.Container;
import javax.swing.JComponent;
import javax.swing.event.AncestorEvent;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class AncestorEventClassTest
implements org.j8unit.repository.javax.swing.event.AncestorEventClassTests<AncestorEvent> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.event.AncestorEvent]

    @Override
    public Class<AncestorEvent> createNewSUT() {
        return AncestorEvent.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link AncestorEvent#AncestorEvent(JComponent, int, Container, Container) public
     * javax.swing.event.AncestorEvent(javax.swing.JComponent,int,java.awt.Container,java.awt.Container)}.
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
    public void create_AncestorEvent_JComponent_int_Container_Container()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final AncestorEvent sut = null; // = new AncestorEvent(JComponent, int, Container, Container);
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.event.AncestorEvent]

}
