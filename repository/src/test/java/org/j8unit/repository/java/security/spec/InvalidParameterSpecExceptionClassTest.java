package org.j8unit.repository.java.security.spec;

import java.security.spec.InvalidParameterSpecException;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link InvalidParameterSpecException} (by simply
 * reusing the J8Unit test interface
 * {@link org.j8unit.repository.java.security.spec.InvalidParameterSpecExceptionClassTests}).
 */
@RunWith(J8Unit4.class)
public class InvalidParameterSpecExceptionClassTest
implements InvalidParameterSpecExceptionClassTests<InvalidParameterSpecException> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.security.spec.InvalidParameterSpecException]

    @Override
    public Class<InvalidParameterSpecException> createNewSUT() {
        return InvalidParameterSpecException.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.security.spec.InvalidParameterSpecException#InvalidParameterSpecException() public
     * java.security.spec.InvalidParameterSpecException()}.
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
    public void create_InvalidParameterSpecException()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final InvalidParameterSpecException sut = new InvalidParameterSpecException();
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.security.spec.InvalidParameterSpecException#InvalidParameterSpecException(String) public
     * java.security.spec.InvalidParameterSpecException(java.lang.String)}.
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
    public void create_InvalidParameterSpecException_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final InvalidParameterSpecException sut = null; // = new InvalidParameterSpecException(String);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.security.spec.InvalidParameterSpecException]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.security.spec.InvalidParameterSpecException]

}
