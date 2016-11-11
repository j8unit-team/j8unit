package org.j8unit.repository.java.security;

import java.security.AccessController;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link AccessController} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.security.AccessControllerClassTests}).
 */

@RunWith(J8Unit4.class)
public class AccessControllerClassTest
implements AccessControllerClassTests<AccessController> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.security.AccessController]

    @Override
    public Class<AccessController> createNewSUT() {
        return AccessController.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link java.security.AccessController#doPrivilegedWithCombiner(java.security.PrivilegedExceptionAction, java.security.AccessControlContext, java.security.Permission...)
     * public static <T> T
     * java.security.AccessController.doPrivilegedWithCombiner(java.security.PrivilegedExceptionAction<T>,java.security.AccessControlContext,java.security.Permission...)
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
    public void test_doPrivilegedWithCombiner_PrivilegedExceptionAction_AccessControlContext_PermissionArray()
    throws Exception {
        // write some test for {@link
        // java.security.AccessController#doPrivilegedWithCombiner(java.security.PrivilegedExceptionAction,
        // java.security.AccessControlContext, java.security.Permission...)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link java.security.AccessController#doPrivilegedWithCombiner(java.security.PrivilegedAction, java.security.AccessControlContext, java.security.Permission...)
     * public static <T> T
     * java.security.AccessController.doPrivilegedWithCombiner(java.security.PrivilegedAction<T>,java.security.AccessControlContext,java.security.Permission...)}.
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
    public void test_doPrivilegedWithCombiner_PrivilegedAction_AccessControlContext_PermissionArray()
    throws Exception {
        // write some test for {@link
        // java.security.AccessController#doPrivilegedWithCombiner(java.security.PrivilegedAction,
        // java.security.AccessControlContext, java.security.Permission...)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link java.security.AccessController#doPrivilegedWithCombiner(java.security.PrivilegedExceptionAction) public
     * static <T> T java.security.AccessController.doPrivilegedWithCombiner(java.security.PrivilegedExceptionAction<T>)
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
    public void test_doPrivilegedWithCombiner_PrivilegedExceptionAction()
    throws Exception {
        // write some test for {@link
        // java.security.AccessController#doPrivilegedWithCombiner(java.security.PrivilegedExceptionAction)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link java.security.AccessController#doPrivilegedWithCombiner(java.security.PrivilegedAction) public static <T>
     * T java.security.AccessController.doPrivilegedWithCombiner(java.security.PrivilegedAction<T>)}.
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
    public void test_doPrivilegedWithCombiner_PrivilegedAction()
    throws Exception {
        // write some test for {@link
        // java.security.AccessController#doPrivilegedWithCombiner(java.security.PrivilegedAction)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link java.security.AccessController#doPrivileged(java.security.PrivilegedExceptionAction, java.security.AccessControlContext, java.security.Permission...)
     * public static <T> T
     * java.security.AccessController.doPrivileged(java.security.PrivilegedExceptionAction<T>,java.security.AccessControlContext,java.security.Permission...)
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
    public void test_doPrivileged_PrivilegedExceptionAction_AccessControlContext_PermissionArray()
    throws Exception {
        // write some test for {@link
        // java.security.AccessController#doPrivileged(java.security.PrivilegedExceptionAction,
        // java.security.AccessControlContext, java.security.Permission...)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link java.security.AccessController#doPrivileged(java.security.PrivilegedExceptionAction, java.security.AccessControlContext)
     * public static native <T> T
     * java.security.AccessController.doPrivileged(java.security.PrivilegedExceptionAction<T>,java.security.AccessControlContext)
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
    public void test_doPrivileged_PrivilegedExceptionAction_AccessControlContext()
    throws Exception {
        // write some test for {@link
        // java.security.AccessController#doPrivileged(java.security.PrivilegedExceptionAction,
        // java.security.AccessControlContext)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link java.security.AccessController#doPrivileged(java.security.PrivilegedAction) public static native <T> T
     * java.security.AccessController.doPrivileged(java.security.PrivilegedAction<T>)}.
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
    public void test_doPrivileged_PrivilegedAction()
    throws Exception {
        // write some test for {@link java.security.AccessController#doPrivileged(java.security.PrivilegedAction)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link java.security.AccessController#doPrivileged(java.security.PrivilegedAction, java.security.AccessControlContext, java.security.Permission...)
     * public static <T> T
     * java.security.AccessController.doPrivileged(java.security.PrivilegedAction<T>,java.security.AccessControlContext,java.security.Permission...)}.
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
    public void test_doPrivileged_PrivilegedAction_AccessControlContext_PermissionArray()
    throws Exception {
        // write some test for {@link java.security.AccessController#doPrivileged(java.security.PrivilegedAction,
        // java.security.AccessControlContext, java.security.Permission...)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link java.security.AccessController#doPrivileged(java.security.PrivilegedAction, java.security.AccessControlContext)
     * public static native <T> T
     * java.security.AccessController.doPrivileged(java.security.PrivilegedAction<T>,java.security.AccessControlContext)}.
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
    public void test_doPrivileged_PrivilegedAction_AccessControlContext()
    throws Exception {
        // write some test for {@link java.security.AccessController#doPrivileged(java.security.PrivilegedAction,
        // java.security.AccessControlContext)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link java.security.AccessController#doPrivileged(java.security.PrivilegedExceptionAction) public static native
     * <T> T java.security.AccessController.doPrivileged(java.security.PrivilegedExceptionAction<T>) throws
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
    public void test_doPrivileged_PrivilegedExceptionAction()
    throws Exception {
        // write some test for {@link
        // java.security.AccessController#doPrivileged(java.security.PrivilegedExceptionAction)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link java.security.AccessController#getContext() public
     * static java.security.AccessControlContext java.security.AccessController.getContext()}.
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
    public void test_getContext()
    throws Exception {
        // write some test for {@link java.security.AccessController#getContext()}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link java.security.AccessController#checkPermission(java.security.Permission) public static void
     * java.security.AccessController.checkPermission(java.security.Permission) throws
     * java.security.AccessControlException}.
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
    public void test_checkPermission_Permission()
    throws Exception {
        // write some test for {@link java.security.AccessController#checkPermission(java.security.Permission)}
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.security.AccessController]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.security.AccessController]

}
