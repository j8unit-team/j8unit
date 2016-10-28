package org.j8unit.repository.java.util;

import java.util.IllegalFormatConversionException;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class IllegalFormatConversionExceptionClassTest
implements org.j8unit.repository.java.util.IllegalFormatConversionExceptionClassTests<IllegalFormatConversionException> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.util.IllegalFormatConversionException]

    @Override
    public Class<IllegalFormatConversionException> createNewSUT() {
        return IllegalFormatConversionException.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link IllegalFormatConversionException#IllegalFormatConversionException(char, Class) public
     * java.util.IllegalFormatConversionException(char,java.lang.Class<?>)}.
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
    public void create_IllegalFormatConversionException_char_Class()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final IllegalFormatConversionException sut = null; // = new IllegalFormatConversionException(char, Class);
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.util.IllegalFormatConversionException]

}
