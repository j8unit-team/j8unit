package org.j8unit.repository.org.omg.PortableServer.POAManagerPackage;

import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.omg.PortableServer.POAManagerPackage.AdapterInactive;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link AdapterInactive} (by simply reusing the
 * J8Unit test interface
 * {@link org.j8unit.repository.org.omg.PortableServer.POAManagerPackage.AdapterInactiveClassTests}).
 */

@RunWith(J8Unit4.class)
public class AdapterInactiveClassTest
implements AdapterInactiveClassTests<AdapterInactive> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.PortableServer.POAManagerPackage.AdapterInactive]

    @Override
    public Class<AdapterInactive> createNewSUT() {
        return AdapterInactive.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link org.omg.PortableServer.POAManagerPackage.AdapterInactive#AdapterInactive() public
     * org.omg.PortableServer.POAManagerPackage.AdapterInactive()}.
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
    public void create_AdapterInactive()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final AdapterInactive sut = new AdapterInactive();
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link org.omg.PortableServer.POAManagerPackage.AdapterInactive#AdapterInactive(String) public
     * org.omg.PortableServer.POAManagerPackage.AdapterInactive(java.lang.String)}.
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
    public void create_AdapterInactive_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final AdapterInactive sut = null; // = new AdapterInactive(String);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.omg.PortableServer.POAManagerPackage.AdapterInactive]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.PortableServer.POAManagerPackage.AdapterInactive]

}
