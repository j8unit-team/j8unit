package org.j8unit.repository.java.text.spi;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.text.spi.DateFormatProvider class java.text.spi.DateFormatProvider}.
 * The complementary j8unit test interface containing the class relevant aspects is {@link DateFormatProviderClassTests}
 * .
 * </p>
 *
 * @see java.text.spi.DateFormatProvider class java.text.spi.DateFormatProvider (the hereby targeted class-under-test
 *      class)
 * @see DateFormatProviderClassTests DateFormatProviderClassTests (the complementary j8unit test interface containing
 *      the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface DateFormatProviderTests<SUT extends java.text.spi.DateFormatProvider>
extends org.j8unit.repository.java.util.spi.LocaleServiceProviderTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.text.spi.DateFormatProvider#getDateTimeInstance(int, int, java.util.Locale) public
     * abstract java.text.DateFormat java.text.spi.DateFormatProvider.getDateTimeInstance(int,int,java.util.Locale)}.
     *
     * <p>
     * Test method for {@link java.text.spi.DateFormatProvider#getDateTimeInstance(int, int, java.util.Locale) public
     * abstract java.text.DateFormat java.text.spi.DateFormatProvider.getDateTimeInstance(int,int,java.util.Locale)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.text.spi.DateFormatProvider#getDateTimeInstance(int, int, java.util.Locale) public abstract
     *      java.text.DateFormat java.text.spi.DateFormatProvider.getDateTimeInstance(int,int,java.util.Locale) (the
     *      hereby targeted method-under-test)
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
     * Test method for {@link java.text.spi.DateFormatProvider#getDateInstance(int, java.util.Locale) public abstract
     * java.text.DateFormat java.text.spi.DateFormatProvider.getDateInstance(int,java.util.Locale)}.
     *
     * <p>
     * Test method for {@link java.text.spi.DateFormatProvider#getDateInstance(int, java.util.Locale) public abstract
     * java.text.DateFormat java.text.spi.DateFormatProvider.getDateInstance(int,java.util.Locale)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.text.spi.DateFormatProvider#getDateInstance(int, java.util.Locale) public abstract java.text.DateFormat
     *      java.text.spi.DateFormatProvider.getDateInstance(int,java.util.Locale) (the hereby targeted
     *      method-under-test)
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
     * Test method for {@link java.text.spi.DateFormatProvider#getTimeInstance(int, java.util.Locale) public abstract
     * java.text.DateFormat java.text.spi.DateFormatProvider.getTimeInstance(int,java.util.Locale)}.
     *
     * <p>
     * Test method for {@link java.text.spi.DateFormatProvider#getTimeInstance(int, java.util.Locale) public abstract
     * java.text.DateFormat java.text.spi.DateFormatProvider.getTimeInstance(int,java.util.Locale)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.text.spi.DateFormatProvider#getTimeInstance(int, java.util.Locale) public abstract java.text.DateFormat
     *      java.text.spi.DateFormatProvider.getTimeInstance(int,java.util.Locale) (the hereby targeted
     *      method-under-test)
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
