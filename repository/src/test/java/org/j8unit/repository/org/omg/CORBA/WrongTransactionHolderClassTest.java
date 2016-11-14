package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.omg.CORBA.WrongTransactionHolder;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link WrongTransactionHolder} (by simply
 * reusing the J8Unit test interface {@link org.j8unit.repository.org.omg.CORBA.WrongTransactionHolderClassTests}).
 */

@RunWith(J8Unit4.class)
public class WrongTransactionHolderClassTest
implements WrongTransactionHolderClassTests<WrongTransactionHolder> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.CORBA.WrongTransactionHolder]

    @Override
    public Class<WrongTransactionHolder> createNewSUT() {
        return WrongTransactionHolder.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link org.omg.CORBA.WrongTransactionHolder#WrongTransactionHolder(org.omg.CORBA.WrongTransaction) public
     * org.omg.CORBA.WrongTransactionHolder(org.omg.CORBA.WrongTransaction)}.
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
    public void create_WrongTransactionHolder_WrongTransaction()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final WrongTransactionHolder sut = null; // = new WrongTransactionHolder(org.omg.CORBA.WrongTransaction);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link org.omg.CORBA.WrongTransactionHolder#WrongTransactionHolder() public
     * org.omg.CORBA.WrongTransactionHolder()}.
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
    public void create_WrongTransactionHolder()
    throws Exception {
        // create new instance
        final WrongTransactionHolder sut = new WrongTransactionHolder();
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.omg.CORBA.WrongTransactionHolder]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.CORBA.WrongTransactionHolder]

}
