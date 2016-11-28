package org.j8unit.repository.java.rmi.server;

import java.rmi.server.RemoteObject;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link RemoteObject} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.rmi.server.RemoteObjectClassTests}).
 */
@RunWith(J8Unit4.class)
public class RemoteObjectClassTest
implements RemoteObjectClassTests<RemoteObject> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.rmi.server.RemoteObject]

    @Override
    public Class<RemoteObject> createNewSUT() {
        return RemoteObject.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link java.rmi.server.RemoteObject#toStub(java.rmi.Remote)
     * public static java.rmi.Remote java.rmi.server.RemoteObject.toStub(java.rmi.Remote) throws
     * java.rmi.NoSuchObjectException}.
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
    public void test_toStub_Remote()
    throws Exception {
        // write some test for {@link java.rmi.server.RemoteObject#toStub(java.rmi.Remote)}
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.rmi.server.RemoteObject]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.rmi.server.RemoteObject]

}
