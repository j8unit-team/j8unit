package org.j8unit.repository.java.net;

import java.net.SocketPermission;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link SocketPermission} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.net.SocketPermissionClassTests}).
 */
@RunWith(J8Unit4.class)
public class SocketPermissionClassTest
implements SocketPermissionClassTests<SocketPermission> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.net.SocketPermission]

    @Override
    public Class<SocketPermission> createNewSUT() {
        return SocketPermission.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.net.SocketPermission#SocketPermission(String, String) public
     * java.net.SocketPermission(java.lang.String,java.lang.String)}.
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
    public void create_SocketPermission_String_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final SocketPermission sut = null; // = new SocketPermission(String, String);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.net.SocketPermission]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.net.SocketPermission]

}
