package org.j8unit.repository.javax.management.remote.rmi;

import javax.management.remote.rmi.RMIConnectionImpl;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link RMIConnectionImpl} (by simply reusing the
 * J8Unit test interface {@link RMIConnectionImplClassTests}).
 */

@RunWith(J8Unit4.class)
public class RMIConnectionImplClassTest
implements RMIConnectionImplClassTests<RMIConnectionImpl> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.management.remote.rmi.RMIConnectionImpl]

    @Override
    public Class<RMIConnectionImpl> createNewSUT() {
        return RMIConnectionImpl.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.management.remote.rmi.RMIConnectionImpl#RMIConnectionImpl(javax.management.remote.rmi.RMIServerImpl, String, ClassLoader, javax.security.auth.Subject, java.util.Map)
     * public
     * javax.management.remote.rmi.RMIConnectionImpl(javax.management.remote.rmi.RMIServerImpl,java.lang.String,java.lang.ClassLoader,javax.security.auth.Subject,java.util.Map<java.lang.String,
     * ?>)}.
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
    public void create_RMIConnectionImpl_RMIServerImpl_String_ClassLoader_Subject_Map()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final RMIConnectionImpl sut = null; // = new RMIConnectionImpl(javax.management.remote.rmi.RMIServerImpl,
                                            // String, ClassLoader, javax.security.auth.Subject, java.util.Map);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.management.remote.rmi.RMIConnectionImpl]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.management.remote.rmi.RMIConnectionImpl]

}
