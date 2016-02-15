package org.j8unit.repository.java.lang.management;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.lang.management.LockInfo class java.lang.management.LockInfo}. The
 * complementary j8unit test interface containing the class relevant aspects is {@link LockInfoClassTests}.
 * </p>
 *
 * @see java.lang.management.LockInfo class java.lang.management.LockInfo (the hereby targeted class-under-test class)
 * @see LockInfoClassTests LockInfoClassTests (the complementary j8unit test interface containing the class relevant
 *      test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface LockInfoTests<SUT extends java.lang.management.LockInfo>
extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.lang.management.LockInfo#getIdentityHashCode() public int
     * java.lang.management.LockInfo.getIdentityHashCode()}.
     *
     * <p>
     * Test method for {@link java.lang.management.LockInfo#getIdentityHashCode() public int
     * java.lang.management.LockInfo.getIdentityHashCode()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.lang.management.LockInfo#getIdentityHashCode() public int
     *      java.lang.management.LockInfo.getIdentityHashCode() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getIdentityHashCode()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.lang.management.LockInfo#getClassName() public java.lang.String
     * java.lang.management.LockInfo.getClassName()}.
     *
     * <p>
     * Test method for {@link java.lang.management.LockInfo#getClassName() public java.lang.String
     * java.lang.management.LockInfo.getClassName()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.lang.management.LockInfo#getClassName() public java.lang.String
     *      java.lang.management.LockInfo.getClassName() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getClassName()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.lang.management.LockInfo#toString() public java.lang.String
     * java.lang.management.LockInfo.toString()}.
     *
     * <p>
     * Test method for {@link java.lang.management.LockInfo#toString() public java.lang.String
     * java.lang.management.LockInfo.toString()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.lang.management.LockInfo#toString() public java.lang.String java.lang.management.LockInfo.toString()
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_toString()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
