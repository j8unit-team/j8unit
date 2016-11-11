package org.j8unit.repository.java.time;

import java.time.DateTimeException;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link DateTimeException} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.time.DateTimeExceptionClassTests}).
 */

@RunWith(J8Unit4.class)
public class DateTimeExceptionClassTest
implements DateTimeExceptionClassTests<DateTimeException> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.time.DateTimeException]

    @Override
    public Class<DateTimeException> createNewSUT() {
        return DateTimeException.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.time.DateTimeException#DateTimeException(String) public
     * java.time.DateTimeException(java.lang.String)}.
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
    public void create_DateTimeException_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final DateTimeException sut = null; // = new DateTimeException(String);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.time.DateTimeException#DateTimeException(String, Throwable) public
     * java.time.DateTimeException(java.lang.String,java.lang.Throwable)}.
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
    public void create_DateTimeException_String_Throwable()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final DateTimeException sut = null; // = new DateTimeException(String, Throwable);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.time.DateTimeException]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.time.DateTimeException]

}
