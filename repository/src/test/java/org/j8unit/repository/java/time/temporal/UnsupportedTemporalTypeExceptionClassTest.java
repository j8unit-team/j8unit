package org.j8unit.repository.java.time.temporal;

import java.time.temporal.UnsupportedTemporalTypeException;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link UnsupportedTemporalTypeException} (by
 * simply reusing the J8Unit test interface
 * {@link org.j8unit.repository.java.time.temporal.UnsupportedTemporalTypeExceptionClassTests}).
 */

@RunWith(J8Unit4.class)
public class UnsupportedTemporalTypeExceptionClassTest
implements UnsupportedTemporalTypeExceptionClassTests<UnsupportedTemporalTypeException> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.time.temporal.UnsupportedTemporalTypeException]

    @Override
    public Class<UnsupportedTemporalTypeException> createNewSUT() {
        return UnsupportedTemporalTypeException.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.time.temporal.UnsupportedTemporalTypeException#UnsupportedTemporalTypeException(String) public
     * java.time.temporal.UnsupportedTemporalTypeException(java.lang.String)}.
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
    public void create_UnsupportedTemporalTypeException_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final UnsupportedTemporalTypeException sut = null; // = new UnsupportedTemporalTypeException(String);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.time.temporal.UnsupportedTemporalTypeException#UnsupportedTemporalTypeException(String, Throwable)
     * public java.time.temporal.UnsupportedTemporalTypeException(java.lang.String,java.lang.Throwable)}.
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
    public void create_UnsupportedTemporalTypeException_String_Throwable()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final UnsupportedTemporalTypeException sut = null; // = new UnsupportedTemporalTypeException(String, Throwable);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.time.temporal.UnsupportedTemporalTypeException]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.time.temporal.UnsupportedTemporalTypeException]

}
