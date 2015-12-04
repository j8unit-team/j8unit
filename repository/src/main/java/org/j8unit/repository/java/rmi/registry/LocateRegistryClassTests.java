package org.j8unit.repository.java.rmi.registry;

import org.j8unit.*;
import org.j8unit.repository.categories.*;
import org.junit.*;
import org.junit.experimental.categories.Category;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import static org.junit.Assert.*;

/**
 * <p>
 * Test class for {@link java.rmi.registry.LocateRegistry class java.rmi.registry.LocateRegistry},
 * containing all class relevant test methods (at least the test methods of accessible constructors and
 * of accessible {@code static} methods). The counterpart test class containing the instance relevant test
 * methods is {@link org.j8unit.repository.java.rmi.registry.LocateRegistryTests}.
 * </p>
 *
 * <p>
 * In addition, there may be assertions concerning the class itself.
 * For example, <a href="https://docs.oracle.com/javase/specs/jls/se8/html/jls-9.html#jls-9.6.1"><q>by
 * virtue of the AnnotationTypeElementDeclaration production, a method declaration in an annotation type
 * declaration cannot have formal parameters, type parameters, or a throws clause.</q> (JLS, Sec.&thinsp;9.6.1</a>
 * Thus, {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests}
 * provides a corresponding, inheritable test method:
 * {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests#hasNoCustomParametrizedMethod()}.
 * Similarly, this class is not only intended to assert some static method's behaviour but also to verify
 * runtime constraints and further class specific requirements.
 * </p>
 *
 * @param SUT the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.java.rmi.registry.LocateRegistryTests
 */
@Category(J8UnitRepository.class)
public abstract interface LocateRegistryClassTests<SUT extends Class<? extends java.rmi.registry.LocateRegistry>>
extends org.j8unit.repository.java.lang.ObjectClassTests<SUT>
{

    @Test
    public default void testBaseTypeIsAssignableFromCurrentType() throws Exception {
        // create new instance
        Class<? extends java.rmi.registry.LocateRegistry> sut = createNewSUT();
        // assert assignability
        assertTrue(java.rmi.registry.LocateRegistry.class.isAssignableFrom(sut));
    }

    /**
     * <p>
     * Test method for {@link java.rmi.registry.LocateRegistry#getRegistry(java.lang.String) public static java.rmi.registry.Registry java.rmi.registry.LocateRegistry.getRegistry(java.lang.String) throws java.rmi.RemoteException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getRegistry_String() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.rmi.registry.LocateRegistry#getRegistry(java.lang.String,int) public static java.rmi.registry.Registry java.rmi.registry.LocateRegistry.getRegistry(java.lang.String,int) throws java.rmi.RemoteException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getRegistry_String_int() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.rmi.registry.LocateRegistry#getRegistry(java.lang.String,int,java.rmi.server.RMIClientSocketFactory) public static java.rmi.registry.Registry java.rmi.registry.LocateRegistry.getRegistry(java.lang.String,int,java.rmi.server.RMIClientSocketFactory) throws java.rmi.RemoteException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getRegistry_String_int_RMIClientSocketFactory() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.rmi.registry.LocateRegistry#getRegistry(int) public static java.rmi.registry.Registry java.rmi.registry.LocateRegistry.getRegistry(int) throws java.rmi.RemoteException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getRegistry_int() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.rmi.registry.LocateRegistry#getRegistry() public static java.rmi.registry.Registry java.rmi.registry.LocateRegistry.getRegistry() throws java.rmi.RemoteException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getRegistry() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.rmi.registry.LocateRegistry#createRegistry(int,java.rmi.server.RMIClientSocketFactory,java.rmi.server.RMIServerSocketFactory) public static java.rmi.registry.Registry java.rmi.registry.LocateRegistry.createRegistry(int,java.rmi.server.RMIClientSocketFactory,java.rmi.server.RMIServerSocketFactory) throws java.rmi.RemoteException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_createRegistry_int_RMIClientSocketFactory_RMIServerSocketFactory() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.rmi.registry.LocateRegistry#createRegistry(int) public static java.rmi.registry.Registry java.rmi.registry.LocateRegistry.createRegistry(int) throws java.rmi.RemoteException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_createRegistry_int() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
