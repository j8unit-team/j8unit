package org.j8unit.repository.java.time.format;

import java.time.format.DateTimeParseException;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link DateTimeParseException} (by simply
 * reusing the J8Unit test interface {@link org.j8unit.repository.java.time.format.DateTimeParseExceptionClassTests}).
 */
@RunWith(J8Unit4.class)
public class DateTimeParseExceptionClassTest
implements DateTimeParseExceptionClassTests<DateTimeParseException> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.time.format.DateTimeParseException]

    @Override
    public Class<DateTimeParseException> createNewSUT() {
        return DateTimeParseException.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.time.format.DateTimeParseException#DateTimeParseException(String, CharSequence, int, Throwable)
     * public java.time.format.DateTimeParseException(java.lang.String,java.lang.CharSequence,int,java.lang.Throwable)}.
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
    public void create_DateTimeParseException_String_CharSequence_int_Throwable()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final DateTimeParseException sut = null; // = new DateTimeParseException(String, CharSequence, int, Throwable);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.time.format.DateTimeParseException#DateTimeParseException(String, CharSequence, int) public
     * java.time.format.DateTimeParseException(java.lang.String,java.lang.CharSequence,int)}.
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
    public void create_DateTimeParseException_String_CharSequence_int()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final DateTimeParseException sut = null; // = new DateTimeParseException(String, CharSequence, int);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.time.format.DateTimeParseException]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.time.format.DateTimeParseException]

}
