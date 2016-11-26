package org.j8unit.repository.javax.transaction;

import javax.transaction.InvalidTransactionException;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link InvalidTransactionException} (by simply
 * reusing the J8Unit test interface
 * {@link org.j8unit.repository.javax.transaction.InvalidTransactionExceptionClassTests}).
 */
@RunWith(J8Unit4.class)
public class InvalidTransactionExceptionClassTest
implements InvalidTransactionExceptionClassTests<InvalidTransactionException> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.transaction.InvalidTransactionException]

    @Override
    public Class<InvalidTransactionException> createNewSUT() {
        return InvalidTransactionException.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.transaction.InvalidTransactionException#InvalidTransactionException() public
     * javax.transaction.InvalidTransactionException()}.
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
    public void create_InvalidTransactionException()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final InvalidTransactionException sut = new InvalidTransactionException();
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.transaction.InvalidTransactionException#InvalidTransactionException(String) public
     * javax.transaction.InvalidTransactionException(java.lang.String)}.
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
    public void create_InvalidTransactionException_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final InvalidTransactionException sut = null; // = new InvalidTransactionException(String);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.transaction.InvalidTransactionException]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.transaction.InvalidTransactionException]

}
