package org.j8unit.repository.java.util.spi;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain java.util.spi.CalendarDataProvider class
 * java.util.spi.CalendarDataProvider}, containing all instance relevant test methods (i.&thinsp;e., test methods of
 * non-{@code static} methods). The counterpart J8Unit test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.java.util.spi.CalendarDataProviderTests}.
 * </p>
 *
 * @see org.j8unit.repository.java.util.spi.CalendarDataProviderClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim java.util.spi.CalendarDataProvider
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface CalendarDataProviderTests<SUT extends java.util.spi.CalendarDataProvider>
extends org.j8unit.repository.java.util.spi.LocaleServiceProviderTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.util.spi.CalendarDataProvider#getFirstDayOfWeek(java.util.Locale) public abstract int
     * java.util.spi.CalendarDataProvider.getFirstDayOfWeek(java.util.Locale)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.util.spi.CalendarDataProvider#getFirstDayOfWeek(java.util.Locale)
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

    /**
     * <p>
     * Test method for {@link java.util.spi.CalendarDataProvider#getMinimalDaysInFirstWeek(java.util.Locale) public
     * abstract int java.util.spi.CalendarDataProvider.getMinimalDaysInFirstWeek(java.util.Locale)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.util.spi.CalendarDataProvider#getMinimalDaysInFirstWeek(java.util.Locale)
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

}
