package org.j8unit.repository.javax.management.relation;

import javax.management.relation.Role;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link Role} (by simply reusing the J8Unit test
 * interface {@link RoleClassTests}).
 */

@RunWith(J8Unit4.class)
public class RoleClassTest
implements RoleClassTests<Role> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.management.relation.Role]

    @Override
    public Class<Role> createNewSUT() {
        return Role.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.management.relation.Role#Role(String, java.util.List) public
     * javax.management.relation.Role(java.lang.String,java.util.List<javax.management.ObjectName>) throws
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
    public void create_Role_String_List()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final Role sut = null; // = new Role(String, java.util.List);
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link javax.management.relation.Role#roleValueToString(java.util.List) public static java.lang.String
     * javax.management.relation.Role.roleValueToString(java.util.List<javax.management.ObjectName>) throws
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
    public void test_roleValueToString_List()
    throws Exception {
        // write some test for {@link javax.management.relation.Role#roleValueToString(java.util.List)}
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.management.relation.Role]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.management.relation.Role]

}
