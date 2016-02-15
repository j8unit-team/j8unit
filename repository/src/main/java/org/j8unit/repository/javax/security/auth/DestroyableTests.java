package org.j8unit.repository.javax.security.auth;

import org.j8unit.repository.RepositoryTests;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.security.auth.Destroyable interface javax.security.auth.Destroyable}
 * . The complementary j8unit test interface containing the class relevant aspects is {@link DestroyableClassTests}.
 * </p>
 *
 * @see javax.security.auth.Destroyable interface javax.security.auth.Destroyable (the hereby targeted class-under-test
 *      class)
 * @see DestroyableClassTests DestroyableClassTests (the complementary j8unit test interface containing the class
 *      relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface DestroyableTests<SUT extends javax.security.auth.Destroyable>
extends RepositoryTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.security.auth.Destroyable#isDestroyed() public default boolean
     * javax.security.auth.Destroyable.isDestroyed()}.
     *
     * <p>
     * Test method for {@link javax.security.auth.Destroyable#isDestroyed() public default boolean
     * javax.security.auth.Destroyable.isDestroyed()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.security.auth.Destroyable#isDestroyed() public default boolean
     *      javax.security.auth.Destroyable.isDestroyed() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_isDestroyed()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.security.auth.Destroyable#destroy() public default void
     * javax.security.auth.Destroyable.destroy() throws javax.security.auth.DestroyFailedException}.
     *
     * <p>
     * Test method for {@link javax.security.auth.Destroyable#destroy() public default void
     * javax.security.auth.Destroyable.destroy() throws javax.security.auth.DestroyFailedException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.security.auth.Destroyable#destroy() public default void javax.security.auth.Destroyable.destroy()
     *      throws javax.security.auth.DestroyFailedException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_destroy()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
