package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.omg.CORBA.BAD_PARAM;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link BAD_PARAM} (by simply reusing the J8Unit
 * test interface {@link BAD_PARAMClassTests}).
 */

@RunWith(J8Unit4.class)
public class BAD_PARAMClassTest
implements BAD_PARAMClassTests<BAD_PARAM> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.CORBA.BAD_PARAM]

    @Override
    public Class<BAD_PARAM> createNewSUT() {
        return BAD_PARAM.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link org.omg.CORBA.BAD_PARAM#BAD_PARAM(String, int, org.omg.CORBA.CompletionStatus) public
     * org.omg.CORBA.BAD_PARAM(java.lang.String,int,org.omg.CORBA.CompletionStatus)}.
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
    public void create_BAD_PARAM_String_int_CompletionStatus()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final BAD_PARAM sut = null; // = new BAD_PARAM(String, int, org.omg.CORBA.CompletionStatus);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link org.omg.CORBA.BAD_PARAM#BAD_PARAM(int, org.omg.CORBA.CompletionStatus) public
     * org.omg.CORBA.BAD_PARAM(int,org.omg.CORBA.CompletionStatus)}.
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
    public void create_BAD_PARAM_int_CompletionStatus()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final BAD_PARAM sut = null; // = new BAD_PARAM(int, org.omg.CORBA.CompletionStatus);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link org.omg.CORBA.BAD_PARAM#BAD_PARAM(String)
     * public org.omg.CORBA.BAD_PARAM(java.lang.String)}.
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
    public void create_BAD_PARAM_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final BAD_PARAM sut = null; // = new BAD_PARAM(String);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link org.omg.CORBA.BAD_PARAM#BAD_PARAM() public
     * org.omg.CORBA.BAD_PARAM()}.
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
    public void create_BAD_PARAM()
    throws Exception {
        // create new instance
        final BAD_PARAM sut = new BAD_PARAM();
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.omg.CORBA.BAD_PARAM]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.CORBA.BAD_PARAM]

}
