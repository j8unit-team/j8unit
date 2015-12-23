package org.j8unit.repository.java.util;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain java.util.PropertyResourceBundle class
 * java.util.PropertyResourceBundle}, containing all instance relevant test methods (i.&thinsp;e., test methods of non-
 * {@code static} methods). The counterpart J8Unit test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.java.util.PropertyResourceBundleTests}.
 * </p>
 *
 * @see org.j8unit.repository.java.util.PropertyResourceBundleClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim java.util.PropertyResourceBundle
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface PropertyResourceBundleTests<SUT extends java.util.PropertyResourceBundle>
extends org.j8unit.repository.java.util.ResourceBundleTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.util.PropertyResourceBundle#getKeys() public java.util.Enumeration
     * java.util.PropertyResourceBundle.getKeys()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.util.PropertyResourceBundle#getKeys()
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_getKeys()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.PropertyResourceBundle#handleGetObject(java.lang.String) public java.lang.Object
     * java.util.PropertyResourceBundle.handleGetObject(java.lang.String)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.util.PropertyResourceBundle#handleGetObject(java.lang.String)
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
