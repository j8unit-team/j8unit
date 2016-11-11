package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.omg.CORBA.PrincipalHolder;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link PrincipalHolder} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.org.omg.CORBA.PrincipalHolderClassTests}).
 */

@RunWith(J8Unit4.class)
public class PrincipalHolderClassTest
implements PrincipalHolderClassTests<PrincipalHolder> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.CORBA.PrincipalHolder]

    @Override
    public Class<PrincipalHolder> createNewSUT() {
        return PrincipalHolder.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link org.omg.CORBA.PrincipalHolder#PrincipalHolder(org.omg.CORBA.Principal) public
     * org.omg.CORBA.PrincipalHolder(org.omg.CORBA.Principal)}.
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
    public void create_PrincipalHolder_Principal()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final PrincipalHolder sut = null; // = new PrincipalHolder(org.omg.CORBA.Principal);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link org.omg.CORBA.PrincipalHolder#PrincipalHolder()
     * public org.omg.CORBA.PrincipalHolder()}.
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
    public void create_PrincipalHolder()
    throws Exception {
        // create new instance
        final PrincipalHolder sut = new PrincipalHolder();
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.omg.CORBA.PrincipalHolder]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.CORBA.PrincipalHolder]

}
