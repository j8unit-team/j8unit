package org.j8unit.repository.java.text;

import java.text.DateFormatSymbols;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link DateFormatSymbols} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.text.DateFormatSymbolsClassTests}).
 */

@RunWith(J8Unit4.class)
public class DateFormatSymbolsClassTest
implements DateFormatSymbolsClassTests<DateFormatSymbols> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.text.DateFormatSymbols]

    @Override
    public Class<DateFormatSymbols> createNewSUT() {
        return DateFormatSymbols.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.text.DateFormatSymbols#DateFormatSymbols(java.util.Locale) public
     * java.text.DateFormatSymbols(java.util.Locale)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void create_DateFormatSymbols_Locale()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final DateFormatSymbols sut = null; // = new DateFormatSymbols(java.util.Locale);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link java.text.DateFormatSymbols#DateFormatSymbols()
     * public java.text.DateFormatSymbols()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void create_DateFormatSymbols()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final DateFormatSymbols sut = new DateFormatSymbols();
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link java.text.DateFormatSymbols#getInstance() public
     * static final java.text.DateFormatSymbols java.text.DateFormatSymbols.getInstance()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void test_getInstance()
    throws Exception {
        // write some test for {@link java.text.DateFormatSymbols#getInstance()}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link java.text.DateFormatSymbols#getInstance(java.util.Locale) public static final java.text.DateFormatSymbols
     * java.text.DateFormatSymbols.getInstance(java.util.Locale)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void test_getInstance_Locale()
    throws Exception {
        // write some test for {@link java.text.DateFormatSymbols#getInstance(java.util.Locale)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link java.text.DateFormatSymbols#getAvailableLocales()
     * public static java.util.Locale[] java.text.DateFormatSymbols.getAvailableLocales()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void test_getAvailableLocales()
    throws Exception {
        // write some test for {@link java.text.DateFormatSymbols#getAvailableLocales()}
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.text.DateFormatSymbols]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.text.DateFormatSymbols]

}
