package org.j8unit.repository.java.nio.charset;

import java.nio.charset.IllegalCharsetNameException;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link IllegalCharsetNameException} (by simply
 * reusing the J8Unit test interface
 * {@link org.j8unit.repository.java.nio.charset.IllegalCharsetNameExceptionClassTests}).
 */

@RunWith(J8Unit4.class)
public class IllegalCharsetNameExceptionClassTest
implements IllegalCharsetNameExceptionClassTests<IllegalCharsetNameException> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.nio.charset.IllegalCharsetNameException]

    @Override
    public Class<IllegalCharsetNameException> createNewSUT() {
        return IllegalCharsetNameException.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.nio.charset.IllegalCharsetNameException#IllegalCharsetNameException(String) public
     * java.nio.charset.IllegalCharsetNameException(java.lang.String)}.
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
    public void create_IllegalCharsetNameException_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final IllegalCharsetNameException sut = null; // = new IllegalCharsetNameException(String);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.nio.charset.IllegalCharsetNameException]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.nio.charset.IllegalCharsetNameException]

}
