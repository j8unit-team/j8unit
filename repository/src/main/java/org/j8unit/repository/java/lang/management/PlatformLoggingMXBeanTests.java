package org.j8unit.repository.java.lang.management;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link java.lang.management.PlatformLoggingMXBean interface
 * java.lang.management.PlatformLoggingMXBean}, containing all instance relevant test methods (i.&thinsp;e., test
 * methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.java.lang.management.PlatformLoggingMXBeanClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface PlatformLoggingMXBeanTests<SUT extends java.lang.management.PlatformLoggingMXBean>
extends org.j8unit.repository.java.lang.management.PlatformManagedObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.lang.management.PlatformLoggingMXBean#getLoggerLevel(java.lang.String) public
     * abstract java.lang.String java.lang.management.PlatformLoggingMXBean.getLoggerLevel(java.lang.String)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getLoggerLevel_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.lang.management.PlatformLoggingMXBean#getLoggerNames() public abstract java.util.List
     * java.lang.management.PlatformLoggingMXBean.getLoggerNames()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getLoggerNames()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.lang.management.PlatformLoggingMXBean#getParentLoggerName(java.lang.String) public
     * abstract java.lang.String java.lang.management.PlatformLoggingMXBean.getParentLoggerName(java.lang.String)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getParentLoggerName_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.lang.management.PlatformLoggingMXBean#setLoggerLevel(java.lang.String,java.lang.String) public
     * abstract void java.lang.management.PlatformLoggingMXBean.setLoggerLevel(java.lang.String,java.lang.String)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setLoggerLevel_String_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
