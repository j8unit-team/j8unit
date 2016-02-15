package org.j8unit.repository.java.lang;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain ClassNotFoundException class java.lang.ClassNotFoundException}. The
 * complementary j8unit test interface containing the class relevant aspects is {@link ClassNotFoundExceptionClassTests}
 * .
 * </p>
 *
 * @see ClassNotFoundException class java.lang.ClassNotFoundException (the hereby targeted class-under-test class)
 * @see ClassNotFoundExceptionClassTests ClassNotFoundExceptionClassTests (the complementary j8unit test interface
 *      containing the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ClassNotFoundExceptionTests<SUT extends ClassNotFoundException>
extends ReflectiveOperationExceptionTests<SUT> {

    /**
     * <p>
     * Test method for {@link ClassNotFoundException#getCause() public java.lang.Throwable
     * java.lang.ClassNotFoundException.getCause()}.
     *
     * <p>
     * Test method for {@link ClassNotFoundException#getCause() public java.lang.Throwable
     * java.lang.ClassNotFoundException.getCause()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see ClassNotFoundException#getCause() public java.lang.Throwable java.lang.ClassNotFoundException.getCause()
     *      (the hereby targeted method-under-test)
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
     * Test method for {@link ClassNotFoundException#getException() public java.lang.Throwable
     * java.lang.ClassNotFoundException.getException()}.
     *
     * <p>
     * Test method for {@link ClassNotFoundException#getException() public java.lang.Throwable
     * java.lang.ClassNotFoundException.getException()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see ClassNotFoundException#getException() public java.lang.Throwable
     *      java.lang.ClassNotFoundException.getException() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getException()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
