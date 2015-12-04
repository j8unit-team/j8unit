package org.j8unit.repository.java.rmi;

import static org.junit.Assert.assertTrue;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link java.rmi.Naming class java.rmi.Naming}, containing all class relevant test methods (at least
 * the test methods of accessible constructors and of accessible {@code static} methods). The counterpart test class
 * containing the instance relevant test methods is {@link org.j8unit.repository.java.rmi.NamingTests}.
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
 * @see org.j8unit.repository.java.rmi.NamingTests
 */
@Category(J8UnitRepository.class)
public abstract interface NamingClassTests<SUT extends Class<? extends java.rmi.Naming>>
extends org.j8unit.repository.java.lang.ObjectClassTests<SUT> {

    @Override
    @Test
    public default void testBaseTypeIsAssignableFromCurrentType()
    throws Exception {
        // create new instance
        final Class<? extends java.rmi.Naming> sut = createNewSUT();
        // assert assignability
        assertTrue(java.rmi.Naming.class.isAssignableFrom(sut));
    }

    /**
     * <p>
     * Test method for {@link java.rmi.Naming#lookup(java.lang.String) public static java.rmi.Remote
     * java.rmi.Naming.lookup(java.lang.String) throws
     * java.rmi.NotBoundException,java.net.MalformedURLException,java.rmi.RemoteException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_lookup_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.rmi.Naming#bind(java.lang.String,java.rmi.Remote) public static void
     * java.rmi.Naming.bind(java.lang.String,java.rmi.Remote) throws
     * java.rmi.AlreadyBoundException,java.net.MalformedURLException,java.rmi.RemoteException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_bind_String_Remote()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.rmi.Naming#rebind(java.lang.String,java.rmi.Remote) public static void
     * java.rmi.Naming.rebind(java.lang.String,java.rmi.Remote) throws
     * java.rmi.RemoteException,java.net.MalformedURLException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_rebind_String_Remote()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.rmi.Naming#unbind(java.lang.String) public static void
     * java.rmi.Naming.unbind(java.lang.String) throws
     * java.rmi.RemoteException,java.rmi.NotBoundException,java.net.MalformedURLException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_unbind_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.rmi.Naming#list(java.lang.String) public static java.lang.String[]
     * java.rmi.Naming.list(java.lang.String) throws java.rmi.RemoteException,java.net.MalformedURLException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_list_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
