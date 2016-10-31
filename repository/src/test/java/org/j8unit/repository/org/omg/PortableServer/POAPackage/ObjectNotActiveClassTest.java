package org.j8unit.repository.org.omg.PortableServer.POAPackage;

import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.omg.PortableServer.POAPackage.ObjectNotActive;

@RunWith(J8Unit4.class)
public class ObjectNotActiveClassTest
implements org.j8unit.repository.org.omg.PortableServer.POAPackage.ObjectNotActiveClassTests<ObjectNotActive> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.PortableServer.POAPackage.ObjectNotActive]

    @Override
    public Class<ObjectNotActive> createNewSUT() {
        return ObjectNotActive.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link org.omg.PortableServer.POAPackage.ObjectNotActive#ObjectNotActive() public
     * org.omg.PortableServer.POAPackage.ObjectNotActive()}.
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
    public void create_ObjectNotActive()
    throws Exception {
        // create new instance
        final ObjectNotActive sut = new ObjectNotActive();
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link org.omg.PortableServer.POAPackage.ObjectNotActive#ObjectNotActive(String) public
     * org.omg.PortableServer.POAPackage.ObjectNotActive(java.lang.String)}.
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
    public void create_ObjectNotActive_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final ObjectNotActive sut = null; // = new ObjectNotActive(String);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.omg.PortableServer.POAPackage.ObjectNotActive]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.PortableServer.POAPackage.ObjectNotActive]

}
