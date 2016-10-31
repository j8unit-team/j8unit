package org.j8unit.repository.javax.management.relation;

import javax.management.relation.RoleStatus;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class RoleStatusClassTest
implements org.j8unit.repository.javax.management.relation.RoleStatusClassTests<RoleStatus> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.management.relation.RoleStatus]

    @Override
    public Class<RoleStatus> createNewSUT() {
        return RoleStatus.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.management.relation.RoleStatus#RoleStatus() public javax.management.relation.RoleStatus()}.
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
    public void create_RoleStatus()
    throws Exception {
        // create new instance
        final RoleStatus sut = new RoleStatus();
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link javax.management.relation.RoleStatus#isRoleStatus(int) public static boolean
     * javax.management.relation.RoleStatus.isRoleStatus(int)}.
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
    public void test_isRoleStatus_int()
    throws Exception {
        // write some test for {@link javax.management.relation.RoleStatus#isRoleStatus(int)}
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.management.relation.RoleStatus]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.management.relation.RoleStatus]

}
