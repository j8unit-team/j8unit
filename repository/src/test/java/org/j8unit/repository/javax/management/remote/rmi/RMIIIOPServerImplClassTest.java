package org.j8unit.repository.javax.management.remote.rmi;

import javax.management.remote.rmi.RMIIIOPServerImpl;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link RMIIIOPServerImpl} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.management.remote.rmi.RMIIIOPServerImplClassTests}).
 */

@RunWith(J8Unit4.class)
public class RMIIIOPServerImplClassTest
implements RMIIIOPServerImplClassTests<RMIIIOPServerImpl> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.management.remote.rmi.RMIIIOPServerImpl]

    @Override
    public Class<RMIIIOPServerImpl> createNewSUT() {
        return RMIIIOPServerImpl.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.management.remote.rmi.RMIIIOPServerImpl#RMIIIOPServerImpl(java.util.Map) public
     * javax.management.remote.rmi.RMIIIOPServerImpl(java.util.Map<java.lang.String, ?>) throws java.io.IOException}.
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
    public void create_RMIIIOPServerImpl_Map()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final RMIIIOPServerImpl sut = null; // = new RMIIIOPServerImpl(java.util.Map);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.management.remote.rmi.RMIIIOPServerImpl]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.management.remote.rmi.RMIIIOPServerImpl]

}
