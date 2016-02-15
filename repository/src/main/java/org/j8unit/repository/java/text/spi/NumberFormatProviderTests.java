package org.j8unit.repository.java.text.spi;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.text.spi.NumberFormatProvider class
 * java.text.spi.NumberFormatProvider}. The complementary j8unit test interface containing the class relevant aspects is
 * {@link NumberFormatProviderClassTests}.
 * </p>
 *
 * @see java.text.spi.NumberFormatProvider class java.text.spi.NumberFormatProvider (the hereby targeted
 *      class-under-test class)
 * @see NumberFormatProviderClassTests NumberFormatProviderClassTests (the complementary j8unit test interface
 *      containing the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface NumberFormatProviderTests<SUT extends java.text.spi.NumberFormatProvider>
extends org.j8unit.repository.java.util.spi.LocaleServiceProviderTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.text.spi.NumberFormatProvider#getPercentInstance(java.util.Locale) public abstract
     * java.text.NumberFormat java.text.spi.NumberFormatProvider.getPercentInstance(java.util.Locale)}.
     *
     * <p>
     * Test method for {@link java.text.spi.NumberFormatProvider#getPercentInstance(java.util.Locale) public abstract
     * java.text.NumberFormat java.text.spi.NumberFormatProvider.getPercentInstance(java.util.Locale)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.text.spi.NumberFormatProvider#getPercentInstance(java.util.Locale) public abstract
     *      java.text.NumberFormat java.text.spi.NumberFormatProvider.getPercentInstance(java.util.Locale) (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getPercentInstance_Locale()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.text.spi.NumberFormatProvider#getCurrencyInstance(java.util.Locale) public abstract
     * java.text.NumberFormat java.text.spi.NumberFormatProvider.getCurrencyInstance(java.util.Locale)}.
     *
     * <p>
     * Test method for {@link java.text.spi.NumberFormatProvider#getCurrencyInstance(java.util.Locale) public abstract
     * java.text.NumberFormat java.text.spi.NumberFormatProvider.getCurrencyInstance(java.util.Locale)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.text.spi.NumberFormatProvider#getCurrencyInstance(java.util.Locale) public abstract
     *      java.text.NumberFormat java.text.spi.NumberFormatProvider.getCurrencyInstance(java.util.Locale) (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getCurrencyInstance_Locale()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.text.spi.NumberFormatProvider#getNumberInstance(java.util.Locale) public abstract
     * java.text.NumberFormat java.text.spi.NumberFormatProvider.getNumberInstance(java.util.Locale)}.
     *
     * <p>
     * Test method for {@link java.text.spi.NumberFormatProvider#getNumberInstance(java.util.Locale) public abstract
     * java.text.NumberFormat java.text.spi.NumberFormatProvider.getNumberInstance(java.util.Locale)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.text.spi.NumberFormatProvider#getNumberInstance(java.util.Locale) public abstract
     *      java.text.NumberFormat java.text.spi.NumberFormatProvider.getNumberInstance(java.util.Locale) (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getNumberInstance_Locale()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.text.spi.NumberFormatProvider#getIntegerInstance(java.util.Locale) public abstract
     * java.text.NumberFormat java.text.spi.NumberFormatProvider.getIntegerInstance(java.util.Locale)}.
     *
     * <p>
     * Test method for {@link java.text.spi.NumberFormatProvider#getIntegerInstance(java.util.Locale) public abstract
     * java.text.NumberFormat java.text.spi.NumberFormatProvider.getIntegerInstance(java.util.Locale)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.text.spi.NumberFormatProvider#getIntegerInstance(java.util.Locale) public abstract
     *      java.text.NumberFormat java.text.spi.NumberFormatProvider.getIntegerInstance(java.util.Locale) (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getIntegerInstance_Locale()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
