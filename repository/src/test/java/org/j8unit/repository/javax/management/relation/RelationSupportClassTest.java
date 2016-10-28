package org.j8unit.repository.javax.management.relation;

import javax.management.MBeanServer;
import javax.management.ObjectName;
import javax.management.relation.RelationSupport;
import javax.management.relation.RoleList;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class RelationSupportClassTest
implements org.j8unit.repository.javax.management.relation.RelationSupportClassTests<RelationSupport> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.management.relation.RelationSupport]

    @Override
    public Class<RelationSupport> createNewSUT() {
        return RelationSupport.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link RelationSupport#RelationSupport(String, ObjectName, String, RoleList) public
     * javax.management.relation.RelationSupport(java.lang.String,javax.management.ObjectName,java.lang.String,javax.management.relation.RoleList)
     * throws javax.management.relation.InvalidRoleValueException,java.lang.IllegalArgumentException}.
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
    public void create_RelationSupport_String_ObjectName_String_RoleList()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final RelationSupport sut = null; // = new RelationSupport(String, ObjectName, String, RoleList);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link RelationSupport#RelationSupport(String, ObjectName, MBeanServer, String, RoleList) public
     * javax.management.relation.RelationSupport(java.lang.String,javax.management.ObjectName,javax.management.MBeanServer,java.lang.String,javax.management.relation.RoleList)
     * throws javax.management.relation.InvalidRoleValueException,java.lang.IllegalArgumentException}.
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
    public void create_RelationSupport_String_ObjectName_MBeanServer_String_RoleList()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final RelationSupport sut = null; // = new RelationSupport(String, ObjectName, MBeanServer, String, RoleList);
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.management.relation.RelationSupport]

}
