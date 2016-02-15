package org.j8unit.repository.java.lang.management;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.lang.management.MonitorInfo class java.lang.management.MonitorInfo}.
 * The complementary j8unit test interface containing the class relevant aspects is {@link MonitorInfoClassTests}.
 * </p>
 *
 * @see java.lang.management.MonitorInfo class java.lang.management.MonitorInfo (the hereby targeted class-under-test
 *      class)
 * @see MonitorInfoClassTests MonitorInfoClassTests (the complementary j8unit test interface containing the class
 *      relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface MonitorInfoTests<SUT extends java.lang.management.MonitorInfo>
extends LockInfoTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.lang.management.MonitorInfo#getLockedStackDepth() public int
     * java.lang.management.MonitorInfo.getLockedStackDepth()}.
     *
     * <p>
     * Test method for {@link java.lang.management.MonitorInfo#getLockedStackDepth() public int
     * java.lang.management.MonitorInfo.getLockedStackDepth()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.lang.management.MonitorInfo#getLockedStackDepth() public int
     *      java.lang.management.MonitorInfo.getLockedStackDepth() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getLockedStackDepth()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.lang.management.MonitorInfo#getLockedStackFrame() public java.lang.StackTraceElement
     * java.lang.management.MonitorInfo.getLockedStackFrame()}.
     *
     * <p>
     * Test method for {@link java.lang.management.MonitorInfo#getLockedStackFrame() public java.lang.StackTraceElement
     * java.lang.management.MonitorInfo.getLockedStackFrame()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.lang.management.MonitorInfo#getLockedStackFrame() public java.lang.StackTraceElement
     *      java.lang.management.MonitorInfo.getLockedStackFrame() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getLockedStackFrame()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
