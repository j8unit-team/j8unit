package org.j8unit.repository.java.rmi.server;

import java.rmi.server.RemoteObjectInvocationHandler;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class RemoteObjectInvocationHandlerClassTest
implements org.j8unit.repository.java.rmi.server.RemoteObjectInvocationHandlerClassTests<RemoteObjectInvocationHandler> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.rmi.server.RemoteObjectInvocationHandler]

    @Override
    public Class<RemoteObjectInvocationHandler> createNewSUT() {
        return RemoteObjectInvocationHandler.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.rmi.server.RemoteObjectInvocationHandler#RemoteObjectInvocationHandler(java.rmi.server.RemoteRef)
     * public java.rmi.server.RemoteObjectInvocationHandler(java.rmi.server.RemoteRef)}.
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
    public void create_RemoteObjectInvocationHandler_RemoteRef()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final RemoteObjectInvocationHandler sut = null; // = new
                                                        // RemoteObjectInvocationHandler(java.rmi.server.RemoteRef);
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.rmi.server.RemoteObjectInvocationHandler]

}
