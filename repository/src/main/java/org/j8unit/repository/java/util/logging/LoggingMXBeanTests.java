package org.j8unit.repository.java.util.logging;

import org.j8unit.repository.RepositoryTests;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.util.logging.LoggingMXBean interface java.util.logging.LoggingMXBean}
 * . The complementary j8unit test interface containing the class relevant aspects is {@link LoggingMXBeanClassTests}.
 * </p>
 *
 * @see java.util.logging.LoggingMXBean interface java.util.logging.LoggingMXBean (the hereby targeted class-under-test
 *      class)
 * @see LoggingMXBeanClassTests LoggingMXBeanClassTests (the complementary j8unit test interface containing the class
 *      relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface LoggingMXBeanTests<SUT extends java.util.logging.LoggingMXBean>
extends RepositoryTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.util.logging.LoggingMXBean#getLoggerLevel(String) public abstract java.lang.String
     * java.util.logging.LoggingMXBean.getLoggerLevel(java.lang.String)}.
     *
     * <p>
     * Test method for {@link java.util.logging.LoggingMXBean#getLoggerLevel(String) public abstract java.lang.String
     * java.util.logging.LoggingMXBean.getLoggerLevel(java.lang.String)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.logging.LoggingMXBean#getLoggerLevel(String) public abstract java.lang.String
     *      java.util.logging.LoggingMXBean.getLoggerLevel(java.lang.String) (the hereby targeted method-under-test)
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
     * Test method for {@link java.util.logging.LoggingMXBean#getParentLoggerName(String) public abstract
     * java.lang.String java.util.logging.LoggingMXBean.getParentLoggerName(java.lang.String)}.
     *
     * <p>
     * Test method for {@link java.util.logging.LoggingMXBean#getParentLoggerName(String) public abstract
     * java.lang.String java.util.logging.LoggingMXBean.getParentLoggerName(java.lang.String)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.logging.LoggingMXBean#getParentLoggerName(String) public abstract java.lang.String
     *      java.util.logging.LoggingMXBean.getParentLoggerName(java.lang.String) (the hereby targeted
     *      method-under-test)
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
     * Test method for {@link java.util.logging.LoggingMXBean#setLoggerLevel(String, String) public abstract void
     * java.util.logging.LoggingMXBean.setLoggerLevel(java.lang.String,java.lang.String)}.
     *
     * <p>
     * Test method for {@link java.util.logging.LoggingMXBean#setLoggerLevel(String, String) public abstract void
     * java.util.logging.LoggingMXBean.setLoggerLevel(java.lang.String,java.lang.String)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.logging.LoggingMXBean#setLoggerLevel(String, String) public abstract void
     *      java.util.logging.LoggingMXBean.setLoggerLevel(java.lang.String,java.lang.String) (the hereby targeted
     *      method-under-test)
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

    /**
     * <p>
     * Test method for {@link java.util.logging.LoggingMXBean#getLoggerNames() public abstract java.util.List
     * <java.lang.String> java.util.logging.LoggingMXBean.getLoggerNames()}.
     *
     * <p>
     * Test method for {@link java.util.logging.LoggingMXBean#getLoggerNames() public abstract java.util.List
     * java.util.logging.LoggingMXBean.getLoggerNames()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.logging.LoggingMXBean#getLoggerNames() public abstract java.util.List
     *      java.util.logging.LoggingMXBean.getLoggerNames() (the hereby targeted method-under-test)
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

}
