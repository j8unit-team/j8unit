package org.j8unit.repository.javax.naming;

import javax.naming.InvalidNameException;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link InvalidNameException} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.javax.naming.InvalidNameExceptionClassTests}).
 */

@RunWith(J8Unit4.class)
public class InvalidNameExceptionClassTest
implements InvalidNameExceptionClassTests<InvalidNameException> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.naming.InvalidNameException]

    @Override
    public Class<InvalidNameException> createNewSUT() {
        return InvalidNameException.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.naming.InvalidNameException#InvalidNameException(String) public
     * javax.naming.InvalidNameException(java.lang.String)}.
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
    public void create_InvalidNameException_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final InvalidNameException sut = null; // = new InvalidNameException(String);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.naming.InvalidNameException#InvalidNameException() public javax.naming.InvalidNameException()}.
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
    public void create_InvalidNameException()
    throws Exception {
        // create new instance
        final InvalidNameException sut = new InvalidNameException();
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.naming.InvalidNameException]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.naming.InvalidNameException]

}
