package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.omg.CORBA.PolicyHolder;

@RunWith(J8Unit4.class)
public class PolicyHolderClassTest
implements org.j8unit.repository.org.omg.CORBA.PolicyHolderClassTests<PolicyHolder> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.CORBA.PolicyHolder]

    @Override
    public Class<PolicyHolder> createNewSUT() {
        return PolicyHolder.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link org.omg.CORBA.PolicyHolder#PolicyHolder(org.omg.CORBA.Policy) public
     * org.omg.CORBA.PolicyHolder(org.omg.CORBA.Policy)}.
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
    public void create_PolicyHolder_Policy()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final PolicyHolder sut = null; // = new PolicyHolder(org.omg.CORBA.Policy);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link org.omg.CORBA.PolicyHolder#PolicyHolder()
     * public org.omg.CORBA.PolicyHolder()}.
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
    public void create_PolicyHolder()
    throws Exception {
        // create new instance
        final PolicyHolder sut = new PolicyHolder();
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.CORBA.PolicyHolder]

}
