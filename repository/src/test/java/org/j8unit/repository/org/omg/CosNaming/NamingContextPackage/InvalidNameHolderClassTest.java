package org.j8unit.repository.org.omg.CosNaming.NamingContextPackage;

import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.omg.CosNaming.NamingContextPackage.InvalidNameHolder;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link InvalidNameHolder} (by simply reusing the
 * J8Unit test interface {@link InvalidNameHolderClassTests}).
 */

@RunWith(J8Unit4.class)
public class InvalidNameHolderClassTest
implements InvalidNameHolderClassTests<InvalidNameHolder> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.CosNaming.NamingContextPackage.InvalidNameHolder]

    @Override
    public Class<InvalidNameHolder> createNewSUT() {
        return InvalidNameHolder.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link org.omg.CosNaming.NamingContextPackage.InvalidNameHolder#InvalidNameHolder(org.omg.CosNaming.NamingContextPackage.InvalidName)
     * public
     * org.omg.CosNaming.NamingContextPackage.InvalidNameHolder(org.omg.CosNaming.NamingContextPackage.InvalidName)}.
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
    public void create_InvalidNameHolder_InvalidName()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final InvalidNameHolder sut = null; // = new
                                            // InvalidNameHolder(org.omg.CosNaming.NamingContextPackage.InvalidName);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link org.omg.CosNaming.NamingContextPackage.InvalidNameHolder#InvalidNameHolder() public
     * org.omg.CosNaming.NamingContextPackage.InvalidNameHolder()}.
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
    public void create_InvalidNameHolder()
    throws Exception {
        // create new instance
        final InvalidNameHolder sut = new InvalidNameHolder();
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.omg.CosNaming.NamingContextPackage.InvalidNameHolder]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.CosNaming.NamingContextPackage.InvalidNameHolder]

}
