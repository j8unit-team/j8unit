package org.j8unit.repository.java.lang.reflect;

import java.lang.reflect.MalformedParametersException;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link MalformedParametersException} (by simply
 * reusing the J8Unit test interface {@link MalformedParametersExceptionClassTests}).
 */

@RunWith(J8Unit4.class)
public class MalformedParametersExceptionClassTest
implements MalformedParametersExceptionClassTests<MalformedParametersException> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.lang.reflect.MalformedParametersException]

    @Override
    public Class<MalformedParametersException> createNewSUT() {
        return MalformedParametersException.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.lang.reflect.MalformedParametersException#MalformedParametersException() public
     * java.lang.reflect.MalformedParametersException()}.
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
    public void create_MalformedParametersException()
    throws Exception {
        // create new instance
        final MalformedParametersException sut = new MalformedParametersException();
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.lang.reflect.MalformedParametersException#MalformedParametersException(String) public
     * java.lang.reflect.MalformedParametersException(java.lang.String)}.
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
    public void create_MalformedParametersException_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final MalformedParametersException sut = null; // = new MalformedParametersException(String);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.lang.reflect.MalformedParametersException]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.lang.reflect.MalformedParametersException]

}
