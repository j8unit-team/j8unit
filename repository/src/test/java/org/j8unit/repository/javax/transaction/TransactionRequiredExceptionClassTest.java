package org.j8unit.repository.javax.transaction;

import javax.transaction.TransactionRequiredException;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link TransactionRequiredException} (by simply
 * reusing the J8Unit test interface {@link TransactionRequiredExceptionClassTests}).
 */

@RunWith(J8Unit4.class)
public class TransactionRequiredExceptionClassTest
implements TransactionRequiredExceptionClassTests<TransactionRequiredException> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.transaction.TransactionRequiredException]

    @Override
    public Class<TransactionRequiredException> createNewSUT() {
        return TransactionRequiredException.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.transaction.TransactionRequiredException#TransactionRequiredException() public
     * javax.transaction.TransactionRequiredException()}.
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
    public void create_TransactionRequiredException()
    throws Exception {
        // create new instance
        final TransactionRequiredException sut = new TransactionRequiredException();
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.transaction.TransactionRequiredException#TransactionRequiredException(String) public
     * javax.transaction.TransactionRequiredException(java.lang.String)}.
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
    public void create_TransactionRequiredException_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final TransactionRequiredException sut = null; // = new TransactionRequiredException(String);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.transaction.TransactionRequiredException]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.transaction.TransactionRequiredException]

}
