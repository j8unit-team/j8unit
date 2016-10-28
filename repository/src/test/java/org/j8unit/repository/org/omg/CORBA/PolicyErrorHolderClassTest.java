package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.omg.CORBA.PolicyError;
import org.omg.CORBA.PolicyErrorHolder;

@RunWith(J8Unit4.class)
public class PolicyErrorHolderClassTest
implements org.j8unit.repository.org.omg.CORBA.PolicyErrorHolderClassTests<PolicyErrorHolder> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.CORBA.PolicyErrorHolder]

    @Override
    public Class<PolicyErrorHolder> createNewSUT() {
        return PolicyErrorHolder.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link PolicyErrorHolder#PolicyErrorHolder() public
     * org.omg.CORBA.PolicyErrorHolder()}.
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
    public void create_PolicyErrorHolder()
    throws Exception {
        // create new instance
        final PolicyErrorHolder sut = new PolicyErrorHolder();
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link PolicyErrorHolder#PolicyErrorHolder(PolicyError) public
     * org.omg.CORBA.PolicyErrorHolder(org.omg.CORBA.PolicyError)}.
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
    public void create_PolicyErrorHolder_PolicyError()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final PolicyErrorHolder sut = null; // = new PolicyErrorHolder(PolicyError);
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.CORBA.PolicyErrorHolder]

}
