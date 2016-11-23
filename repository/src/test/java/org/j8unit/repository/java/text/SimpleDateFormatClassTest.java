package org.j8unit.repository.java.text;

import java.text.SimpleDateFormat;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link SimpleDateFormat} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.text.SimpleDateFormatClassTests}).
 */

@RunWith(J8Unit4.class)
public class SimpleDateFormatClassTest
implements SimpleDateFormatClassTests<SimpleDateFormat> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.text.SimpleDateFormat]

    @Override
    public Class<SimpleDateFormat> createNewSUT() {
        return SimpleDateFormat.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.text.SimpleDateFormat#SimpleDateFormat(String, java.util.Locale) public
     * java.text.SimpleDateFormat(java.lang.String,java.util.Locale)}.
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
    public void create_SimpleDateFormat_String_Locale()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final SimpleDateFormat sut = null; // = new SimpleDateFormat(String, java.util.Locale);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.text.SimpleDateFormat#SimpleDateFormat(String) public java.text.SimpleDateFormat(java.lang.String)}.
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
    public void create_SimpleDateFormat_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final SimpleDateFormat sut = null; // = new SimpleDateFormat(String);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link java.text.SimpleDateFormat#SimpleDateFormat()
     * public java.text.SimpleDateFormat()}.
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
    public void create_SimpleDateFormat()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final SimpleDateFormat sut = new SimpleDateFormat();
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.text.SimpleDateFormat#SimpleDateFormat(String, java.text.DateFormatSymbols) public
     * java.text.SimpleDateFormat(java.lang.String,java.text.DateFormatSymbols)}.
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
    public void create_SimpleDateFormat_String_DateFormatSymbols()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final SimpleDateFormat sut = null; // = new SimpleDateFormat(String, java.text.DateFormatSymbols);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.text.SimpleDateFormat]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.text.SimpleDateFormat]

}
