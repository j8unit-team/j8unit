package org.j8unit.repository.java.rmi;

import java.rmi.Naming;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link Naming} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.java.rmi.NamingClassTests}).
 */

@RunWith(J8Unit4.class)
public class NamingClassTest
implements NamingClassTests<Naming> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.rmi.Naming]

    @Override
    public Class<Naming> createNewSUT() {
        return Naming.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link java.rmi.Naming#lookup(String) public static
     * java.rmi.Remote java.rmi.Naming.lookup(java.lang.String) throws
     * java.rmi.NotBoundException,java.net.MalformedURLException,java.rmi.RemoteException}.
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
    public void test_lookup_String()
    throws Exception {
        // write some test for {@link java.rmi.Naming#lookup(String)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link java.rmi.Naming#bind(String, java.rmi.Remote) public
     * static void java.rmi.Naming.bind(java.lang.String,java.rmi.Remote) throws
     * java.rmi.AlreadyBoundException,java.net.MalformedURLException,java.rmi.RemoteException}.
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
    public void test_bind_String_Remote()
    throws Exception {
        // write some test for {@link java.rmi.Naming#bind(String, java.rmi.Remote)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link java.rmi.Naming#unbind(String) public static void
     * java.rmi.Naming.unbind(java.lang.String) throws
     * java.rmi.RemoteException,java.rmi.NotBoundException,java.net.MalformedURLException}.
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
    public void test_unbind_String()
    throws Exception {
        // write some test for {@link java.rmi.Naming#unbind(String)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link java.rmi.Naming#rebind(String, java.rmi.Remote)
     * public static void java.rmi.Naming.rebind(java.lang.String,java.rmi.Remote) throws
     * java.rmi.RemoteException,java.net.MalformedURLException}.
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
    public void test_rebind_String_Remote()
    throws Exception {
        // write some test for {@link java.rmi.Naming#rebind(String, java.rmi.Remote)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link java.rmi.Naming#list(String) public static
     * java.lang.String[] java.rmi.Naming.list(java.lang.String) throws
     * java.rmi.RemoteException,java.net.MalformedURLException}.
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
    public void test_list_String()
    throws Exception {
        // write some test for {@link java.rmi.Naming#list(String)}
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.rmi.Naming]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.rmi.Naming]

}
