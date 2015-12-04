package org.j8unit.repository.java.text.spi;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link java.text.spi.DateFormatProvider class java.text.spi.DateFormatProvider}, containing all
 * instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.java.text.spi.DateFormatProviderClassTests
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface DateFormatProviderTests<SUT extends java.text.spi.DateFormatProvider>
extends org.j8unit.repository.java.util.spi.LocaleServiceProviderTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.text.spi.DateFormatProvider#getDateInstance(int,java.util.Locale) public abstract
     * java.text.DateFormat java.text.spi.DateFormatProvider.getDateInstance(int,java.util.Locale)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getDateInstance_int_Locale()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.text.spi.DateFormatProvider#getDateTimeInstance(int,int,java.util.Locale) public
     * abstract java.text.DateFormat java.text.spi.DateFormatProvider.getDateTimeInstance(int,int,java.util.Locale)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getDateTimeInstance_int_int_Locale()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.text.spi.DateFormatProvider#getTimeInstance(int,java.util.Locale) public abstract
     * java.text.DateFormat java.text.spi.DateFormatProvider.getTimeInstance(int,java.util.Locale)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getTimeInstance_int_Locale()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
