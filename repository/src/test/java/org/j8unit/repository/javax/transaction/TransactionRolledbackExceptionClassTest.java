package org.j8unit.repository.javax.transaction;

import javax.transaction.TransactionRolledbackException;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class TransactionRolledbackExceptionClassTest
implements org.j8unit.repository.javax.transaction.TransactionRolledbackExceptionClassTests<TransactionRolledbackException> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.transaction.TransactionRolledbackException]

    @Override
    public Class<TransactionRolledbackException> createNewSUT() {
        return TransactionRolledbackException.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.transaction.TransactionRolledbackException#TransactionRolledbackException() public
     * javax.transaction.TransactionRolledbackException()}.
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
    public void create_TransactionRolledbackException()
    throws Exception {
        // create new instance
        final TransactionRolledbackException sut = new TransactionRolledbackException();
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.transaction.TransactionRolledbackException#TransactionRolledbackException(String) public
     * javax.transaction.TransactionRolledbackException(java.lang.String)}.
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
    public void create_TransactionRolledbackException_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final TransactionRolledbackException sut = null; // = new TransactionRolledbackException(String);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.transaction.TransactionRolledbackException]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.transaction.TransactionRolledbackException]

}
