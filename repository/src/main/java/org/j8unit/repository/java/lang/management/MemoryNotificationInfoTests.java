package org.j8unit.repository.java.lang.management;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.lang.management.MemoryNotificationInfo class
 * java.lang.management.MemoryNotificationInfo}. The complementary j8unit test interface containing the class relevant
 * aspects is {@link MemoryNotificationInfoClassTests}.
 * </p>
 *
 * @see java.lang.management.MemoryNotificationInfo class java.lang.management.MemoryNotificationInfo (the hereby
 *      targeted class-under-test class)
 * @see MemoryNotificationInfoClassTests MemoryNotificationInfoClassTests (the complementary j8unit test interface
 *      containing the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface MemoryNotificationInfoTests<SUT extends java.lang.management.MemoryNotificationInfo>
extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.lang.management.MemoryNotificationInfo#getCount() public long
     * java.lang.management.MemoryNotificationInfo.getCount()}.
     *
     * <p>
     * Test method for {@link java.lang.management.MemoryNotificationInfo#getCount() public long
     * java.lang.management.MemoryNotificationInfo.getCount()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.lang.management.MemoryNotificationInfo#getCount() public long
     *      java.lang.management.MemoryNotificationInfo.getCount() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getCount()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.lang.management.MemoryNotificationInfo#getPoolName() public java.lang.String
     * java.lang.management.MemoryNotificationInfo.getPoolName()}.
     *
     * <p>
     * Test method for {@link java.lang.management.MemoryNotificationInfo#getPoolName() public java.lang.String
     * java.lang.management.MemoryNotificationInfo.getPoolName()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.lang.management.MemoryNotificationInfo#getPoolName() public java.lang.String
     *      java.lang.management.MemoryNotificationInfo.getPoolName() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getPoolName()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.lang.management.MemoryNotificationInfo#getUsage() public
     * java.lang.management.MemoryUsage java.lang.management.MemoryNotificationInfo.getUsage()}.
     *
     * <p>
     * Test method for {@link java.lang.management.MemoryNotificationInfo#getUsage() public
     * java.lang.management.MemoryUsage java.lang.management.MemoryNotificationInfo.getUsage()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.lang.management.MemoryNotificationInfo#getUsage() public java.lang.management.MemoryUsage
     *      java.lang.management.MemoryNotificationInfo.getUsage() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getUsage()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
