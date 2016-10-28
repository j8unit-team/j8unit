package org.j8unit.repository.java.rmi.server;

import java.io.OutputStream;
import java.rmi.server.RemoteServer;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class RemoteServerClassTest
implements org.j8unit.repository.java.rmi.server.RemoteServerClassTests<RemoteServer> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.rmi.server.RemoteServer]

    @Override
    public Class<RemoteServer> createNewSUT() {
        return RemoteServer.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link RemoteServer#getLog() public static
     * java.io.PrintStream java.rmi.server.RemoteServer.getLog()}.
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
    public void test_getLog()
    throws Exception {
        // write some test for {@link RemoteServer#getLog()}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link RemoteServer#setLog(OutputStream) public static void
     * java.rmi.server.RemoteServer.setLog(java.io.OutputStream)}.
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
    public void test_setLog_OutputStream()
    throws Exception {
        // write some test for {@link RemoteServer#setLog(OutputStream)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link RemoteServer#getClientHost() public static
     * java.lang.String java.rmi.server.RemoteServer.getClientHost() throws java.rmi.server.ServerNotActiveException}.
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
    public void test_getClientHost()
    throws Exception {
        // write some test for {@link RemoteServer#getClientHost()}
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.rmi.server.RemoteServer]

}
