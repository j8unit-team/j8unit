package org.j8unit.repository.javax.security.auth;

import static org.junit.Assert.assertTrue;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain javax.security.auth.Subject class javax.security.auth.Subject},
 * containing all class relevant test methods (at least the test methods of accessible constructors and of accessible
 * {@code static} methods). The counterpart J8Unit test interface containing the instance relevant test methods is
 * {@link org.j8unit.repository.javax.security.auth.SubjectTests}.
 * </p>
 *
 * <p>
 * In addition, there may be assertions concerning the class itself. For example,
 * <a href="https://docs.oracle.com/javase/specs/jls/se8/html/jls-9.html#jls-9.6.1">
 * <q>by virtue of the AnnotationTypeElementDeclaration production, a method declaration in an annotation type
 * declaration cannot have formal parameters, type parameters, or a throws clause</q> (JLS, Sec.&thinsp;9.6.1</a>).
 * Thus, {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests} provides a corresponding, inheritable
 * test method: {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests#hasNoCustomParametrizedMethod()}.
 * Similarly, this class is not only intended to assert some static method's behaviour but also to verify runtime
 * constraints and further class specific requirements.
 * </p>
 *
 * @see org.j8unit.repository.javax.security.auth.SubjectTests
 *
 * @param SUT
 *            the class' type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim javax.security.auth.Subject
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface SubjectClassTests<SUT extends javax.security.auth.Subject>
extends org.j8unit.repository.java.io.SerializableClassTests<SUT>, org.j8unit.repository.java.lang.ObjectClassTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.security.auth.Subject#Subject() public javax.security.auth.Subject()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.security.auth.Subject#Subject()
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_Subject()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.security.auth.Subject sut = null; // = new Subject();
    }

    /**
     * <p>
     * Test method for {@link javax.security.auth.Subject#Subject(boolean, java.util.Set, java.util.Set, java.util.Set)
     * public javax.security.auth.Subject(boolean,java.util.Set,java.util.Set,java.util.Set)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.security.auth.Subject#Subject(boolean, java.util.Set, java.util.Set, java.util.Set)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void create_Subject_boolean_Set_Set_Set()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final javax.security.auth.Subject sut = null; // = new Subject(boolean, java.util.Set, java.util.Set,
                                                      // java.util.Set);
    }

    /**
     * <p>
     * Test method for
     * {@link javax.security.auth.Subject#doAs(javax.security.auth.Subject, java.security.PrivilegedAction) public
     * static java.lang.Object
     * javax.security.auth.Subject.doAs(javax.security.auth.Subject,java.security.PrivilegedAction)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.security.auth.Subject#doAs(javax.security.auth.Subject, java.security.PrivilegedAction)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_doAs_Subject_PrivilegedAction()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.security.auth.Subject#doAs(javax.security.auth.Subject, java.security.PrivilegedExceptionAction)
     * public static java.lang.Object
     * javax.security.auth.Subject.doAs(javax.security.auth.Subject,java.security.PrivilegedExceptionAction) throws
     * java.security.PrivilegedActionException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.security.auth.Subject#doAs(javax.security.auth.Subject,
     *             java.security.PrivilegedExceptionAction)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_doAs_Subject_PrivilegedExceptionAction()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.security.auth.Subject#doAsPrivileged(javax.security.auth.Subject, java.security.PrivilegedAction, java.security.AccessControlContext)
     * public static java.lang.Object
     * javax.security.auth.Subject.doAsPrivileged(javax.security.auth.Subject,java.security.PrivilegedAction,java.security.AccessControlContext)}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.security.auth.Subject#doAsPrivileged(javax.security.auth.Subject,
     *             java.security.PrivilegedAction, java.security.AccessControlContext)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_doAsPrivileged_Subject_PrivilegedAction_AccessControlContext()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.security.auth.Subject#doAsPrivileged(javax.security.auth.Subject, java.security.PrivilegedExceptionAction, java.security.AccessControlContext)
     * public static java.lang.Object
     * javax.security.auth.Subject.doAsPrivileged(javax.security.auth.Subject,java.security.PrivilegedExceptionAction,java.security.AccessControlContext)
     * throws java.security.PrivilegedActionException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.security.auth.Subject#doAsPrivileged(javax.security.auth.Subject,
     *             java.security.PrivilegedExceptionAction, java.security.AccessControlContext)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_doAsPrivileged_Subject_PrivilegedExceptionAction_AccessControlContext()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.security.auth.Subject#getSubject(java.security.AccessControlContext) public static
     * javax.security.auth.Subject javax.security.auth.Subject.getSubject(java.security.AccessControlContext)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.security.auth.Subject#getSubject(java.security.AccessControlContext)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getSubject_AccessControlContext()
    throws Exception {
        // query fresh subject-under-test
        final Class<SUT> sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * @since 0.9.2
     *
     * @j8unit.aim javax.security.auth.Subject#isAssignableFrom(java.lang.Class)
     */
    @Override
    @Test
    public default void testBaseTypeIsAssignableFromCurrentType()
    throws Exception {
        // create new instance
        final Class<SUT> sut = createNewSUT();
        // assert assignability
        assertTrue(javax.security.auth.Subject.class.isAssignableFrom(sut));
    }

}
