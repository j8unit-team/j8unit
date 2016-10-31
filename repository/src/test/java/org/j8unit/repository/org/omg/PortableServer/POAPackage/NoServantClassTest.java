package org.j8unit.repository.org.omg.PortableServer.POAPackage;

import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.omg.PortableServer.POAPackage.NoServant;

@RunWith(J8Unit4.class)
public class NoServantClassTest
implements org.j8unit.repository.org.omg.PortableServer.POAPackage.NoServantClassTests<NoServant> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.PortableServer.POAPackage.NoServant]

    @Override
    public Class<NoServant> createNewSUT() {
        return NoServant.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link org.omg.PortableServer.POAPackage.NoServant#NoServant() public
     * org.omg.PortableServer.POAPackage.NoServant()}.
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
    public void create_NoServant()
    throws Exception {
        // create new instance
        final NoServant sut = new NoServant();
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link org.omg.PortableServer.POAPackage.NoServant#NoServant(String) public
     * org.omg.PortableServer.POAPackage.NoServant(java.lang.String)}.
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
    public void create_NoServant_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final NoServant sut = null; // = new NoServant(String);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.omg.PortableServer.POAPackage.NoServant]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.PortableServer.POAPackage.NoServant]

}
