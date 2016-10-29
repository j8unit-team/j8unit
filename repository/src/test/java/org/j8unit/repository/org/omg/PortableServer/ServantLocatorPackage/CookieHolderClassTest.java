package org.j8unit.repository.org.omg.PortableServer.ServantLocatorPackage;

import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.omg.PortableServer.ServantLocatorPackage.CookieHolder;

@RunWith(J8Unit4.class)
public class CookieHolderClassTest
implements org.j8unit.repository.org.omg.PortableServer.ServantLocatorPackage.CookieHolderClassTests<CookieHolder> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.PortableServer.ServantLocatorPackage.CookieHolder]

    @Override
    public Class<CookieHolder> createNewSUT() {
        return CookieHolder.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link org.omg.PortableServer.ServantLocatorPackage.CookieHolder#CookieHolder(Object) public
     * org.omg.PortableServer.ServantLocatorPackage.CookieHolder(java.lang.Object)}.
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
    public void create_CookieHolder_Object()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final CookieHolder sut = null; // = new CookieHolder(Object);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link org.omg.PortableServer.ServantLocatorPackage.CookieHolder#CookieHolder() public
     * org.omg.PortableServer.ServantLocatorPackage.CookieHolder()}.
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
    public void create_CookieHolder()
    throws Exception {
        // create new instance
        final CookieHolder sut = new CookieHolder();
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.PortableServer.ServantLocatorPackage.CookieHolder]

}
