package org.j8unit.repository.org.omg.stub.javax.management.remote.rmi;

import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.omg.stub.javax.management.remote.rmi._RMIConnection_Stub;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link _RMIConnection_Stub} (by simply reusing
 * the J8Unit test interface
 * {@link org.j8unit.repository.org.omg.stub.javax.management.remote.rmi._RMIConnection_StubClassTests}).
 */
@RunWith(J8Unit4.class)
@SuppressWarnings("restriction")
public class _RMIConnection_StubClassTest
implements _RMIConnection_StubClassTests<_RMIConnection_Stub> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.stub.javax.management.remote.rmi._RMIConnection_Stub]

    @Override
    public Class<_RMIConnection_Stub> createNewSUT() {
        return _RMIConnection_Stub.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link org.omg.stub.javax.management.remote.rmi._RMIConnection_Stub#_RMIConnection_Stub() public
     * org.omg.stub.javax.management.remote.rmi._RMIConnection_Stub()}.
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
    public void create__RMIConnection_Stub()
    throws Exception {
        // create new instance
        try (final _RMIConnection_Stub sut = new _RMIConnection_Stub()) {}
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.omg.stub.javax.management.remote.rmi._RMIConnection_Stub]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.stub.javax.management.remote.rmi._RMIConnection_Stub]

}
