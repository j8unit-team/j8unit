package org.j8unit.repository.javax.security.auth;

import javax.security.auth.Subject;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SubjectClassTest
implements org.j8unit.repository.javax.security.auth.SubjectClassTests<Subject> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.security.auth.Subject]

    @Override
    public Class<Subject> createNewSUT() {
        return Subject.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link javax.security.auth.Subject#Subject() public
     * javax.security.auth.Subject()}.
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
    public void create_Subject()
    throws Exception {
        // create new instance
        final Subject sut = new Subject();
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.security.auth.Subject#Subject(boolean, java.util.Set, java.util.Set, java.util.Set) public
     * javax.security.auth.Subject(boolean,java.util.Set<? extends
     * java.security.Principal>,java.util.Set<?>,java.util.Set<?>)}.
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
    public void create_Subject_boolean_Set_Set_Set()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final Subject sut = null; // = new Subject(boolean, java.util.Set, java.util.Set, java.util.Set);
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link javax.security.auth.Subject#doAsPrivileged(javax.security.auth.Subject, java.security.PrivilegedAction, java.security.AccessControlContext)
     * public static <T> T
     * javax.security.auth.Subject.doAsPrivileged(javax.security.auth.Subject,java.security.PrivilegedAction<T>,java.security.AccessControlContext)}.
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
    public void test_doAsPrivileged_Subject_PrivilegedAction_AccessControlContext()
    throws Exception {
        // write some test for {@link javax.security.auth.Subject#doAsPrivileged(javax.security.auth.Subject,
        // java.security.PrivilegedAction, java.security.AccessControlContext)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link javax.security.auth.Subject#doAsPrivileged(javax.security.auth.Subject, java.security.PrivilegedExceptionAction, java.security.AccessControlContext)
     * public static <T> T
     * javax.security.auth.Subject.doAsPrivileged(javax.security.auth.Subject,java.security.PrivilegedExceptionAction<T>,java.security.AccessControlContext)
     * throws java.security.PrivilegedActionException}.
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
    public void test_doAsPrivileged_Subject_PrivilegedExceptionAction_AccessControlContext()
    throws Exception {
        // write some test for {@link javax.security.auth.Subject#doAsPrivileged(javax.security.auth.Subject,
        // java.security.PrivilegedExceptionAction, java.security.AccessControlContext)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link javax.security.auth.Subject#doAs(javax.security.auth.Subject, java.security.PrivilegedAction) public
     * static <T> T javax.security.auth.Subject.doAs(javax.security.auth.Subject,java.security.PrivilegedAction<T>)}.
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
    public void test_doAs_Subject_PrivilegedAction()
    throws Exception {
        // write some test for {@link javax.security.auth.Subject#doAs(javax.security.auth.Subject,
        // java.security.PrivilegedAction)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link javax.security.auth.Subject#doAs(javax.security.auth.Subject, java.security.PrivilegedExceptionAction)
     * public static <T> T
     * javax.security.auth.Subject.doAs(javax.security.auth.Subject,java.security.PrivilegedExceptionAction<T>) throws
     * java.security.PrivilegedActionException}.
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
    public void test_doAs_Subject_PrivilegedExceptionAction()
    throws Exception {
        // write some test for {@link javax.security.auth.Subject#doAs(javax.security.auth.Subject,
        // java.security.PrivilegedExceptionAction)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link javax.security.auth.Subject#getSubject(java.security.AccessControlContext) public static
     * javax.security.auth.Subject javax.security.auth.Subject.getSubject(java.security.AccessControlContext)}.
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
    public void test_getSubject_AccessControlContext()
    throws Exception {
        // write some test for {@link javax.security.auth.Subject#getSubject(java.security.AccessControlContext)}
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.security.auth.Subject]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.security.auth.Subject]

}
