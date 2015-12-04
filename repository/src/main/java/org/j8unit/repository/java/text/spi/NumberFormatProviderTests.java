package org.j8unit.repository.java.text.spi;

import org.j8unit.*;
import org.j8unit.repository.categories.*;
import org.junit.*;
import org.junit.experimental.categories.Category;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import static org.junit.Assert.*;

/**
 * <p>
 * Test class for {@link java.text.spi.NumberFormatProvider class java.text.spi.NumberFormatProvider},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.java.text.spi.NumberFormatProviderClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface NumberFormatProviderTests<SUT extends java.text.spi.NumberFormatProvider>
extends org.j8unit.repository.java.util.spi.LocaleServiceProviderTests<SUT>
{

    /**
     * <p>
     * Test method for {@link java.text.spi.NumberFormatProvider#getPercentInstance(java.util.Locale) public abstract java.text.NumberFormat java.text.spi.NumberFormatProvider.getPercentInstance(java.util.Locale)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getPercentInstance_Locale() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.text.spi.NumberFormatProvider#getCurrencyInstance(java.util.Locale) public abstract java.text.NumberFormat java.text.spi.NumberFormatProvider.getCurrencyInstance(java.util.Locale)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getCurrencyInstance_Locale() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.text.spi.NumberFormatProvider#getNumberInstance(java.util.Locale) public abstract java.text.NumberFormat java.text.spi.NumberFormatProvider.getNumberInstance(java.util.Locale)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getNumberInstance_Locale() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.text.spi.NumberFormatProvider#getIntegerInstance(java.util.Locale) public abstract java.text.NumberFormat java.text.spi.NumberFormatProvider.getIntegerInstance(java.util.Locale)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getIntegerInstance_Locale() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
