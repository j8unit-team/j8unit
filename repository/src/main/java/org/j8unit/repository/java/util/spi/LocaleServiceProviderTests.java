package org.j8unit.repository.java.util.spi;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain java.util.spi.LocaleServiceProvider class
 * java.util.spi.LocaleServiceProvider}, containing all instance relevant test methods (i.&thinsp;e., test methods of
 * non-{@code static} methods). The counterpart J8Unit test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.java.util.spi.LocaleServiceProviderTests}.
 * </p>
 *
 * @see org.j8unit.repository.java.util.spi.LocaleServiceProviderClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim java.util.spi.LocaleServiceProvider
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface LocaleServiceProviderTests<SUT extends java.util.spi.LocaleServiceProvider>
extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.util.spi.LocaleServiceProvider#getAvailableLocales() public abstract
     * java.util.Locale[] java.util.spi.LocaleServiceProvider.getAvailableLocales()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.util.spi.LocaleServiceProvider#getAvailableLocales()
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getAvailableLocales()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.spi.LocaleServiceProvider#isSupportedLocale(java.util.Locale) public boolean
     * java.util.spi.LocaleServiceProvider.isSupportedLocale(java.util.Locale)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.util.spi.LocaleServiceProvider#isSupportedLocale(java.util.Locale)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_isSupportedLocale_Locale()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
