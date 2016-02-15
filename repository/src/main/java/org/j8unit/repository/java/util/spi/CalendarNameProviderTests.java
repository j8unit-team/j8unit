package org.j8unit.repository.java.util.spi;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.util.spi.CalendarNameProvider class
 * java.util.spi.CalendarNameProvider}. The complementary j8unit test interface containing the class relevant aspects is
 * {@link CalendarNameProviderClassTests}.
 * </p>
 *
 * @see java.util.spi.CalendarNameProvider class java.util.spi.CalendarNameProvider (the hereby targeted
 *      class-under-test class)
 * @see CalendarNameProviderClassTests CalendarNameProviderClassTests (the complementary j8unit test interface
 *      containing the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface CalendarNameProviderTests<SUT extends java.util.spi.CalendarNameProvider>
extends LocaleServiceProviderTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.util.spi.CalendarNameProvider#getDisplayName(String, int, int, int, java.util.Locale)
     * public abstract java.lang.String
     * java.util.spi.CalendarNameProvider.getDisplayName(java.lang.String,int,int,int,java.util.Locale)}.
     *
     * <p>
     * Test method for {@link java.util.spi.CalendarNameProvider#getDisplayName(String, int, int, int, java.util.Locale)
     * public abstract java.lang.String
     * java.util.spi.CalendarNameProvider.getDisplayName(java.lang.String,int,int,int,java.util.Locale)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.spi.CalendarNameProvider#getDisplayName(String, int, int, int, java.util.Locale) public abstract
     *      java.lang.String
     *      java.util.spi.CalendarNameProvider.getDisplayName(java.lang.String,int,int,int,java.util.Locale) (the hereby
     *      targeted method-under-test)
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
     * Test method for {@link java.util.spi.CalendarNameProvider#getDisplayNames(String, int, int, java.util.Locale)
     * public abstract java.util.Map<java.lang.String, java.lang.Integer>
     * java.util.spi.CalendarNameProvider.getDisplayNames(java.lang.String,int,int,java.util.Locale)}.
     *
     * <p>
     * Test method for {@link java.util.spi.CalendarNameProvider#getDisplayNames(String, int, int, java.util.Locale)
     * public abstract java.util.Map
     * java.util.spi.CalendarNameProvider.getDisplayNames(java.lang.String,int,int,java.util.Locale)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.spi.CalendarNameProvider#getDisplayNames(String, int, int, java.util.Locale) public abstract
     *      java.util.Map java.util.spi.CalendarNameProvider.getDisplayNames(java.lang.String,int,int,java.util.Locale)
     *      (the hereby targeted method-under-test)
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
