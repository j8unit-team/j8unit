package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.omg.CORBA.CompletionStatus;
import org.omg.CORBA.TRANSIENT;

@RunWith(J8Unit4.class)
public class TRANSIENTClassTest
implements org.j8unit.repository.org.omg.CORBA.TRANSIENTClassTests<TRANSIENT> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.CORBA.TRANSIENT]

    @Override
    public Class<TRANSIENT> createNewSUT() {
        return TRANSIENT.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link TRANSIENT#TRANSIENT(String, int, CompletionStatus) public
     * org.omg.CORBA.TRANSIENT(java.lang.String,int,org.omg.CORBA.CompletionStatus)}.
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
    public void create_TRANSIENT_String_int_CompletionStatus()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final TRANSIENT sut = null; // = new TRANSIENT(String, int, CompletionStatus);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link TRANSIENT#TRANSIENT(int, CompletionStatus)
     * public org.omg.CORBA.TRANSIENT(int,org.omg.CORBA.CompletionStatus)}.
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
    public void create_TRANSIENT_int_CompletionStatus()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final TRANSIENT sut = null; // = new TRANSIENT(int, CompletionStatus);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link TRANSIENT#TRANSIENT(String) public
     * org.omg.CORBA.TRANSIENT(java.lang.String)}.
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
    public void create_TRANSIENT_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final TRANSIENT sut = null; // = new TRANSIENT(String);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link TRANSIENT#TRANSIENT() public
     * org.omg.CORBA.TRANSIENT()}.
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
    public void create_TRANSIENT()
    throws Exception {
        // create new instance
        final TRANSIENT sut = new TRANSIENT();
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.CORBA.TRANSIENT]

}
