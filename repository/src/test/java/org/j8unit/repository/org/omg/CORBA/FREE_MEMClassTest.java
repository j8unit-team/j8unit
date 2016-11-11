package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.omg.CORBA.FREE_MEM;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link FREE_MEM} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.org.omg.CORBA.FREE_MEMClassTests}).
 */

@RunWith(J8Unit4.class)
public class FREE_MEMClassTest
implements FREE_MEMClassTests<FREE_MEM> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.CORBA.FREE_MEM]

    @Override
    public Class<FREE_MEM> createNewSUT() {
        return FREE_MEM.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link org.omg.CORBA.FREE_MEM#FREE_MEM(String, int, org.omg.CORBA.CompletionStatus) public
     * org.omg.CORBA.FREE_MEM(java.lang.String,int,org.omg.CORBA.CompletionStatus)}.
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
    public void create_FREE_MEM_String_int_CompletionStatus()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final FREE_MEM sut = null; // = new FREE_MEM(String, int, org.omg.CORBA.CompletionStatus);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link org.omg.CORBA.FREE_MEM#FREE_MEM(int, org.omg.CORBA.CompletionStatus) public
     * org.omg.CORBA.FREE_MEM(int,org.omg.CORBA.CompletionStatus)}.
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
    public void create_FREE_MEM_int_CompletionStatus()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final FREE_MEM sut = null; // = new FREE_MEM(int, org.omg.CORBA.CompletionStatus);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link org.omg.CORBA.FREE_MEM#FREE_MEM(String) public
     * org.omg.CORBA.FREE_MEM(java.lang.String)}.
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
    public void create_FREE_MEM_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final FREE_MEM sut = null; // = new FREE_MEM(String);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link org.omg.CORBA.FREE_MEM#FREE_MEM() public
     * org.omg.CORBA.FREE_MEM()}.
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
    public void create_FREE_MEM()
    throws Exception {
        // create new instance
        final FREE_MEM sut = new FREE_MEM();
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.omg.CORBA.FREE_MEM]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.CORBA.FREE_MEM]

}
