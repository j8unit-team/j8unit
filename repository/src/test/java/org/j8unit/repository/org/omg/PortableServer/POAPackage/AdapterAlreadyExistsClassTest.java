package org.j8unit.repository.org.omg.PortableServer.POAPackage;

import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.omg.PortableServer.POAPackage.AdapterAlreadyExists;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link AdapterAlreadyExists} (by simply reusing
 * the J8Unit test interface {@link AdapterAlreadyExistsClassTests}).
 */

@RunWith(J8Unit4.class)
public class AdapterAlreadyExistsClassTest
implements AdapterAlreadyExistsClassTests<AdapterAlreadyExists> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.PortableServer.POAPackage.AdapterAlreadyExists]

    @Override
    public Class<AdapterAlreadyExists> createNewSUT() {
        return AdapterAlreadyExists.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link org.omg.PortableServer.POAPackage.AdapterAlreadyExists#AdapterAlreadyExists() public
     * org.omg.PortableServer.POAPackage.AdapterAlreadyExists()}.
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
    public void create_AdapterAlreadyExists()
    throws Exception {
        // create new instance
        final AdapterAlreadyExists sut = new AdapterAlreadyExists();
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link org.omg.PortableServer.POAPackage.AdapterAlreadyExists#AdapterAlreadyExists(String) public
     * org.omg.PortableServer.POAPackage.AdapterAlreadyExists(java.lang.String)}.
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
    public void create_AdapterAlreadyExists_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final AdapterAlreadyExists sut = null; // = new AdapterAlreadyExists(String);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.omg.PortableServer.POAPackage.AdapterAlreadyExists]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.PortableServer.POAPackage.AdapterAlreadyExists]

}
