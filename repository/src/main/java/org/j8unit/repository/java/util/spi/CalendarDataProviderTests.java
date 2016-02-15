package org.j8unit.repository.java.util.spi;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.util.spi.CalendarDataProvider class
 * java.util.spi.CalendarDataProvider}. The complementary j8unit test interface containing the class relevant aspects is
 * {@link CalendarDataProviderClassTests}.
 * </p>
 *
 * @see java.util.spi.CalendarDataProvider class java.util.spi.CalendarDataProvider (the hereby targeted
 *      class-under-test class)
 * @see CalendarDataProviderClassTests CalendarDataProviderClassTests (the complementary j8unit test interface
 *      containing the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface CalendarDataProviderTests<SUT extends java.util.spi.CalendarDataProvider>
extends LocaleServiceProviderTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.util.spi.CalendarDataProvider#getMinimalDaysInFirstWeek(java.util.Locale) public
     * abstract int java.util.spi.CalendarDataProvider.getMinimalDaysInFirstWeek(java.util.Locale)}.
     *
     * <p>
     * Test method for {@link java.util.spi.CalendarDataProvider#getMinimalDaysInFirstWeek(java.util.Locale) public
     * abstract int java.util.spi.CalendarDataProvider.getMinimalDaysInFirstWeek(java.util.Locale)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.spi.CalendarDataProvider#getMinimalDaysInFirstWeek(java.util.Locale) public abstract int
     *      java.util.spi.CalendarDataProvider.getMinimalDaysInFirstWeek(java.util.Locale) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getMinimalDaysInFirstWeek_Locale()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.spi.CalendarDataProvider#getFirstDayOfWeek(java.util.Locale) public abstract int
     * java.util.spi.CalendarDataProvider.getFirstDayOfWeek(java.util.Locale)}.
     *
     * <p>
     * Test method for {@link java.util.spi.CalendarDataProvider#getFirstDayOfWeek(java.util.Locale) public abstract int
     * java.util.spi.CalendarDataProvider.getFirstDayOfWeek(java.util.Locale)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.spi.CalendarDataProvider#getFirstDayOfWeek(java.util.Locale) public abstract int
     *      java.util.spi.CalendarDataProvider.getFirstDayOfWeek(java.util.Locale) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getFirstDayOfWeek_Locale()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
