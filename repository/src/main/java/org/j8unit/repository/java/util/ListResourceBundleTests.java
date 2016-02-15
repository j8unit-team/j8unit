package org.j8unit.repository.java.util;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.util.ListResourceBundle class java.util.ListResourceBundle}. The
 * complementary j8unit test interface containing the class relevant aspects is {@link ListResourceBundleClassTests}.
 * </p>
 *
 * @see java.util.ListResourceBundle class java.util.ListResourceBundle (the hereby targeted class-under-test class)
 * @see ListResourceBundleClassTests ListResourceBundleClassTests (the complementary j8unit test interface containing
 *      the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ListResourceBundleTests<SUT extends java.util.ListResourceBundle>
extends ResourceBundleTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.util.ListResourceBundle#getKeys() public java.util.Enumeration
     * <java.lang.String> java.util.ListResourceBundle.getKeys()}.
     *
     * <p>
     * Test method for {@link java.util.ListResourceBundle#getKeys() public java.util.Enumeration
     * java.util.ListResourceBundle.getKeys()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.ListResourceBundle#getKeys() public java.util.Enumeration java.util.ListResourceBundle.getKeys()
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getKeys()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.ListResourceBundle#handleGetObject(String) public final java.lang.Object
     * java.util.ListResourceBundle.handleGetObject(java.lang.String)}.
     *
     * <p>
     * Test method for {@link java.util.ListResourceBundle#handleGetObject(String) public final java.lang.Object
     * java.util.ListResourceBundle.handleGetObject(java.lang.String)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.ListResourceBundle#handleGetObject(String) public final java.lang.Object
     *      java.util.ListResourceBundle.handleGetObject(java.lang.String) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_handleGetObject_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
