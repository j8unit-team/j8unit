package org.j8unit.repository.java.lang.management;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link java.lang.management.MonitorInfo class java.lang.management.MonitorInfo}, containing all
 * instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.java.lang.management.MonitorInfoClassTests
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface MonitorInfoTests<SUT extends java.lang.management.MonitorInfo>
extends org.j8unit.repository.java.lang.management.LockInfoTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.lang.management.MonitorInfo#getLockedStackDepth() public int
     * java.lang.management.MonitorInfo.getLockedStackDepth()}.
     * </p>
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
     * </p>
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
