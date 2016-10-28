package org.j8unit.repository.org.omg.CosNaming.NamingContextExtPackage;

import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.omg.CosNaming.NamingContextExtPackage.InvalidAddress;

@RunWith(J8Unit4.class)
public class InvalidAddressClassTest
implements org.j8unit.repository.org.omg.CosNaming.NamingContextExtPackage.InvalidAddressClassTests<InvalidAddress> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.CosNaming.NamingContextExtPackage.InvalidAddress]

    @Override
    public Class<InvalidAddress> createNewSUT() {
        return InvalidAddress.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link org.omg.CosNaming.NamingContextExtPackage.InvalidAddress#InvalidAddress() public
     * org.omg.CosNaming.NamingContextExtPackage.InvalidAddress()}.
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
    public void create_InvalidAddress()
    throws Exception {
        // create new instance
        final InvalidAddress sut = new InvalidAddress();
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link org.omg.CosNaming.NamingContextExtPackage.InvalidAddress#InvalidAddress(String) public
     * org.omg.CosNaming.NamingContextExtPackage.InvalidAddress(java.lang.String)}.
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
    public void create_InvalidAddress_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final InvalidAddress sut = null; // = new InvalidAddress(String);
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.CosNaming.NamingContextExtPackage.InvalidAddress]

}
