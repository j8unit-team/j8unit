package org.j8unit.repository.javax.management;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.management.ReflectionException class
 * javax.management.ReflectionException}. The complementary j8unit test interface containing the class relevant aspects
 * is {@link ReflectionExceptionClassTests}.
 * </p>
 *
 * @see javax.management.ReflectionException class javax.management.ReflectionException (the hereby targeted
 *      class-under-test class)
 * @see ReflectionExceptionClassTests ReflectionExceptionClassTests (the complementary j8unit test interface containing
 *      the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ReflectionExceptionTests<SUT extends javax.management.ReflectionException>
extends JMExceptionTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.management.ReflectionException#getCause() public java.lang.Throwable
     * javax.management.ReflectionException.getCause()}.
     *
     * <p>
     * Test method for {@link javax.management.ReflectionException#getCause() public java.lang.Throwable
     * javax.management.ReflectionException.getCause()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.ReflectionException#getCause() public java.lang.Throwable
     *      javax.management.ReflectionException.getCause() (the hereby targeted method-under-test)
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

    /**
     * <p>
     * Test method for {@link javax.management.ReflectionException#getTargetException() public java.lang.Exception
     * javax.management.ReflectionException.getTargetException()}.
     *
     * <p>
     * Test method for {@link javax.management.ReflectionException#getTargetException() public java.lang.Exception
     * javax.management.ReflectionException.getTargetException()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.ReflectionException#getTargetException() public java.lang.Exception
     *      javax.management.ReflectionException.getTargetException() (the hereby targeted method-under-test)
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

}
