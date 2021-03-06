package org.j8unit.repository.javax.naming.directory;

import javax.naming.directory.InvalidAttributeIdentifierException;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link InvalidAttributeIdentifierException} (by
 * simply reusing the J8Unit test interface
 * {@link org.j8unit.repository.javax.naming.directory.InvalidAttributeIdentifierExceptionClassTests}).
 */
@RunWith(J8Unit4.class)
public class InvalidAttributeIdentifierExceptionClassTest
implements InvalidAttributeIdentifierExceptionClassTests<InvalidAttributeIdentifierException> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.naming.directory.InvalidAttributeIdentifierException]

    @Override
    public Class<InvalidAttributeIdentifierException> createNewSUT() {
        return InvalidAttributeIdentifierException.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.naming.directory.InvalidAttributeIdentifierException#InvalidAttributeIdentifierException(String)
     * public javax.naming.directory.InvalidAttributeIdentifierException(java.lang.String)}.
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
    public void create_InvalidAttributeIdentifierException_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final InvalidAttributeIdentifierException sut = null; // = new InvalidAttributeIdentifierException(String);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.naming.directory.InvalidAttributeIdentifierException#InvalidAttributeIdentifierException() public
     * javax.naming.directory.InvalidAttributeIdentifierException()}.
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
    public void create_InvalidAttributeIdentifierException()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final InvalidAttributeIdentifierException sut = new InvalidAttributeIdentifierException();
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.naming.directory.InvalidAttributeIdentifierException]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.naming.directory.InvalidAttributeIdentifierException]

}
