package org.j8unit.repository.java.awt;

import java.awt.AWTPermission;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link AWTPermission} (by simply reusing the
 * J8Unit test interface {@link AWTPermissionClassTests}).
 */

@RunWith(J8Unit4.class)
public class AWTPermissionClassTest
implements AWTPermissionClassTests<AWTPermission> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.awt.AWTPermission]

    @Override
    public Class<AWTPermission> createNewSUT() {
        return AWTPermission.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link java.awt.AWTPermission#AWTPermission(String)
     * public java.awt.AWTPermission(java.lang.String)}.
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
    public void create_AWTPermission_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final AWTPermission sut = null; // = new AWTPermission(String);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.awt.AWTPermission#AWTPermission(String, String) public
     * java.awt.AWTPermission(java.lang.String,java.lang.String)}.
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
    public void create_AWTPermission_String_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final AWTPermission sut = null; // = new AWTPermission(String, String);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.awt.AWTPermission]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.awt.AWTPermission]

}
