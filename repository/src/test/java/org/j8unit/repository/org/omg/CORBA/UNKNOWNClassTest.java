package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.omg.CORBA.CompletionStatus;
import org.omg.CORBA.UNKNOWN;

@RunWith(J8Unit4.class)
public class UNKNOWNClassTest
implements org.j8unit.repository.org.omg.CORBA.UNKNOWNClassTests<UNKNOWN> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.CORBA.UNKNOWN]

    @Override
    public Class<UNKNOWN> createNewSUT() {
        return UNKNOWN.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link UNKNOWN#UNKNOWN(String, int, CompletionStatus)
     * public org.omg.CORBA.UNKNOWN(java.lang.String,int,org.omg.CORBA.CompletionStatus)}.
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
    public void create_UNKNOWN_String_int_CompletionStatus()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final UNKNOWN sut = null; // = new UNKNOWN(String, int, CompletionStatus);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link UNKNOWN#UNKNOWN(int, CompletionStatus) public
     * org.omg.CORBA.UNKNOWN(int,org.omg.CORBA.CompletionStatus)}.
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
    public void create_UNKNOWN_int_CompletionStatus()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final UNKNOWN sut = null; // = new UNKNOWN(int, CompletionStatus);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link UNKNOWN#UNKNOWN(String) public
     * org.omg.CORBA.UNKNOWN(java.lang.String)}.
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
    public void create_UNKNOWN_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final UNKNOWN sut = null; // = new UNKNOWN(String);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link UNKNOWN#UNKNOWN() public
     * org.omg.CORBA.UNKNOWN()}.
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
    public void create_UNKNOWN()
    throws Exception {
        // create new instance
        final UNKNOWN sut = new UNKNOWN();
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.CORBA.UNKNOWN]

}
