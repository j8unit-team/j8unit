package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.omg.CORBA.PolicyError;

@RunWith(J8Unit4.class)
public class PolicyErrorClassTest
implements org.j8unit.repository.org.omg.CORBA.PolicyErrorClassTests<PolicyError> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.CORBA.PolicyError]

    @Override
    public Class<PolicyError> createNewSUT() {
        return PolicyError.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link org.omg.CORBA.PolicyError#PolicyError() public
     * org.omg.CORBA.PolicyError()}.
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
    public void create_PolicyError()
    throws Exception {
        // create new instance
        final PolicyError sut = new PolicyError();
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link org.omg.CORBA.PolicyError#PolicyError(short)
     * public org.omg.CORBA.PolicyError(short)}.
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
    public void create_PolicyError_short()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final PolicyError sut = null; // = new PolicyError(short);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link org.omg.CORBA.PolicyError#PolicyError(String, short) public
     * org.omg.CORBA.PolicyError(java.lang.String,short)}.
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
    public void create_PolicyError_String_short()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final PolicyError sut = null; // = new PolicyError(String, short);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.omg.CORBA.PolicyError]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.CORBA.PolicyError]

}
