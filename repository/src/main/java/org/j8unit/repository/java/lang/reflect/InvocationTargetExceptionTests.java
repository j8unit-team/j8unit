package org.j8unit.repository.java.lang.reflect;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link java.lang.reflect.InvocationTargetException class java.lang.reflect.InvocationTargetException},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.java.lang.reflect.InvocationTargetExceptionClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface InvocationTargetExceptionTests<SUT extends java.lang.reflect.InvocationTargetException>
extends org.j8unit.repository.java.lang.ReflectiveOperationExceptionTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.lang.reflect.InvocationTargetException#getCause() public java.lang.Throwable
     * java.lang.reflect.InvocationTargetException.getCause()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_getCause()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.lang.reflect.InvocationTargetException#getTargetException() public
     * java.lang.Throwable java.lang.reflect.InvocationTargetException.getTargetException()}.
     * </p>
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
