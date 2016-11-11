package org.j8unit.repository.org.omg.PortableServer;

import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.omg.PortableServer.ThreadPolicyValue;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link ThreadPolicyValue} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.org.omg.PortableServer.ThreadPolicyValueClassTests}).
 */

@RunWith(J8Unit4.class)
public class ThreadPolicyValueClassTest
implements ThreadPolicyValueClassTests<ThreadPolicyValue> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.PortableServer.ThreadPolicyValue]

    @Override
    public Class<ThreadPolicyValue> createNewSUT() {
        return ThreadPolicyValue.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link org.omg.PortableServer.ThreadPolicyValue#from_int(int) public static
     * org.omg.PortableServer.ThreadPolicyValue org.omg.PortableServer.ThreadPolicyValue.from_int(int)}.
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
        // write some test for {@link org.omg.PortableServer.ThreadPolicyValue#from_int(int)}
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.omg.PortableServer.ThreadPolicyValue]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.PortableServer.ThreadPolicyValue]

}
