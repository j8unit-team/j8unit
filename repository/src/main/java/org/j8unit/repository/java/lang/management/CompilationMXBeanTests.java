package org.j8unit.repository.java.lang.management;

import org.j8unit.*;
import org.j8unit.repository.categories.*;
import org.junit.*;
import org.junit.experimental.categories.Category;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import static org.junit.Assert.*;

/**
 * <p>
 * Test class for {@link java.lang.management.CompilationMXBean interface java.lang.management.CompilationMXBean},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.java.lang.management.CompilationMXBeanClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface CompilationMXBeanTests<SUT extends java.lang.management.CompilationMXBean>
extends org.j8unit.repository.java.lang.management.PlatformManagedObjectTests<SUT>
{

    /**
     * <p>
     * Test method for {@link java.lang.management.CompilationMXBean#getName() public abstract java.lang.String java.lang.management.CompilationMXBean.getName()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getName() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.lang.management.CompilationMXBean#getTotalCompilationTime() public abstract long java.lang.management.CompilationMXBean.getTotalCompilationTime()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getTotalCompilationTime() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.lang.management.CompilationMXBean#isCompilationTimeMonitoringSupported() public abstract boolean java.lang.management.CompilationMXBean.isCompilationTimeMonitoringSupported()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_isCompilationTimeMonitoringSupported() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
