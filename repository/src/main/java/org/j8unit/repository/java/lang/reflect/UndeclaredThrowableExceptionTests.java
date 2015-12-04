package org.j8unit.repository.java.lang.reflect;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link java.lang.reflect.UndeclaredThrowableException class
 * java.lang.reflect.UndeclaredThrowableException}, containing all instance relevant test methods (i.&thinsp;e., test
 * methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.java.lang.reflect.UndeclaredThrowableExceptionClassTests
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface UndeclaredThrowableExceptionTests<SUT extends java.lang.reflect.UndeclaredThrowableException>
extends org.j8unit.repository.java.lang.RuntimeExceptionTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.lang.reflect.UndeclaredThrowableException#getCause() public java.lang.Throwable
     * java.lang.reflect.UndeclaredThrowableException.getCause()}.
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
     * Test method for {@link java.lang.reflect.UndeclaredThrowableException#getUndeclaredThrowable() public
     * java.lang.Throwable java.lang.reflect.UndeclaredThrowableException.getUndeclaredThrowable()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getUndeclaredThrowable()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
