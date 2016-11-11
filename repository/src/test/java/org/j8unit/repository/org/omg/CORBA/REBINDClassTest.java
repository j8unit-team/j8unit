package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.omg.CORBA.REBIND;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link REBIND} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.org.omg.CORBA.REBINDClassTests}).
 */

@RunWith(J8Unit4.class)
public class REBINDClassTest
implements REBINDClassTests<REBIND> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.CORBA.REBIND]

    @Override
    public Class<REBIND> createNewSUT() {
        return REBIND.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link org.omg.CORBA.REBIND#REBIND(String, int, org.omg.CORBA.CompletionStatus) public
     * org.omg.CORBA.REBIND(java.lang.String,int,org.omg.CORBA.CompletionStatus)}.
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
    public void create_REBIND_String_int_CompletionStatus()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final REBIND sut = null; // = new REBIND(String, int, org.omg.CORBA.CompletionStatus);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link org.omg.CORBA.REBIND#REBIND(int, org.omg.CORBA.CompletionStatus) public
     * org.omg.CORBA.REBIND(int,org.omg.CORBA.CompletionStatus)}.
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
    public void create_REBIND_int_CompletionStatus()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final REBIND sut = null; // = new REBIND(int, org.omg.CORBA.CompletionStatus);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link org.omg.CORBA.REBIND#REBIND(String) public
     * org.omg.CORBA.REBIND(java.lang.String)}.
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
    public void create_REBIND_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final REBIND sut = null; // = new REBIND(String);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link org.omg.CORBA.REBIND#REBIND() public
     * org.omg.CORBA.REBIND()}.
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
    public void create_REBIND()
    throws Exception {
        // create new instance
        final REBIND sut = new REBIND();
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.omg.CORBA.REBIND]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.CORBA.REBIND]

}
