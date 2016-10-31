package org.j8unit.repository.javax.naming.event;

import javax.naming.event.NamingEvent;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class NamingEventClassTest
implements org.j8unit.repository.javax.naming.event.NamingEventClassTests<NamingEvent> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.naming.event.NamingEvent]

    @Override
    public Class<NamingEvent> createNewSUT() {
        return NamingEvent.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.naming.event.NamingEvent#NamingEvent(javax.naming.event.EventContext, int, javax.naming.Binding, javax.naming.Binding, Object)
     * public
     * javax.naming.event.NamingEvent(javax.naming.event.EventContext,int,javax.naming.Binding,javax.naming.Binding,java.lang.Object)}.
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
    public void create_NamingEvent_EventContext_int_Binding_Binding_Object()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final NamingEvent sut = null; // = new NamingEvent(javax.naming.event.EventContext, int, javax.naming.Binding,
                                      // javax.naming.Binding, Object);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.naming.event.NamingEvent]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.naming.event.NamingEvent]

}
