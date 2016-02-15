package org.j8unit.repository.java.util;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.util.MissingResourceException class
 * java.util.MissingResourceException}. The complementary j8unit test interface containing the class relevant aspects is
 * {@link MissingResourceExceptionClassTests}.
 * </p>
 *
 * @see java.util.MissingResourceException class java.util.MissingResourceException (the hereby targeted
 *      class-under-test class)
 * @see MissingResourceExceptionClassTests MissingResourceExceptionClassTests (the complementary j8unit test interface
 *      containing the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface MissingResourceExceptionTests<SUT extends java.util.MissingResourceException>
extends org.j8unit.repository.java.lang.RuntimeExceptionTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.util.MissingResourceException#getClassName() public java.lang.String
     * java.util.MissingResourceException.getClassName()}.
     *
     * <p>
     * Test method for {@link java.util.MissingResourceException#getClassName() public java.lang.String
     * java.util.MissingResourceException.getClassName()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.MissingResourceException#getClassName() public java.lang.String
     *      java.util.MissingResourceException.getClassName() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getClassName()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.MissingResourceException#getKey() public java.lang.String
     * java.util.MissingResourceException.getKey()}.
     *
     * <p>
     * Test method for {@link java.util.MissingResourceException#getKey() public java.lang.String
     * java.util.MissingResourceException.getKey()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.MissingResourceException#getKey() public java.lang.String
     *      java.util.MissingResourceException.getKey() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getKey()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
