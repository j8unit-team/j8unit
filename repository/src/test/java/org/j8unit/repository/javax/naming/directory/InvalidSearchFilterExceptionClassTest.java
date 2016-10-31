package org.j8unit.repository.javax.naming.directory;

import javax.naming.directory.InvalidSearchFilterException;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class InvalidSearchFilterExceptionClassTest
implements org.j8unit.repository.javax.naming.directory.InvalidSearchFilterExceptionClassTests<InvalidSearchFilterException> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.naming.directory.InvalidSearchFilterException]

    @Override
    public Class<InvalidSearchFilterException> createNewSUT() {
        return InvalidSearchFilterException.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.naming.directory.InvalidSearchFilterException#InvalidSearchFilterException() public
     * javax.naming.directory.InvalidSearchFilterException()}.
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
    public void create_InvalidSearchFilterException()
    throws Exception {
        // create new instance
        final InvalidSearchFilterException sut = new InvalidSearchFilterException();
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.naming.directory.InvalidSearchFilterException#InvalidSearchFilterException(String) public
     * javax.naming.directory.InvalidSearchFilterException(java.lang.String)}.
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
    public void create_InvalidSearchFilterException_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final InvalidSearchFilterException sut = null; // = new InvalidSearchFilterException(String);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.naming.directory.InvalidSearchFilterException]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.naming.directory.InvalidSearchFilterException]

}
