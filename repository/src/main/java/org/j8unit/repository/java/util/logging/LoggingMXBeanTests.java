package org.j8unit.repository.java.util.logging;

import org.j8unit.repository.RepositoryTests;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain java.util.logging.LoggingMXBean interface
 * java.util.logging.LoggingMXBean}, containing all instance relevant test methods (i.&thinsp;e., test methods of non-
 * {@code static} methods). The counterpart J8Unit test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.java.util.logging.LoggingMXBeanTests}.
 * </p>
 *
 * @see org.j8unit.repository.java.util.logging.LoggingMXBeanClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim java.util.logging.LoggingMXBean
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface LoggingMXBeanTests<SUT extends java.util.logging.LoggingMXBean>
extends RepositoryTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.util.logging.LoggingMXBean#getLoggerLevel(java.lang.String) public abstract
     * java.lang.String java.util.logging.LoggingMXBean.getLoggerLevel(java.lang.String)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.util.logging.LoggingMXBean#getLoggerLevel(java.lang.String)
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
     * Test method for {@link java.util.logging.LoggingMXBean#getLoggerNames() public abstract java.util.List
     * java.util.logging.LoggingMXBean.getLoggerNames()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.util.logging.LoggingMXBean#getLoggerNames()
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
     * Test method for {@link java.util.logging.LoggingMXBean#getParentLoggerName(java.lang.String) public abstract
     * java.lang.String java.util.logging.LoggingMXBean.getParentLoggerName(java.lang.String)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.util.logging.LoggingMXBean#getParentLoggerName(java.lang.String)
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
     * Test method for {@link java.util.logging.LoggingMXBean#setLoggerLevel(java.lang.String, java.lang.String) public
     * abstract void java.util.logging.LoggingMXBean.setLoggerLevel(java.lang.String,java.lang.String)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.util.logging.LoggingMXBean#setLoggerLevel(java.lang.String, java.lang.String)
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
