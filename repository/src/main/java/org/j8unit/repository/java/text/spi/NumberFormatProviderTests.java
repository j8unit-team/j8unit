package org.j8unit.repository.java.text.spi;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain java.text.spi.NumberFormatProvider class
 * java.text.spi.NumberFormatProvider}, containing all instance relevant test methods (i.&thinsp;e., test methods of
 * non-{@code static} methods). The counterpart J8Unit test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.java.text.spi.NumberFormatProviderTests}.
 * </p>
 *
 * @see org.j8unit.repository.java.text.spi.NumberFormatProviderClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim java.text.spi.NumberFormatProvider
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface NumberFormatProviderTests<SUT extends java.text.spi.NumberFormatProvider>
extends org.j8unit.repository.java.util.spi.LocaleServiceProviderTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.text.spi.NumberFormatProvider#getCurrencyInstance(java.util.Locale) public abstract
     * java.text.NumberFormat java.text.spi.NumberFormatProvider.getCurrencyInstance(java.util.Locale)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.text.spi.NumberFormatProvider#getCurrencyInstance(java.util.Locale)
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
     * Test method for {@link java.text.spi.NumberFormatProvider#getIntegerInstance(java.util.Locale) public abstract
     * java.text.NumberFormat java.text.spi.NumberFormatProvider.getIntegerInstance(java.util.Locale)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.text.spi.NumberFormatProvider#getIntegerInstance(java.util.Locale)
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

    /**
     * <p>
     * Test method for {@link java.text.spi.NumberFormatProvider#getNumberInstance(java.util.Locale) public abstract
     * java.text.NumberFormat java.text.spi.NumberFormatProvider.getNumberInstance(java.util.Locale)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.text.spi.NumberFormatProvider#getNumberInstance(java.util.Locale)
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
     * Test method for {@link java.text.spi.NumberFormatProvider#getPercentInstance(java.util.Locale) public abstract
     * java.text.NumberFormat java.text.spi.NumberFormatProvider.getPercentInstance(java.util.Locale)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.text.spi.NumberFormatProvider#getPercentInstance(java.util.Locale)
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

}
