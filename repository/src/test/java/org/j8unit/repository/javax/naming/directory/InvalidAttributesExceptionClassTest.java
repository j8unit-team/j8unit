package org.j8unit.repository.javax.naming.directory;

import javax.naming.directory.InvalidAttributesException;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class InvalidAttributesExceptionClassTest
implements org.j8unit.repository.javax.naming.directory.InvalidAttributesExceptionClassTests<InvalidAttributesException> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.naming.directory.InvalidAttributesException]

    @Override
    public Class<InvalidAttributesException> createNewSUT() {
        return InvalidAttributesException.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.naming.directory.InvalidAttributesException#InvalidAttributesException(String) public
     * javax.naming.directory.InvalidAttributesException(java.lang.String)}.
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
    public void create_InvalidAttributesException_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final InvalidAttributesException sut = null; // = new InvalidAttributesException(String);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.naming.directory.InvalidAttributesException#InvalidAttributesException() public
     * javax.naming.directory.InvalidAttributesException()}.
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
    public void create_InvalidAttributesException()
    throws Exception {
        // create new instance
        final InvalidAttributesException sut = new InvalidAttributesException();
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.naming.directory.InvalidAttributesException]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.naming.directory.InvalidAttributesException]

}
