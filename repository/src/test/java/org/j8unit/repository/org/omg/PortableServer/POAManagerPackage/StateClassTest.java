package org.j8unit.repository.org.omg.PortableServer.POAManagerPackage;

import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.omg.PortableServer.POAManagerPackage.State;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link State} (by simply reusing the J8Unit test
 * interface {@link org.j8unit.repository.org.omg.PortableServer.POAManagerPackage.StateClassTests}).
 */
@RunWith(J8Unit4.class)
public class StateClassTest
implements StateClassTests<State> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.PortableServer.POAManagerPackage.State]

    @Override
    public Class<State> createNewSUT() {
        return State.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link org.omg.PortableServer.POAManagerPackage.State#from_int(int) public static
     * org.omg.PortableServer.POAManagerPackage.State org.omg.PortableServer.POAManagerPackage.State.from_int(int)}.
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
    public void test_from_int_int()
    throws Exception {
        // write some test for {@link org.omg.PortableServer.POAManagerPackage.State#from_int(int)}
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.omg.PortableServer.POAManagerPackage.State]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.PortableServer.POAManagerPackage.State]

}
