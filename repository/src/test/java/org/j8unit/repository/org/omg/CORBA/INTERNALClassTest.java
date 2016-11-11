package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.omg.CORBA.INTERNAL;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link INTERNAL} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.org.omg.CORBA.INTERNALClassTests}).
 */

@RunWith(J8Unit4.class)
public class INTERNALClassTest
implements INTERNALClassTests<INTERNAL> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.CORBA.INTERNAL]

    @Override
    public Class<INTERNAL> createNewSUT() {
        return INTERNAL.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link org.omg.CORBA.INTERNAL#INTERNAL(String, int, org.omg.CORBA.CompletionStatus) public
     * org.omg.CORBA.INTERNAL(java.lang.String,int,org.omg.CORBA.CompletionStatus)}.
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
    public void create_INTERNAL_String_int_CompletionStatus()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final INTERNAL sut = null; // = new INTERNAL(String, int, org.omg.CORBA.CompletionStatus);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link org.omg.CORBA.INTERNAL#INTERNAL(int, org.omg.CORBA.CompletionStatus) public
     * org.omg.CORBA.INTERNAL(int,org.omg.CORBA.CompletionStatus)}.
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
    public void create_INTERNAL_int_CompletionStatus()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final INTERNAL sut = null; // = new INTERNAL(int, org.omg.CORBA.CompletionStatus);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link org.omg.CORBA.INTERNAL#INTERNAL(String) public
     * org.omg.CORBA.INTERNAL(java.lang.String)}.
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
    public void create_INTERNAL_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final INTERNAL sut = null; // = new INTERNAL(String);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link org.omg.CORBA.INTERNAL#INTERNAL() public
     * org.omg.CORBA.INTERNAL()}.
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
    public void create_INTERNAL()
    throws Exception {
        // create new instance
        final INTERNAL sut = new INTERNAL();
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.omg.CORBA.INTERNAL]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.CORBA.INTERNAL]

}
