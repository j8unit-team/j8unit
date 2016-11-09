package org.j8unit.repository.javax.management.relation;

import javax.management.relation.RoleInfo;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link RoleInfo} (by simply reusing the J8Unit
 * test interface {@link RoleInfoClassTests}).
 */

@RunWith(J8Unit4.class)
public class RoleInfoClassTest
implements RoleInfoClassTests<RoleInfo> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.management.relation.RoleInfo]

    @Override
    public Class<RoleInfo> createNewSUT() {
        return RoleInfo.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.management.relation.RoleInfo#RoleInfo(String, String, boolean, boolean, int, int, String) public
     * javax.management.relation.RoleInfo(java.lang.String,java.lang.String,boolean,boolean,int,int,java.lang.String)
     * throws
     * java.lang.IllegalArgumentException,javax.management.relation.InvalidRoleInfoException,java.lang.ClassNotFoundException,javax.management.NotCompliantMBeanException}.
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
    public void create_RoleInfo_String_String_boolean_boolean_int_int_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final RoleInfo sut = null; // = new RoleInfo(String, String, boolean, boolean, int, int, String);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.management.relation.RoleInfo#RoleInfo(String, String) public
     * javax.management.relation.RoleInfo(java.lang.String,java.lang.String) throws
     * java.lang.IllegalArgumentException,java.lang.ClassNotFoundException,javax.management.NotCompliantMBeanException}.
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
    public void create_RoleInfo_String_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final RoleInfo sut = null; // = new RoleInfo(String, String);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.management.relation.RoleInfo#RoleInfo(javax.management.relation.RoleInfo) public
     * javax.management.relation.RoleInfo(javax.management.relation.RoleInfo) throws
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
    public void create_RoleInfo_RoleInfo()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final RoleInfo sut = null; // = new RoleInfo(javax.management.relation.RoleInfo);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.management.relation.RoleInfo#RoleInfo(String, String, boolean, boolean) public
     * javax.management.relation.RoleInfo(java.lang.String,java.lang.String,boolean,boolean) throws
     * java.lang.IllegalArgumentException,java.lang.ClassNotFoundException,javax.management.NotCompliantMBeanException}.
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
    public void create_RoleInfo_String_String_boolean_boolean()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final RoleInfo sut = null; // = new RoleInfo(String, String, boolean, boolean);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.management.relation.RoleInfo]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.management.relation.RoleInfo]

}
