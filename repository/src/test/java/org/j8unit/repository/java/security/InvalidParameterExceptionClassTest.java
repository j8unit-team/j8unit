package org.j8unit.repository.java.security;

import java.security.InvalidParameterException;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class InvalidParameterExceptionClassTest
implements org.j8unit.repository.java.security.InvalidParameterExceptionClassTests<InvalidParameterException> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.security.InvalidParameterException]

    @Override
    public Class<InvalidParameterException> createNewSUT() {
        return InvalidParameterException.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.security.InvalidParameterException#InvalidParameterException() public
     * java.security.InvalidParameterException()}.
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
    public void create_InvalidParameterException()
    throws Exception {
        // create new instance
        final InvalidParameterException sut = new InvalidParameterException();
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.security.InvalidParameterException#InvalidParameterException(String) public
     * java.security.InvalidParameterException(java.lang.String)}.
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
    public void create_InvalidParameterException_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final InvalidParameterException sut = null; // = new InvalidParameterException(String);
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.security.InvalidParameterException]

}
