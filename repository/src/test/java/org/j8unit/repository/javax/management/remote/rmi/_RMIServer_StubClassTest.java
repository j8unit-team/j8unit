package org.j8unit.repository.javax.management.remote.rmi;

import javax.management.remote.rmi._RMIServer_Stub;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link _RMIServer_Stub} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.management.remote.rmi._RMIServer_StubClassTests}).
 */
@RunWith(J8Unit4.class)
public class _RMIServer_StubClassTest
implements _RMIServer_StubClassTests<_RMIServer_Stub> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.management.remote.rmi._RMIServer_Stub]

    @Override
    public Class<_RMIServer_Stub> createNewSUT() {
        return _RMIServer_Stub.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.management.remote.rmi._RMIServer_Stub#_RMIServer_Stub() public
     * javax.management.remote.rmi._RMIServer_Stub()}.
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
    public void create__RMIServer_Stub()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final _RMIServer_Stub sut = new _RMIServer_Stub();
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.management.remote.rmi._RMIServer_Stub]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.management.remote.rmi._RMIServer_Stub]

}
