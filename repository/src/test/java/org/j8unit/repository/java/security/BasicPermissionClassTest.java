package org.j8unit.repository.java.security;

import static org.junit.Assert.fail;
import java.security.BasicPermission;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link BasicPermission} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.security.BasicPermissionClassTests}).
 */

@RunWith(J8Unit4.class)
public class BasicPermissionClassTest
implements BasicPermissionClassTests<BasicPermission> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.security.BasicPermission]

    @Override
    public Class<BasicPermission> createNewSUT() {
        return BasicPermission.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.security.BasicPermission#BasicPermission(String, String) public
     * java.security.BasicPermission(java.lang.String,java.lang.String)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("Cannot construct an abstract class!")
    @Test
    @Category(Draft.class)
    public void create_BasicPermission_String_String()
    throws Exception {
        fail("Cannot construct an abstract class!");
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.security.BasicPermission#BasicPermission(String) public
     * java.security.BasicPermission(java.lang.String)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("Cannot construct an abstract class!")
    @Test
    @Category(Draft.class)
    public void create_BasicPermission_String()
    throws Exception {
        Assert.fail("Cannot construct an abstract class!");
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.security.BasicPermission]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.security.BasicPermission]

}
