package org.j8unit.repository.org.omg.CosNaming.NamingContextPackage;

import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.omg.CosNaming.NamingContextPackage.CannotProceedHolder;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link CannotProceedHolder} (by simply reusing
 * the J8Unit test interface
 * {@link org.j8unit.repository.org.omg.CosNaming.NamingContextPackage.CannotProceedHolderClassTests}).
 */

@RunWith(J8Unit4.class)
public class CannotProceedHolderClassTest
implements CannotProceedHolderClassTests<CannotProceedHolder> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.CosNaming.NamingContextPackage.CannotProceedHolder]

    @Override
    public Class<CannotProceedHolder> createNewSUT() {
        return CannotProceedHolder.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link org.omg.CosNaming.NamingContextPackage.CannotProceedHolder#CannotProceedHolder(org.omg.CosNaming.NamingContextPackage.CannotProceed)
     * public
     * org.omg.CosNaming.NamingContextPackage.CannotProceedHolder(org.omg.CosNaming.NamingContextPackage.CannotProceed)}.
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
    public void create_CannotProceedHolder_CannotProceed()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final CannotProceedHolder sut = null; // = new
                                              // CannotProceedHolder(org.omg.CosNaming.NamingContextPackage.CannotProceed);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link org.omg.CosNaming.NamingContextPackage.CannotProceedHolder#CannotProceedHolder() public
     * org.omg.CosNaming.NamingContextPackage.CannotProceedHolder()}.
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
    public void create_CannotProceedHolder()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final CannotProceedHolder sut = new CannotProceedHolder();
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.omg.CosNaming.NamingContextPackage.CannotProceedHolder]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.CosNaming.NamingContextPackage.CannotProceedHolder]

}
