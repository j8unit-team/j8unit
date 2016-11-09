package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.omg.CORBA.PolicyListHolder;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link PolicyListHolder} (by simply reusing the
 * J8Unit test interface {@link PolicyListHolderClassTests}).
 */

@RunWith(J8Unit4.class)
public class PolicyListHolderClassTest
implements PolicyListHolderClassTests<PolicyListHolder> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.CORBA.PolicyListHolder]

    @Override
    public Class<PolicyListHolder> createNewSUT() {
        return PolicyListHolder.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link org.omg.CORBA.PolicyListHolder#PolicyListHolder(org.omg.CORBA.Policy[]) public
     * org.omg.CORBA.PolicyListHolder(org.omg.CORBA.Policy[])}.
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
    public void create_PolicyListHolder_PolicyArray()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final PolicyListHolder sut = null; // = new PolicyListHolder(org.omg.CORBA.Policy[]);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link org.omg.CORBA.PolicyListHolder#PolicyListHolder() public org.omg.CORBA.PolicyListHolder()}.
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
    public void create_PolicyListHolder()
    throws Exception {
        // create new instance
        final PolicyListHolder sut = new PolicyListHolder();
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.omg.CORBA.PolicyListHolder]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.CORBA.PolicyListHolder]

}
