package org.j8unit.repository.java.lang.management;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.lang.management.MemoryManagerMXBean interface
 * java.lang.management.MemoryManagerMXBean}. The complementary j8unit test interface containing the class relevant
 * aspects is {@link MemoryManagerMXBeanClassTests}.
 * </p>
 *
 * @see java.lang.management.MemoryManagerMXBean interface java.lang.management.MemoryManagerMXBean (the hereby targeted
 *      class-under-test class)
 * @see MemoryManagerMXBeanClassTests MemoryManagerMXBeanClassTests (the complementary j8unit test interface containing
 *      the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface MemoryManagerMXBeanTests<SUT extends java.lang.management.MemoryManagerMXBean>
extends PlatformManagedObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.lang.management.MemoryManagerMXBean#getMemoryPoolNames() public abstract
     * java.lang.String[] java.lang.management.MemoryManagerMXBean.getMemoryPoolNames()}.
     *
     * <p>
     * Test method for {@link java.lang.management.MemoryManagerMXBean#getMemoryPoolNames() public abstract
     * java.lang.String[] java.lang.management.MemoryManagerMXBean.getMemoryPoolNames()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.lang.management.MemoryManagerMXBean#getMemoryPoolNames() public abstract java.lang.String[]
     *      java.lang.management.MemoryManagerMXBean.getMemoryPoolNames() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getMemoryPoolNames()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.lang.management.MemoryManagerMXBean#getName() public abstract java.lang.String
     * java.lang.management.MemoryManagerMXBean.getName()}.
     *
     * <p>
     * Test method for {@link java.lang.management.MemoryManagerMXBean#getName() public abstract java.lang.String
     * java.lang.management.MemoryManagerMXBean.getName()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.lang.management.MemoryManagerMXBean#getName() public abstract java.lang.String
     *      java.lang.management.MemoryManagerMXBean.getName() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getName()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.lang.management.MemoryManagerMXBean#isValid() public abstract boolean
     * java.lang.management.MemoryManagerMXBean.isValid()}.
     *
     * <p>
     * Test method for {@link java.lang.management.MemoryManagerMXBean#isValid() public abstract boolean
     * java.lang.management.MemoryManagerMXBean.isValid()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.lang.management.MemoryManagerMXBean#isValid() public abstract boolean
     *      java.lang.management.MemoryManagerMXBean.isValid() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_isValid()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
