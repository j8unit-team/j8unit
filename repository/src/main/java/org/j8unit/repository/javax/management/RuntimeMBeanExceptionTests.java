package org.j8unit.repository.javax.management;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.management.RuntimeMBeanException class
 * javax.management.RuntimeMBeanException}. The complementary j8unit test interface containing the class relevant
 * aspects is {@link RuntimeMBeanExceptionClassTests}.
 * </p>
 *
 * @see javax.management.RuntimeMBeanException class javax.management.RuntimeMBeanException (the hereby targeted
 *      class-under-test class)
 * @see RuntimeMBeanExceptionClassTests RuntimeMBeanExceptionClassTests (the complementary j8unit test interface
 *      containing the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface RuntimeMBeanExceptionTests<SUT extends javax.management.RuntimeMBeanException>
extends JMRuntimeExceptionTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.management.RuntimeMBeanException#getTargetException() public
     * java.lang.RuntimeException javax.management.RuntimeMBeanException.getTargetException()}.
     *
     * <p>
     * Test method for {@link javax.management.RuntimeMBeanException#getTargetException() public
     * java.lang.RuntimeException javax.management.RuntimeMBeanException.getTargetException()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.RuntimeMBeanException#getTargetException() public java.lang.RuntimeException
     *      javax.management.RuntimeMBeanException.getTargetException() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getTargetException()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.RuntimeMBeanException#getCause() public java.lang.Throwable
     * javax.management.RuntimeMBeanException.getCause()}.
     *
     * <p>
     * Test method for {@link javax.management.RuntimeMBeanException#getCause() public java.lang.Throwable
     * javax.management.RuntimeMBeanException.getCause()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.RuntimeMBeanException#getCause() public java.lang.Throwable
     *      javax.management.RuntimeMBeanException.getCause() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getCause()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
