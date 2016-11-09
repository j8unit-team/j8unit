package org.j8unit.repository.java.util;

import java.util.Calendar;
import java.util.Calendar.Builder;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link Calendar} (by simply reusing the J8Unit
 * test interface {@link CalendarClassTests}).
 */

@RunWith(J8Unit4.class)
public class CalendarClassTest
implements CalendarClassTests<Calendar> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.util.Calendar]

    @Override
    public Class<Calendar> createNewSUT() {
        return Calendar.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link java.util.Calendar#getAvailableCalendarTypes()
     * public static java.util.Set<java.lang.String> java.util.Calendar.getAvailableCalendarTypes()}.
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
    public void test_getAvailableCalendarTypes()
    throws Exception {
        // write some test for {@link java.util.Calendar#getAvailableCalendarTypes()}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link java.util.Calendar#getInstance(java.util.TimeZone)
     * public static java.util.Calendar java.util.Calendar.getInstance(java.util.TimeZone)}.
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
    public void test_getInstance_TimeZone()
    throws Exception {
        // write some test for {@link java.util.Calendar#getInstance(java.util.TimeZone)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link java.util.Calendar#getInstance(java.util.Locale)
     * public static java.util.Calendar java.util.Calendar.getInstance(java.util.Locale)}.
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
        // write some test for {@link java.util.Calendar#getInstance(java.util.Locale)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link java.util.Calendar#getInstance() public static
     * java.util.Calendar java.util.Calendar.getInstance()}.
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
        // write some test for {@link java.util.Calendar#getInstance()}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link java.util.Calendar#getInstance(java.util.TimeZone, java.util.Locale) public static java.util.Calendar
     * java.util.Calendar.getInstance(java.util.TimeZone,java.util.Locale)}.
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
    public void test_getInstance_TimeZone_Locale()
    throws Exception {
        // write some test for {@link java.util.Calendar#getInstance(java.util.TimeZone, java.util.Locale)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link java.util.Calendar#getAvailableLocales() public
     * static synchronized java.util.Locale[] java.util.Calendar.getAvailableLocales()}.
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
        // write some test for {@link java.util.Calendar#getAvailableLocales()}
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.util.Calendar]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.util.Calendar]

    /**
     * Specific JUnit test class to proof the type relevant aspects of type {@link Builder} (by simply reusing the
     * J8Unit test interface {@link org.j8unit.repository.java.util.CalendarClassTests.BuilderClassTests}).
     */

    @RunWith(J8Unit4.class)
    public static class BuilderClassTest
    implements org.j8unit.repository.java.util.CalendarClassTests.BuilderClassTests<Builder> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.util.Calendar$Builder]

        @Override
        public Class<Builder> createNewSUT() {
            return Builder.class;
        }

        /**
         * <p>
         * Test method for the hereby targeted constructor-under-test {@link java.util.Calendar.Builder#Builder() public
         * java.util.Calendar$Builder()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @since 0.9.0
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public void create_Builder()
        throws Exception {
            // create new instance
            final Builder sut = new Builder();
        }

        // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.util.Calendar$Builder]

        // J8UNIT-MARKER-[END]-[CLASS]-[java.util.Calendar$Builder]

    }

}
