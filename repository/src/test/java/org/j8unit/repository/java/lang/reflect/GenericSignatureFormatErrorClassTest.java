package org.j8unit.repository.java.lang.reflect;

import java.lang.reflect.GenericSignatureFormatError;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link GenericSignatureFormatError} (by simply
 * reusing the J8Unit test interface
 * {@link org.j8unit.repository.java.lang.reflect.GenericSignatureFormatErrorClassTests}).
 */

@RunWith(J8Unit4.class)
public class GenericSignatureFormatErrorClassTest
implements GenericSignatureFormatErrorClassTests<GenericSignatureFormatError> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.lang.reflect.GenericSignatureFormatError]

    @Override
    public Class<GenericSignatureFormatError> createNewSUT() {
        return GenericSignatureFormatError.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.lang.reflect.GenericSignatureFormatError#GenericSignatureFormatError() public
     * java.lang.reflect.GenericSignatureFormatError()}.
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
    public void create_GenericSignatureFormatError()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final GenericSignatureFormatError sut = new GenericSignatureFormatError();
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.lang.reflect.GenericSignatureFormatError#GenericSignatureFormatError(String) public
     * java.lang.reflect.GenericSignatureFormatError(java.lang.String)}.
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
    public void create_GenericSignatureFormatError_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final GenericSignatureFormatError sut = null; // = new GenericSignatureFormatError(String);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.lang.reflect.GenericSignatureFormatError]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.lang.reflect.GenericSignatureFormatError]

}
