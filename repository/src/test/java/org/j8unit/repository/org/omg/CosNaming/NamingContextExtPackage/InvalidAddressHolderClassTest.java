package org.j8unit.repository.org.omg.CosNaming.NamingContextExtPackage;

import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.omg.CosNaming.NamingContextExtPackage.InvalidAddressHolder;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link InvalidAddressHolder} (by simply reusing
 * the J8Unit test interface {@link InvalidAddressHolderClassTests}).
 */

@RunWith(J8Unit4.class)
public class InvalidAddressHolderClassTest
implements InvalidAddressHolderClassTests<InvalidAddressHolder> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.CosNaming.NamingContextExtPackage.InvalidAddressHolder]

    @Override
    public Class<InvalidAddressHolder> createNewSUT() {
        return InvalidAddressHolder.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link org.omg.CosNaming.NamingContextExtPackage.InvalidAddressHolder#InvalidAddressHolder(org.omg.CosNaming.NamingContextExtPackage.InvalidAddress)
     * public
     * org.omg.CosNaming.NamingContextExtPackage.InvalidAddressHolder(org.omg.CosNaming.NamingContextExtPackage.InvalidAddress)}.
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
    public void create_InvalidAddressHolder_InvalidAddress()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final InvalidAddressHolder sut = null; // = new
                                               // InvalidAddressHolder(org.omg.CosNaming.NamingContextExtPackage.InvalidAddress);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link org.omg.CosNaming.NamingContextExtPackage.InvalidAddressHolder#InvalidAddressHolder() public
     * org.omg.CosNaming.NamingContextExtPackage.InvalidAddressHolder()}.
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
    public void create_InvalidAddressHolder()
    throws Exception {
        // create new instance
        final InvalidAddressHolder sut = new InvalidAddressHolder();
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.omg.CosNaming.NamingContextExtPackage.InvalidAddressHolder]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.CosNaming.NamingContextExtPackage.InvalidAddressHolder]

}
