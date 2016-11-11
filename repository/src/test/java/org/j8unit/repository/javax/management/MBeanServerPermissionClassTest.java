package org.j8unit.repository.javax.management;

import javax.management.MBeanServerPermission;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link MBeanServerPermission} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.javax.management.MBeanServerPermissionClassTests}).
 */

@RunWith(J8Unit4.class)
public class MBeanServerPermissionClassTest
implements MBeanServerPermissionClassTests<MBeanServerPermission> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.management.MBeanServerPermission]

    @Override
    public Class<MBeanServerPermission> createNewSUT() {
        return MBeanServerPermission.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.management.MBeanServerPermission#MBeanServerPermission(String) public
     * javax.management.MBeanServerPermission(java.lang.String)}.
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
    public void create_MBeanServerPermission_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final MBeanServerPermission sut = null; // = new MBeanServerPermission(String);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.management.MBeanServerPermission#MBeanServerPermission(String, String) public
     * javax.management.MBeanServerPermission(java.lang.String,java.lang.String)}.
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
    public void create_MBeanServerPermission_String_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final MBeanServerPermission sut = null; // = new MBeanServerPermission(String, String);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.management.MBeanServerPermission]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.management.MBeanServerPermission]

}
