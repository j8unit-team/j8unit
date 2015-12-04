package org.j8unit.repository.java.util;

import org.j8unit.*;
import org.j8unit.repository.categories.*;
import org.junit.*;
import org.junit.experimental.categories.Category;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import static org.junit.Assert.*;

/**
 * <p>
 * Test class for {@link java.util.PropertyResourceBundle class java.util.PropertyResourceBundle},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.java.util.PropertyResourceBundleClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface PropertyResourceBundleTests<SUT extends java.util.PropertyResourceBundle>
extends org.j8unit.repository.java.util.ResourceBundleTests<SUT>
{

    /**
     * <p>
     * Test method for {@link java.util.PropertyResourceBundle#getKeys() public java.util.Enumeration java.util.PropertyResourceBundle.getKeys()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_getKeys() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.PropertyResourceBundle#handleGetObject(java.lang.String) public java.lang.Object java.util.PropertyResourceBundle.handleGetObject(java.lang.String)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_handleGetObject_String() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
