package org.j8unit.repository.javax.management;

import javax.management.MBeanPermission;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class MBeanPermissionClassTest
implements org.j8unit.repository.javax.management.MBeanPermissionClassTests<MBeanPermission> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.management.MBeanPermission]

    @Override
    public Class<MBeanPermission> createNewSUT() {
        return MBeanPermission.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.management.MBeanPermission#MBeanPermission(String, String, javax.management.ObjectName, String)
     * public
     * javax.management.MBeanPermission(java.lang.String,java.lang.String,javax.management.ObjectName,java.lang.String)}.
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
    public void create_MBeanPermission_String_String_ObjectName_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final MBeanPermission sut = null; // = new MBeanPermission(String, String, javax.management.ObjectName, String);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.management.MBeanPermission#MBeanPermission(String, String) public
     * javax.management.MBeanPermission(java.lang.String,java.lang.String)}.
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
    public void create_MBeanPermission_String_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final MBeanPermission sut = null; // = new MBeanPermission(String, String);
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.management.MBeanPermission]

}
