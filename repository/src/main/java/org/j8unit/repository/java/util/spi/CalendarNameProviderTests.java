package org.j8unit.repository.java.util.spi;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain java.util.spi.CalendarNameProvider class
 * java.util.spi.CalendarNameProvider}, containing all instance relevant test methods (i.&thinsp;e., test methods of
 * non-{@code static} methods). The counterpart J8Unit test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.java.util.spi.CalendarNameProviderTests}.
 * </p>
 *
 * @see org.j8unit.repository.java.util.spi.CalendarNameProviderClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim java.util.spi.CalendarNameProvider
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface CalendarNameProviderTests<SUT extends java.util.spi.CalendarNameProvider>
extends org.j8unit.repository.java.util.spi.LocaleServiceProviderTests<SUT> {

    /**
     * <p>
     * Test method for
     * {@link java.util.spi.CalendarNameProvider#getDisplayName(java.lang.String, int, int, int, java.util.Locale)
     * public abstract java.lang.String
     * java.util.spi.CalendarNameProvider.getDisplayName(java.lang.String,int,int,int,java.util.Locale)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.util.spi.CalendarNameProvider#getDisplayName(java.lang.String, int, int, int, java.util.Locale)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getDisplayName_String_int_int_int_Locale()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.util.spi.CalendarNameProvider#getDisplayNames(java.lang.String, int, int, java.util.Locale) public
     * abstract java.util.Map
     * java.util.spi.CalendarNameProvider.getDisplayNames(java.lang.String,int,int,java.util.Locale)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.util.spi.CalendarNameProvider#getDisplayNames(java.lang.String, int, int, java.util.Locale)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getDisplayNames_String_int_int_Locale()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
