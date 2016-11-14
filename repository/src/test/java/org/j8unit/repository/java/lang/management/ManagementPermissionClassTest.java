package org.j8unit.repository.java.lang.management;

import java.lang.management.ManagementPermission;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link ManagementPermission} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.java.lang.management.ManagementPermissionClassTests}).
 */

@RunWith(J8Unit4.class)
public class ManagementPermissionClassTest
implements ManagementPermissionClassTests<ManagementPermission> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.lang.management.ManagementPermission]

    @Override
    public Class<ManagementPermission> createNewSUT() {
        return ManagementPermission.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.lang.management.ManagementPermission#ManagementPermission(String) public
     * java.lang.management.ManagementPermission(java.lang.String)}.
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
    public void create_ManagementPermission_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final ManagementPermission sut = null; // = new ManagementPermission(String);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.lang.management.ManagementPermission#ManagementPermission(String, String) public
     * java.lang.management.ManagementPermission(java.lang.String,java.lang.String) throws
     * java.lang.IllegalArgumentException}.
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
    public void create_ManagementPermission_String_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final ManagementPermission sut = null; // = new ManagementPermission(String, String);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.lang.management.ManagementPermission]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.lang.management.ManagementPermission]

}
