package org.j8unit.repository.java.rmi.activation;

import java.rmi.MarshalledObject;
import java.rmi.Remote;
import java.rmi.activation.Activatable;
import java.rmi.activation.ActivationDesc;
import java.rmi.activation.ActivationID;
import java.rmi.server.RMIClientSocketFactory;
import java.rmi.server.RMIServerSocketFactory;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ActivatableClassTest
implements org.j8unit.repository.java.rmi.activation.ActivatableClassTests<Activatable> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.rmi.activation.Activatable]

    @Override
    public Class<Activatable> createNewSUT() {
        return Activatable.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link Activatable#exportObject(Remote, String, MarshalledObject, boolean, int, RMIClientSocketFactory, RMIServerSocketFactory)
     * public static java.rmi.activation.ActivationID
     * java.rmi.activation.Activatable.exportObject(java.rmi.Remote,java.lang.String,java.rmi.MarshalledObject
     * <?>,boolean,int,java.rmi.server.RMIClientSocketFactory,java.rmi.server.RMIServerSocketFactory) throws
     * java.rmi.activation.ActivationException,java.rmi.RemoteException}.
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
    public void test_exportObject_Remote_String_MarshalledObject_boolean_int_RMIClientSocketFactory_RMIServerSocketFactory()
    throws Exception {
        // write some test for {@link Activatable#exportObject(Remote, String, MarshalledObject, boolean, int,
        // RMIClientSocketFactory, RMIServerSocketFactory)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link Activatable#exportObject(Remote, ActivationID, int)
     * public static java.rmi.Remote
     * java.rmi.activation.Activatable.exportObject(java.rmi.Remote,java.rmi.activation.ActivationID,int) throws
     * java.rmi.RemoteException}.
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
    public void test_exportObject_Remote_ActivationID_int()
    throws Exception {
        // write some test for {@link Activatable#exportObject(Remote, ActivationID, int)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link Activatable#exportObject(Remote, ActivationID, int, RMIClientSocketFactory, RMIServerSocketFactory) public
     * static java.rmi.Remote
     * java.rmi.activation.Activatable.exportObject(java.rmi.Remote,java.rmi.activation.ActivationID,int,java.rmi.server.RMIClientSocketFactory,java.rmi.server.RMIServerSocketFactory)
     * throws java.rmi.RemoteException}.
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
    public void test_exportObject_Remote_ActivationID_int_RMIClientSocketFactory_RMIServerSocketFactory()
    throws Exception {
        // write some test for {@link Activatable#exportObject(Remote, ActivationID, int, RMIClientSocketFactory,
        // RMIServerSocketFactory)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link Activatable#exportObject(Remote, String, MarshalledObject, boolean, int) public static
     * java.rmi.activation.ActivationID
     * java.rmi.activation.Activatable.exportObject(java.rmi.Remote,java.lang.String,java.rmi.MarshalledObject
     * <?>,boolean,int) throws java.rmi.activation.ActivationException,java.rmi.RemoteException}.
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
    public void test_exportObject_Remote_String_MarshalledObject_boolean_int()
    throws Exception {
        // write some test for {@link Activatable#exportObject(Remote, String, MarshalledObject, boolean, int)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link Activatable#inactive(ActivationID) public static
     * boolean java.rmi.activation.Activatable.inactive(java.rmi.activation.ActivationID) throws
     * java.rmi.activation.UnknownObjectException,java.rmi.activation.ActivationException,java.rmi.RemoteException}.
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
    public void test_inactive_ActivationID()
    throws Exception {
        // write some test for {@link Activatable#inactive(ActivationID)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link Activatable#unexportObject(Remote, boolean) public
     * static boolean java.rmi.activation.Activatable.unexportObject(java.rmi.Remote,boolean) throws
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
    public void test_unexportObject_Remote_boolean()
    throws Exception {
        // write some test for {@link Activatable#unexportObject(Remote, boolean)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link Activatable#register(ActivationDesc) public static
     * java.rmi.Remote java.rmi.activation.Activatable.register(java.rmi.activation.ActivationDesc) throws
     * java.rmi.activation.UnknownGroupException,java.rmi.activation.ActivationException,java.rmi.RemoteException}.
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
    public void test_register_ActivationDesc()
    throws Exception {
        // write some test for {@link Activatable#register(ActivationDesc)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link Activatable#unregister(ActivationID) public static
     * void java.rmi.activation.Activatable.unregister(java.rmi.activation.ActivationID) throws
     * java.rmi.activation.UnknownObjectException,java.rmi.activation.ActivationException,java.rmi.RemoteException}.
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
    public void test_unregister_ActivationID()
    throws Exception {
        // write some test for {@link Activatable#unregister(ActivationID)}
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.rmi.activation.Activatable]

}
