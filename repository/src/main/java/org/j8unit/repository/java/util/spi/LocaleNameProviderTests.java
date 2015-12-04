package org.j8unit.repository.java.util.spi;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link java.util.spi.LocaleNameProvider class java.util.spi.LocaleNameProvider}, containing all
 * instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.java.util.spi.LocaleNameProviderClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface LocaleNameProviderTests<SUT extends java.util.spi.LocaleNameProvider>
extends org.j8unit.repository.java.util.spi.LocaleServiceProviderTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.util.spi.LocaleNameProvider#getDisplayCountry(java.lang.String,java.util.Locale)
     * public abstract java.lang.String
     * java.util.spi.LocaleNameProvider.getDisplayCountry(java.lang.String,java.util.Locale)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getDisplayCountry_String_Locale()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.spi.LocaleNameProvider#getDisplayScript(java.lang.String,java.util.Locale)
     * public java.lang.String java.util.spi.LocaleNameProvider.getDisplayScript(java.lang.String,java.util.Locale)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getDisplayScript_String_Locale()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.spi.LocaleNameProvider#getDisplayLanguage(java.lang.String,java.util.Locale)
     * public abstract java.lang.String
     * java.util.spi.LocaleNameProvider.getDisplayLanguage(java.lang.String,java.util.Locale)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getDisplayLanguage_String_Locale()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.spi.LocaleNameProvider#getDisplayVariant(java.lang.String,java.util.Locale)
     * public abstract java.lang.String
     * java.util.spi.LocaleNameProvider.getDisplayVariant(java.lang.String,java.util.Locale)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getDisplayVariant_String_Locale()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
