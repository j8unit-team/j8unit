package org.j8unit.repository.javax.management.remote.rmi;

import javax.management.remote.rmi.RMIServerImpl_Stub;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class RMIServerImpl_StubClassTest
implements org.j8unit.repository.javax.management.remote.rmi.RMIServerImpl_StubClassTests<RMIServerImpl_Stub> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.management.remote.rmi.RMIServerImpl_Stub]

    @Override
    public Class<RMIServerImpl_Stub> createNewSUT() {
        return RMIServerImpl_Stub.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.management.remote.rmi.RMIServerImpl_Stub#RMIServerImpl_Stub(java.rmi.server.RemoteRef) public
     * javax.management.remote.rmi.RMIServerImpl_Stub(java.rmi.server.RemoteRef)}.
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
    public void create_RMIServerImpl_Stub_RemoteRef()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final RMIServerImpl_Stub sut = null; // = new RMIServerImpl_Stub(java.rmi.server.RemoteRef);
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.management.remote.rmi.RMIServerImpl_Stub]

}
