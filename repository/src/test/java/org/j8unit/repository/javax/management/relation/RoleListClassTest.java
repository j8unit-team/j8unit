package org.j8unit.repository.javax.management.relation;

import javax.management.relation.RoleList;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link RoleList} (by simply reusing the J8Unit
 * test interface {@link RoleListClassTests}).
 */

@RunWith(J8Unit4.class)
public class RoleListClassTest
implements RoleListClassTests<RoleList> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.management.relation.RoleList]

    @Override
    public Class<RoleList> createNewSUT() {
        return RoleList.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link javax.management.relation.RoleList#RoleList()
     * public javax.management.relation.RoleList()}.
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
    public void create_RoleList()
    throws Exception {
        // create new instance
        final RoleList sut = new RoleList();
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.management.relation.RoleList#RoleList(int) public javax.management.relation.RoleList(int)}.
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
    public void create_RoleList_int()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final RoleList sut = null; // = new RoleList(int);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.management.relation.RoleList#RoleList(java.util.List) public
     * javax.management.relation.RoleList(java.util.List<javax.management.relation.Role>) throws
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
    public void create_RoleList_List()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final RoleList sut = null; // = new RoleList(java.util.List);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.management.relation.RoleList]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.management.relation.RoleList]

}
