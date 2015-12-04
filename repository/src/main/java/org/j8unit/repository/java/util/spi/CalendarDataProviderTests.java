package org.j8unit.repository.java.util.spi;

import org.j8unit.*;
import org.j8unit.repository.categories.*;
import org.junit.*;
import org.junit.experimental.categories.Category;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import static org.junit.Assert.*;

/**
 * <p>
 * Test class for {@link java.util.spi.CalendarDataProvider class java.util.spi.CalendarDataProvider},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.java.util.spi.CalendarDataProviderClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface CalendarDataProviderTests<SUT extends java.util.spi.CalendarDataProvider>
extends org.j8unit.repository.java.util.spi.LocaleServiceProviderTests<SUT>
{

    /**
     * <p>
     * Test method for {@link java.util.spi.CalendarDataProvider#getMinimalDaysInFirstWeek(java.util.Locale) public abstract int java.util.spi.CalendarDataProvider.getMinimalDaysInFirstWeek(java.util.Locale)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getMinimalDaysInFirstWeek_Locale() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.spi.CalendarDataProvider#getFirstDayOfWeek(java.util.Locale) public abstract int java.util.spi.CalendarDataProvider.getFirstDayOfWeek(java.util.Locale)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getFirstDayOfWeek_Locale() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
