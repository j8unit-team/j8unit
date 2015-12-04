package org.j8unit.repository.java.util.spi;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link java.util.spi.TimeZoneNameProvider class java.util.spi.TimeZoneNameProvider}, containing all
 * instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.java.util.spi.TimeZoneNameProviderClassTests
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface TimeZoneNameProviderTests<SUT extends java.util.spi.TimeZoneNameProvider>
extends org.j8unit.repository.java.util.spi.LocaleServiceProviderTests<SUT> {

    /**
     * <p>
     * Test method for
     * {@link java.util.spi.TimeZoneNameProvider#getDisplayName(java.lang.String,boolean,int,java.util.Locale) public
     * abstract java.lang.String
     * java.util.spi.TimeZoneNameProvider.getDisplayName(java.lang.String,boolean,int,java.util.Locale)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getDisplayName_String_boolean_int_Locale()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.util.spi.TimeZoneNameProvider#getGenericDisplayName(java.lang.String,int,java.util.Locale) public
     * java.lang.String java.util.spi.TimeZoneNameProvider.getGenericDisplayName(java.lang.String,int,java.util.Locale)}
     * .
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getGenericDisplayName_String_int_Locale()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
