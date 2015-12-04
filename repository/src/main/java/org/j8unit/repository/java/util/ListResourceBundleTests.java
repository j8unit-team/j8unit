package org.j8unit.repository.java.util;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link java.util.ListResourceBundle class java.util.ListResourceBundle}, containing all instance
 * relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.java.util.ListResourceBundleClassTests
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ListResourceBundleTests<SUT extends java.util.ListResourceBundle>
extends org.j8unit.repository.java.util.ResourceBundleTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.util.ListResourceBundle#getKeys() public java.util.Enumeration
     * java.util.ListResourceBundle.getKeys()}.
     * </p>
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
     * Test method for {@link java.util.ListResourceBundle#handleGetObject(java.lang.String) public final
     * java.lang.Object java.util.ListResourceBundle.handleGetObject(java.lang.String)}.
     * </p>
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
