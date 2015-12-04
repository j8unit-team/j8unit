package org.j8unit.repository.java.security;

import static org.junit.Assert.assertTrue;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link java.security.AccessController class java.security.AccessController}, containing all class
 * relevant test methods (at least the test methods of accessible constructors and of accessible {@code static}
 * methods). The counterpart test class containing the instance relevant test methods is
 * {@link org.j8unit.repository.java.security.AccessControllerTests}.
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
 * @see org.j8unit.repository.java.security.AccessControllerTests
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface AccessControllerClassTests<SUT extends Class<? extends java.security.AccessController>>
extends org.j8unit.repository.java.lang.ObjectClassTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.security.AccessController#checkPermission(java.security.Permission) public static
     * void java.security.AccessController.checkPermission(java.security.Permission) throws
     * java.security.AccessControlException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_checkPermission_Permission()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.AccessController#doPrivileged(java.security.PrivilegedAction) public static
     * native java.lang.Object java.security.AccessController.doPrivileged(java.security.PrivilegedAction)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_doPrivileged_PrivilegedAction()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.security.AccessController#doPrivileged(java.security.PrivilegedAction,java.security.AccessControlContext)
     * public static native java.lang.Object
     * java.security.AccessController.doPrivileged(java.security.PrivilegedAction,java.security.AccessControlContext)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_doPrivileged_PrivilegedAction_AccessControlContext()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.security.AccessController#doPrivileged(java.security.PrivilegedAction,java.security.AccessControlContext,java.security.Permission...)
     * public static java.lang.Object
     * java.security.AccessController.doPrivileged(java.security.PrivilegedAction,java.security.AccessControlContext,java.security.Permission...)}
     * .
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_doPrivileged_PrivilegedAction_AccessControlContext_PermissionArray()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.AccessController#doPrivileged(java.security.PrivilegedExceptionAction)
     * public static native java.lang.Object
     * java.security.AccessController.doPrivileged(java.security.PrivilegedExceptionAction) throws
     * java.security.PrivilegedActionException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_doPrivileged_PrivilegedExceptionAction()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.security.AccessController#doPrivileged(java.security.PrivilegedExceptionAction,java.security.AccessControlContext)
     * public static native java.lang.Object
     * java.security.AccessController.doPrivileged(java.security.PrivilegedExceptionAction,java.security.AccessControlContext)
     * throws java.security.PrivilegedActionException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_doPrivileged_PrivilegedExceptionAction_AccessControlContext()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.security.AccessController#doPrivileged(java.security.PrivilegedExceptionAction,java.security.AccessControlContext,java.security.Permission...)
     * public static java.lang.Object
     * java.security.AccessController.doPrivileged(java.security.PrivilegedExceptionAction,java.security.AccessControlContext,java.security.Permission...)
     * throws java.security.PrivilegedActionException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_doPrivileged_PrivilegedExceptionAction_AccessControlContext_PermissionArray()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.AccessController#doPrivilegedWithCombiner(java.security.PrivilegedAction)
     * public static java.lang.Object
     * java.security.AccessController.doPrivilegedWithCombiner(java.security.PrivilegedAction)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_doPrivilegedWithCombiner_PrivilegedAction()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.security.AccessController#doPrivilegedWithCombiner(java.security.PrivilegedAction,java.security.AccessControlContext,java.security.Permission...)
     * public static java.lang.Object
     * java.security.AccessController.doPrivilegedWithCombiner(java.security.PrivilegedAction,java.security.AccessControlContext,java.security.Permission...)}
     * .
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_doPrivilegedWithCombiner_PrivilegedAction_AccessControlContext_PermissionArray()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.security.AccessController#doPrivilegedWithCombiner(java.security.PrivilegedExceptionAction) public
     * static java.lang.Object
     * java.security.AccessController.doPrivilegedWithCombiner(java.security.PrivilegedExceptionAction) throws
     * java.security.PrivilegedActionException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_doPrivilegedWithCombiner_PrivilegedExceptionAction()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.security.AccessController#doPrivilegedWithCombiner(java.security.PrivilegedExceptionAction,java.security.AccessControlContext,java.security.Permission...)
     * public static java.lang.Object
     * java.security.AccessController.doPrivilegedWithCombiner(java.security.PrivilegedExceptionAction,java.security.AccessControlContext,java.security.Permission...)
     * throws java.security.PrivilegedActionException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_doPrivilegedWithCombiner_PrivilegedExceptionAction_AccessControlContext_PermissionArray()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.AccessController#getContext() public static
     * java.security.AccessControlContext java.security.AccessController.getContext()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getContext()
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
        final Class<? extends java.security.AccessController> sut = createNewSUT();
        // assert assignability
        assertTrue(java.security.AccessController.class.isAssignableFrom(sut));
    }

}
