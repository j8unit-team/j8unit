package org.j8unit.repository.org.omg.CosNaming.NamingContextPackage;

import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.omg.CosNaming.NamingContextPackage.AlreadyBoundHolder;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link AlreadyBoundHolder} (by simply reusing
 * the J8Unit test interface
 * {@link org.j8unit.repository.org.omg.CosNaming.NamingContextPackage.AlreadyBoundHolderClassTests}).
 */

@RunWith(J8Unit4.class)
public class AlreadyBoundHolderClassTest
implements AlreadyBoundHolderClassTests<AlreadyBoundHolder> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.CosNaming.NamingContextPackage.AlreadyBoundHolder]

    @Override
    public Class<AlreadyBoundHolder> createNewSUT() {
        return AlreadyBoundHolder.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link org.omg.CosNaming.NamingContextPackage.AlreadyBoundHolder#AlreadyBoundHolder(org.omg.CosNaming.NamingContextPackage.AlreadyBound)
     * public
     * org.omg.CosNaming.NamingContextPackage.AlreadyBoundHolder(org.omg.CosNaming.NamingContextPackage.AlreadyBound)}.
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
    public void create_AlreadyBoundHolder_AlreadyBound()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final AlreadyBoundHolder sut = null; // = new
                                             // AlreadyBoundHolder(org.omg.CosNaming.NamingContextPackage.AlreadyBound);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link org.omg.CosNaming.NamingContextPackage.AlreadyBoundHolder#AlreadyBoundHolder() public
     * org.omg.CosNaming.NamingContextPackage.AlreadyBoundHolder()}.
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
    public void create_AlreadyBoundHolder()
    throws Exception {
        // create new instance
        final AlreadyBoundHolder sut = new AlreadyBoundHolder();
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.omg.CosNaming.NamingContextPackage.AlreadyBoundHolder]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.CosNaming.NamingContextPackage.AlreadyBoundHolder]

}
