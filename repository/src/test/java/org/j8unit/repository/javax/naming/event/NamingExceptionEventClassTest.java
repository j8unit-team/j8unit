package org.j8unit.repository.javax.naming.event;

import javax.naming.NamingException;
import javax.naming.event.EventContext;
import javax.naming.event.NamingExceptionEvent;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class NamingExceptionEventClassTest
implements org.j8unit.repository.javax.naming.event.NamingExceptionEventClassTests<NamingExceptionEvent> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.naming.event.NamingExceptionEvent]

    @Override
    public Class<NamingExceptionEvent> createNewSUT() {
        return NamingExceptionEvent.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link NamingExceptionEvent#NamingExceptionEvent(EventContext, NamingException) public
     * javax.naming.event.NamingExceptionEvent(javax.naming.event.EventContext,javax.naming.NamingException)}.
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
    public void create_NamingExceptionEvent_EventContext_NamingException()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final NamingExceptionEvent sut = null; // = new NamingExceptionEvent(EventContext, NamingException);
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.naming.event.NamingExceptionEvent]

}
