package org.j8unit.repository.javax.management.remote.rmi;

import javax.management.remote.rmi.RMIJRMPServerImpl;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class RMIJRMPServerImplClassTest
implements org.j8unit.repository.javax.management.remote.rmi.RMIJRMPServerImplClassTests<RMIJRMPServerImpl> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.management.remote.rmi.RMIJRMPServerImpl]

    @Override
    public Class<RMIJRMPServerImpl> createNewSUT() {
        return RMIJRMPServerImpl.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.management.remote.rmi.RMIJRMPServerImpl#RMIJRMPServerImpl(int, java.rmi.server.RMIClientSocketFactory, java.rmi.server.RMIServerSocketFactory, java.util.Map)
     * public
     * javax.management.remote.rmi.RMIJRMPServerImpl(int,java.rmi.server.RMIClientSocketFactory,java.rmi.server.RMIServerSocketFactory,java.util.Map<java.lang.String,
     * ?>) throws java.io.IOException}.
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
    public void create_RMIJRMPServerImpl_int_RMIClientSocketFactory_RMIServerSocketFactory_Map()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final RMIJRMPServerImpl sut = null; // = new RMIJRMPServerImpl(int, java.rmi.server.RMIClientSocketFactory,
                                            // java.rmi.server.RMIServerSocketFactory, java.util.Map);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.management.remote.rmi.RMIJRMPServerImpl]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.management.remote.rmi.RMIJRMPServerImpl]

}
