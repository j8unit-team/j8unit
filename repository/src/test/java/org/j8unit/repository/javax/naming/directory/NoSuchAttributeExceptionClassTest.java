package org.j8unit.repository.javax.naming.directory;

import javax.naming.directory.NoSuchAttributeException;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class NoSuchAttributeExceptionClassTest
implements org.j8unit.repository.javax.naming.directory.NoSuchAttributeExceptionClassTests<NoSuchAttributeException> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.naming.directory.NoSuchAttributeException]

    @Override
    public Class<NoSuchAttributeException> createNewSUT() {
        return NoSuchAttributeException.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link NoSuchAttributeException#NoSuchAttributeException(String) public
     * javax.naming.directory.NoSuchAttributeException(java.lang.String)}.
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
    public void create_NoSuchAttributeException_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final NoSuchAttributeException sut = null; // = new NoSuchAttributeException(String);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link NoSuchAttributeException#NoSuchAttributeException() public
     * javax.naming.directory.NoSuchAttributeException()}.
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
    public void create_NoSuchAttributeException()
    throws Exception {
        // create new instance
        final NoSuchAttributeException sut = new NoSuchAttributeException();
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.naming.directory.NoSuchAttributeException]

}
