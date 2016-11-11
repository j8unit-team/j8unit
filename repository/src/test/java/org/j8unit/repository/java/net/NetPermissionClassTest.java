package org.j8unit.repository.java.net;

import java.net.NetPermission;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link NetPermission} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.net.NetPermissionClassTests}).
 */

@RunWith(J8Unit4.class)
public class NetPermissionClassTest
implements NetPermissionClassTests<NetPermission> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.net.NetPermission]

    @Override
    public Class<NetPermission> createNewSUT() {
        return NetPermission.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link java.net.NetPermission#NetPermission(String)
     * public java.net.NetPermission(java.lang.String)}.
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
    public void create_NetPermission_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final NetPermission sut = null; // = new NetPermission(String);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.net.NetPermission#NetPermission(String, String) public
     * java.net.NetPermission(java.lang.String,java.lang.String)}.
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
    public void create_NetPermission_String_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final NetPermission sut = null; // = new NetPermission(String, String);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.net.NetPermission]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.net.NetPermission]

}
