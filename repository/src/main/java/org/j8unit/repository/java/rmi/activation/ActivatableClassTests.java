package org.j8unit.repository.java.rmi.activation;

import static org.junit.Assert.assertTrue;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link java.rmi.activation.Activatable class java.rmi.activation.Activatable}, containing all class
 * relevant test methods (at least the test methods of accessible constructors and of accessible {@code static}
 * methods). The counterpart test class containing the instance relevant test methods is
 * {@link org.j8unit.repository.java.rmi.activation.ActivatableTests}.
 * </p>
 *
 * <p>
 * In addition, there may be assertions concerning the class itself. For example,
 * <a href="https://docs.oracle.com/javase/specs/jls/se8/html/jls-9.html#jls-9.6.1">
 * <q>by virtue of the AnnotationTypeElementDeclaration production, a method declaration in an annotation type
 * declaration cannot have formal parameters, type parameters, or a throws clause.</q> (JLS, Sec.&thinsp;9.6.1</a> Thus,
 * {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests} provides a corresponding, inheritable test
 * method: {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests#hasNoCustomParametrizedMethod()}.
 * Similarly, this class is not only intended to assert some static method's behaviour but also to verify runtime
 * constraints and further class specific requirements.
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.java.rmi.activation.ActivatableTests
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ActivatableClassTests<SUT extends Class<? extends java.rmi.activation.Activatable>>
extends org.j8unit.repository.java.rmi.server.RemoteServerClassTests<SUT> {

    /**
     * <p>
     * Test method for
     * {@link java.rmi.activation.Activatable#exportObject(java.rmi.Remote,java.rmi.activation.ActivationID,int) public
     * static java.rmi.Remote
     * java.rmi.activation.Activatable.exportObject(java.rmi.Remote,java.rmi.activation.ActivationID,int) throws
     * java.rmi.RemoteException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_exportObject_Remote_ActivationID_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.rmi.activation.Activatable#exportObject(java.rmi.Remote,java.rmi.activation.ActivationID,int,java.rmi.server.RMIClientSocketFactory,java.rmi.server.RMIServerSocketFactory)
     * public static java.rmi.Remote
     * java.rmi.activation.Activatable.exportObject(java.rmi.Remote,java.rmi.activation.ActivationID,int,java.rmi.server.RMIClientSocketFactory,java.rmi.server.RMIServerSocketFactory)
     * throws java.rmi.RemoteException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_exportObject_Remote_ActivationID_int_RMIClientSocketFactory_RMIServerSocketFactory()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.rmi.activation.Activatable#exportObject(java.rmi.Remote,java.lang.String,java.rmi.MarshalledObject,boolean,int)
     * public static java.rmi.activation.ActivationID
     * java.rmi.activation.Activatable.exportObject(java.rmi.Remote,java.lang.String,java.rmi.MarshalledObject,boolean,int)
     * throws java.rmi.activation.ActivationException,java.rmi.RemoteException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_exportObject_Remote_String_MarshalledObject_boolean_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.rmi.activation.Activatable#exportObject(java.rmi.Remote,java.lang.String,java.rmi.MarshalledObject,boolean,int,java.rmi.server.RMIClientSocketFactory,java.rmi.server.RMIServerSocketFactory)
     * public static java.rmi.activation.ActivationID
     * java.rmi.activation.Activatable.exportObject(java.rmi.Remote,java.lang.String,java.rmi.MarshalledObject,boolean,int,java.rmi.server.RMIClientSocketFactory,java.rmi.server.RMIServerSocketFactory)
     * throws java.rmi.activation.ActivationException,java.rmi.RemoteException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_exportObject_Remote_String_MarshalledObject_boolean_int_RMIClientSocketFactory_RMIServerSocketFactory()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.rmi.activation.Activatable#inactive(java.rmi.activation.ActivationID) public static
     * boolean java.rmi.activation.Activatable.inactive(java.rmi.activation.ActivationID) throws
     * java.rmi.activation.UnknownObjectException,java.rmi.activation.ActivationException,java.rmi.RemoteException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_inactive_ActivationID()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.rmi.activation.Activatable#register(java.rmi.activation.ActivationDesc) public static
     * java.rmi.Remote java.rmi.activation.Activatable.register(java.rmi.activation.ActivationDesc) throws
     * java.rmi.activation.UnknownGroupException,java.rmi.activation.ActivationException,java.rmi.RemoteException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_register_ActivationDesc()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.rmi.activation.Activatable#unexportObject(java.rmi.Remote,boolean) public static
     * boolean java.rmi.activation.Activatable.unexportObject(java.rmi.Remote,boolean) throws
     * java.rmi.NoSuchObjectException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_unexportObject_Remote_boolean()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.rmi.activation.Activatable#unregister(java.rmi.activation.ActivationID) public static
     * void java.rmi.activation.Activatable.unregister(java.rmi.activation.ActivationID) throws
     * java.rmi.activation.UnknownObjectException,java.rmi.activation.ActivationException,java.rmi.RemoteException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_unregister_ActivationID()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    @Override
    @Test
    public default void testBaseTypeIsAssignableFromCurrentType()
    throws Exception {
        // create new instance
        final Class<? extends java.rmi.activation.Activatable> sut = createNewSUT();
        // assert assignability
        assertTrue(java.rmi.activation.Activatable.class.isAssignableFrom(sut));
    }

}
