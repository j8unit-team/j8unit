package org.j8unit.repository.java.io;

import java.io.CharConversionException;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link CharConversionException} (by simply
 * reusing the J8Unit test interface {@link org.j8unit.repository.java.io.CharConversionExceptionClassTests}).
 */
@RunWith(J8Unit4.class)
public class CharConversionExceptionClassTest
implements CharConversionExceptionClassTests<CharConversionException> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.io.CharConversionException]

    @Override
    public Class<CharConversionException> createNewSUT() {
        return CharConversionException.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.io.CharConversionException#CharConversionException() public java.io.CharConversionException()}.
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
    public void create_CharConversionException()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final CharConversionException sut = new CharConversionException();
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.io.CharConversionException#CharConversionException(String) public
     * java.io.CharConversionException(java.lang.String)}.
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
    public void create_CharConversionException_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final CharConversionException sut = null; // = new CharConversionException(String);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.io.CharConversionException]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.io.CharConversionException]

}
