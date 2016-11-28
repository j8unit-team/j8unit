package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.omg.CORBA.BAD_OPERATION;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link BAD_OPERATION} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.org.omg.CORBA.BAD_OPERATIONClassTests}).
 */
@RunWith(J8Unit4.class)
public class BAD_OPERATIONClassTest
implements BAD_OPERATIONClassTests<BAD_OPERATION> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.CORBA.BAD_OPERATION]

    @Override
    public Class<BAD_OPERATION> createNewSUT() {
        return BAD_OPERATION.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link org.omg.CORBA.BAD_OPERATION#BAD_OPERATION(String, int, org.omg.CORBA.CompletionStatus) public
     * org.omg.CORBA.BAD_OPERATION(java.lang.String,int,org.omg.CORBA.CompletionStatus)}.
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
    public void create_BAD_OPERATION_String_int_CompletionStatus()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final BAD_OPERATION sut = null; // = new BAD_OPERATION(String, int, org.omg.CORBA.CompletionStatus);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link org.omg.CORBA.BAD_OPERATION#BAD_OPERATION(int, org.omg.CORBA.CompletionStatus) public
     * org.omg.CORBA.BAD_OPERATION(int,org.omg.CORBA.CompletionStatus)}.
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
    public void create_BAD_OPERATION_int_CompletionStatus()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final BAD_OPERATION sut = null; // = new BAD_OPERATION(int, org.omg.CORBA.CompletionStatus);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link org.omg.CORBA.BAD_OPERATION#BAD_OPERATION(String) public org.omg.CORBA.BAD_OPERATION(java.lang.String)}.
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
    public void create_BAD_OPERATION_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final BAD_OPERATION sut = null; // = new BAD_OPERATION(String);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link org.omg.CORBA.BAD_OPERATION#BAD_OPERATION()
     * public org.omg.CORBA.BAD_OPERATION()}.
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
    public void create_BAD_OPERATION()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final BAD_OPERATION sut = new BAD_OPERATION();
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.omg.CORBA.BAD_OPERATION]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.CORBA.BAD_OPERATION]

}
