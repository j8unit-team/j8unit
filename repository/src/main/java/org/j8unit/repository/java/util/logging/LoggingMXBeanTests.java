package org.j8unit.repository.java.util.logging;

import org.j8unit.*;
import org.j8unit.repository.categories.*;
import org.junit.*;
import org.junit.experimental.categories.Category;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import static org.junit.Assert.*;

/**
 * <p>
 * Test class for {@link java.util.logging.LoggingMXBean interface java.util.logging.LoggingMXBean},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.java.util.logging.LoggingMXBeanClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface LoggingMXBeanTests<SUT extends java.util.logging.LoggingMXBean>
extends J8UnitTest<SUT>
{

    /**
     * <p>
     * Test method for {@link java.util.logging.LoggingMXBean#getLoggerLevel(java.lang.String) public abstract java.lang.String java.util.logging.LoggingMXBean.getLoggerLevel(java.lang.String)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getLoggerLevel_String() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.logging.LoggingMXBean#getParentLoggerName(java.lang.String) public abstract java.lang.String java.util.logging.LoggingMXBean.getParentLoggerName(java.lang.String)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getParentLoggerName_String() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.logging.LoggingMXBean#setLoggerLevel(java.lang.String,java.lang.String) public abstract void java.util.logging.LoggingMXBean.setLoggerLevel(java.lang.String,java.lang.String)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setLoggerLevel_String_String() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.logging.LoggingMXBean#getLoggerNames() public abstract java.util.List java.util.logging.LoggingMXBean.getLoggerNames()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getLoggerNames() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
