package org.j8unit.repository.org.omg.PortableServer.POAPackage;

import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.omg.PortableServer.POAPackage.WrongAdapter;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link WrongAdapter} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.org.omg.PortableServer.POAPackage.WrongAdapterClassTests}).
 */
@RunWith(J8Unit4.class)
public class WrongAdapterClassTest
implements WrongAdapterClassTests<WrongAdapter> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.PortableServer.POAPackage.WrongAdapter]

    @Override
    public Class<WrongAdapter> createNewSUT() {
        return WrongAdapter.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link org.omg.PortableServer.POAPackage.WrongAdapter#WrongAdapter() public
     * org.omg.PortableServer.POAPackage.WrongAdapter()}.
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
    public void create_WrongAdapter()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final WrongAdapter sut = new WrongAdapter();
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link org.omg.PortableServer.POAPackage.WrongAdapter#WrongAdapter(String) public
     * org.omg.PortableServer.POAPackage.WrongAdapter(java.lang.String)}.
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
    public void create_WrongAdapter_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final WrongAdapter sut = null; // = new WrongAdapter(String);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.omg.PortableServer.POAPackage.WrongAdapter]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.PortableServer.POAPackage.WrongAdapter]

}
