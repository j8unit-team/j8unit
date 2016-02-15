package org.j8unit.repository.java.util.spi;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.util.spi.CurrencyNameProvider class
 * java.util.spi.CurrencyNameProvider}. The complementary j8unit test interface containing the class relevant aspects is
 * {@link CurrencyNameProviderClassTests}.
 * </p>
 *
 * @see java.util.spi.CurrencyNameProvider class java.util.spi.CurrencyNameProvider (the hereby targeted
 *      class-under-test class)
 * @see CurrencyNameProviderClassTests CurrencyNameProviderClassTests (the complementary j8unit test interface
 *      containing the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface CurrencyNameProviderTests<SUT extends java.util.spi.CurrencyNameProvider>
extends LocaleServiceProviderTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.util.spi.CurrencyNameProvider#getDisplayName(String, java.util.Locale) public
     * java.lang.String java.util.spi.CurrencyNameProvider.getDisplayName(java.lang.String,java.util.Locale)}.
     *
     * <p>
     * Test method for {@link java.util.spi.CurrencyNameProvider#getDisplayName(String, java.util.Locale) public
     * java.lang.String java.util.spi.CurrencyNameProvider.getDisplayName(java.lang.String,java.util.Locale)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.spi.CurrencyNameProvider#getDisplayName(String, java.util.Locale) public java.lang.String
     *      java.util.spi.CurrencyNameProvider.getDisplayName(java.lang.String,java.util.Locale) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getDisplayName_String_Locale()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.spi.CurrencyNameProvider#getSymbol(String, java.util.Locale) public abstract
     * java.lang.String java.util.spi.CurrencyNameProvider.getSymbol(java.lang.String,java.util.Locale)}.
     *
     * <p>
     * Test method for {@link java.util.spi.CurrencyNameProvider#getSymbol(String, java.util.Locale) public abstract
     * java.lang.String java.util.spi.CurrencyNameProvider.getSymbol(java.lang.String,java.util.Locale)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.spi.CurrencyNameProvider#getSymbol(String, java.util.Locale) public abstract java.lang.String
     *      java.util.spi.CurrencyNameProvider.getSymbol(java.lang.String,java.util.Locale) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getSymbol_String_Locale()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
