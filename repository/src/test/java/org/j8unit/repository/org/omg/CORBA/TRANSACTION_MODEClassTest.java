package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.omg.CORBA.TRANSACTION_MODE;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link TRANSACTION_MODE} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.org.omg.CORBA.TRANSACTION_MODEClassTests}).
 */

@RunWith(J8Unit4.class)
public class TRANSACTION_MODEClassTest
implements TRANSACTION_MODEClassTests<TRANSACTION_MODE> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.CORBA.TRANSACTION_MODE]

    @Override
    public Class<TRANSACTION_MODE> createNewSUT() {
        return TRANSACTION_MODE.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link org.omg.CORBA.TRANSACTION_MODE#TRANSACTION_MODE(String, int, org.omg.CORBA.CompletionStatus) public
     * org.omg.CORBA.TRANSACTION_MODE(java.lang.String,int,org.omg.CORBA.CompletionStatus)}.
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
    public void create_TRANSACTION_MODE_String_int_CompletionStatus()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final TRANSACTION_MODE sut = null; // = new TRANSACTION_MODE(String, int, org.omg.CORBA.CompletionStatus);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link org.omg.CORBA.TRANSACTION_MODE#TRANSACTION_MODE(int, org.omg.CORBA.CompletionStatus) public
     * org.omg.CORBA.TRANSACTION_MODE(int,org.omg.CORBA.CompletionStatus)}.
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
    public void create_TRANSACTION_MODE_int_CompletionStatus()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final TRANSACTION_MODE sut = null; // = new TRANSACTION_MODE(int, org.omg.CORBA.CompletionStatus);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link org.omg.CORBA.TRANSACTION_MODE#TRANSACTION_MODE(String) public
     * org.omg.CORBA.TRANSACTION_MODE(java.lang.String)}.
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
    public void create_TRANSACTION_MODE_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final TRANSACTION_MODE sut = null; // = new TRANSACTION_MODE(String);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link org.omg.CORBA.TRANSACTION_MODE#TRANSACTION_MODE() public org.omg.CORBA.TRANSACTION_MODE()}.
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
    public void create_TRANSACTION_MODE()
    throws Exception {
        // create new instance
        final TRANSACTION_MODE sut = new TRANSACTION_MODE();
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.omg.CORBA.TRANSACTION_MODE]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.CORBA.TRANSACTION_MODE]

}
