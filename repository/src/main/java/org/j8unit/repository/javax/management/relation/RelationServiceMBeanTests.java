package org.j8unit.repository.javax.management.relation;

import org.j8unit.*;
import org.j8unit.repository.categories.*;
import org.junit.*;
import org.junit.experimental.categories.Category;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import static org.junit.Assert.*;

/**
 * <p>
 * Test class for {@link javax.management.relation.RelationServiceMBean interface javax.management.relation.RelationServiceMBean},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.management.relation.RelationServiceMBeanClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface RelationServiceMBeanTests<SUT extends javax.management.relation.RelationServiceMBean>
extends J8UnitTest<SUT>
{

    /**
     * <p>
     * Test method for {@link javax.management.relation.RelationServiceMBean#findAssociatedMBeans(javax.management.ObjectName,java.lang.String,java.lang.String) public abstract java.util.Map javax.management.relation.RelationServiceMBean.findAssociatedMBeans(javax.management.ObjectName,java.lang.String,java.lang.String) throws java.lang.IllegalArgumentException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_findAssociatedMBeans_ObjectName_String_String() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.relation.RelationServiceMBean#checkRoleWriting(javax.management.relation.Role,java.lang.String,java.lang.Boolean) public abstract java.lang.Integer javax.management.relation.RelationServiceMBean.checkRoleWriting(javax.management.relation.Role,java.lang.String,java.lang.Boolean) throws java.lang.IllegalArgumentException,javax.management.relation.RelationTypeNotFoundException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_checkRoleWriting_Role_String_Boolean() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.relation.RelationServiceMBean#isRelationMBean(java.lang.String) public abstract javax.management.ObjectName javax.management.relation.RelationServiceMBean.isRelationMBean(java.lang.String) throws java.lang.IllegalArgumentException,javax.management.relation.RelationNotFoundException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_isRelationMBean_String() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.relation.RelationServiceMBean#updateRoleMap(java.lang.String,javax.management.relation.Role,java.util.List) public abstract void javax.management.relation.RelationServiceMBean.updateRoleMap(java.lang.String,javax.management.relation.Role,java.util.List) throws java.lang.IllegalArgumentException,javax.management.relation.RelationServiceNotRegisteredException,javax.management.relation.RelationNotFoundException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_updateRoleMap_String_Role_List() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.relation.RelationServiceMBean#getAllRelationTypeNames() public abstract java.util.List javax.management.relation.RelationServiceMBean.getAllRelationTypeNames()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getAllRelationTypeNames() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.relation.RelationServiceMBean#setRoles(java.lang.String,javax.management.relation.RoleList) public abstract javax.management.relation.RoleResult javax.management.relation.RelationServiceMBean.setRoles(java.lang.String,javax.management.relation.RoleList) throws javax.management.relation.RelationServiceNotRegisteredException,java.lang.IllegalArgumentException,javax.management.relation.RelationNotFoundException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setRoles_String_RoleList() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.relation.RelationServiceMBean#addRelation(javax.management.ObjectName) public abstract void javax.management.relation.RelationServiceMBean.addRelation(javax.management.ObjectName) throws java.lang.IllegalArgumentException,javax.management.relation.RelationServiceNotRegisteredException,java.lang.NoSuchMethodException,javax.management.relation.InvalidRelationIdException,javax.management.InstanceNotFoundException,javax.management.relation.InvalidRelationServiceException,javax.management.relation.RelationTypeNotFoundException,javax.management.relation.RoleNotFoundException,javax.management.relation.InvalidRoleValueException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_addRelation_ObjectName() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.relation.RelationServiceMBean#getRelationTypeName(java.lang.String) public abstract java.lang.String javax.management.relation.RelationServiceMBean.getRelationTypeName(java.lang.String) throws java.lang.IllegalArgumentException,javax.management.relation.RelationNotFoundException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getRelationTypeName_String() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.relation.RelationServiceMBean#getRoles(java.lang.String,java.lang.String[]) public abstract javax.management.relation.RoleResult javax.management.relation.RelationServiceMBean.getRoles(java.lang.String,java.lang.String[]) throws javax.management.relation.RelationServiceNotRegisteredException,java.lang.IllegalArgumentException,javax.management.relation.RelationNotFoundException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getRoles_String_StringArray() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.relation.RelationServiceMBean#addRelationType(javax.management.relation.RelationType) public abstract void javax.management.relation.RelationServiceMBean.addRelationType(javax.management.relation.RelationType) throws java.lang.IllegalArgumentException,javax.management.relation.InvalidRelationTypeException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_addRelationType_RelationType() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.relation.RelationServiceMBean#getPurgeFlag() public abstract boolean javax.management.relation.RelationServiceMBean.getPurgeFlag()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getPurgeFlag() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.relation.RelationServiceMBean#getAllRoles(java.lang.String) public abstract javax.management.relation.RoleResult javax.management.relation.RelationServiceMBean.getAllRoles(java.lang.String) throws java.lang.IllegalArgumentException,javax.management.relation.RelationNotFoundException,javax.management.relation.RelationServiceNotRegisteredException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getAllRoles_String() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.relation.RelationServiceMBean#getRoleInfos(java.lang.String) public abstract java.util.List javax.management.relation.RelationServiceMBean.getRoleInfos(java.lang.String) throws java.lang.IllegalArgumentException,javax.management.relation.RelationTypeNotFoundException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getRoleInfos_String() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.relation.RelationServiceMBean#sendRelationRemovalNotification(java.lang.String,java.util.List) public abstract void javax.management.relation.RelationServiceMBean.sendRelationRemovalNotification(java.lang.String,java.util.List) throws java.lang.IllegalArgumentException,javax.management.relation.RelationNotFoundException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_sendRelationRemovalNotification_String_List() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.relation.RelationServiceMBean#getRoleInfo(java.lang.String,java.lang.String) public abstract javax.management.relation.RoleInfo javax.management.relation.RelationServiceMBean.getRoleInfo(java.lang.String,java.lang.String) throws java.lang.IllegalArgumentException,javax.management.relation.RelationTypeNotFoundException,javax.management.relation.RoleInfoNotFoundException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getRoleInfo_String_String() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.relation.RelationServiceMBean#removeRelation(java.lang.String) public abstract void javax.management.relation.RelationServiceMBean.removeRelation(java.lang.String) throws javax.management.relation.RelationServiceNotRegisteredException,java.lang.IllegalArgumentException,javax.management.relation.RelationNotFoundException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_removeRelation_String() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.relation.RelationServiceMBean#isActive() public abstract void javax.management.relation.RelationServiceMBean.isActive() throws javax.management.relation.RelationServiceNotRegisteredException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_isActive() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.relation.RelationServiceMBean#purgeRelations() public abstract void javax.management.relation.RelationServiceMBean.purgeRelations() throws javax.management.relation.RelationServiceNotRegisteredException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_purgeRelations() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.relation.RelationServiceMBean#findRelationsOfType(java.lang.String) public abstract java.util.List javax.management.relation.RelationServiceMBean.findRelationsOfType(java.lang.String) throws java.lang.IllegalArgumentException,javax.management.relation.RelationTypeNotFoundException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_findRelationsOfType_String() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.relation.RelationServiceMBean#removeRelationType(java.lang.String) public abstract void javax.management.relation.RelationServiceMBean.removeRelationType(java.lang.String) throws javax.management.relation.RelationServiceNotRegisteredException,java.lang.IllegalArgumentException,javax.management.relation.RelationTypeNotFoundException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_removeRelationType_String() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.relation.RelationServiceMBean#setRole(java.lang.String,javax.management.relation.Role) public abstract void javax.management.relation.RelationServiceMBean.setRole(java.lang.String,javax.management.relation.Role) throws javax.management.relation.RelationServiceNotRegisteredException,java.lang.IllegalArgumentException,javax.management.relation.RelationNotFoundException,javax.management.relation.RoleNotFoundException,javax.management.relation.InvalidRoleValueException,javax.management.relation.RelationTypeNotFoundException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setRole_String_Role() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.relation.RelationServiceMBean#sendRelationCreationNotification(java.lang.String) public abstract void javax.management.relation.RelationServiceMBean.sendRelationCreationNotification(java.lang.String) throws java.lang.IllegalArgumentException,javax.management.relation.RelationNotFoundException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_sendRelationCreationNotification_String() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.relation.RelationServiceMBean#hasRelation(java.lang.String) public abstract java.lang.Boolean javax.management.relation.RelationServiceMBean.hasRelation(java.lang.String) throws java.lang.IllegalArgumentException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_hasRelation_String() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.relation.RelationServiceMBean#setPurgeFlag(boolean) public abstract void javax.management.relation.RelationServiceMBean.setPurgeFlag(boolean)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setPurgeFlag_boolean() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.relation.RelationServiceMBean#getReferencedMBeans(java.lang.String) public abstract java.util.Map javax.management.relation.RelationServiceMBean.getReferencedMBeans(java.lang.String) throws java.lang.IllegalArgumentException,javax.management.relation.RelationNotFoundException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getReferencedMBeans_String() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.relation.RelationServiceMBean#createRelationType(java.lang.String,javax.management.relation.RoleInfo[]) public abstract void javax.management.relation.RelationServiceMBean.createRelationType(java.lang.String,javax.management.relation.RoleInfo[]) throws java.lang.IllegalArgumentException,javax.management.relation.InvalidRelationTypeException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_createRelationType_String_RoleInfoArray() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.relation.RelationServiceMBean#findReferencingRelations(javax.management.ObjectName,java.lang.String,java.lang.String) public abstract java.util.Map javax.management.relation.RelationServiceMBean.findReferencingRelations(javax.management.ObjectName,java.lang.String,java.lang.String) throws java.lang.IllegalArgumentException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_findReferencingRelations_ObjectName_String_String() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.relation.RelationServiceMBean#getAllRelationIds() public abstract java.util.List javax.management.relation.RelationServiceMBean.getAllRelationIds()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getAllRelationIds() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.relation.RelationServiceMBean#sendRoleUpdateNotification(java.lang.String,javax.management.relation.Role,java.util.List) public abstract void javax.management.relation.RelationServiceMBean.sendRoleUpdateNotification(java.lang.String,javax.management.relation.Role,java.util.List) throws java.lang.IllegalArgumentException,javax.management.relation.RelationNotFoundException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_sendRoleUpdateNotification_String_Role_List() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.relation.RelationServiceMBean#createRelation(java.lang.String,java.lang.String,javax.management.relation.RoleList) public abstract void javax.management.relation.RelationServiceMBean.createRelation(java.lang.String,java.lang.String,javax.management.relation.RoleList) throws javax.management.relation.RelationServiceNotRegisteredException,java.lang.IllegalArgumentException,javax.management.relation.RoleNotFoundException,javax.management.relation.InvalidRelationIdException,javax.management.relation.RelationTypeNotFoundException,javax.management.relation.InvalidRoleValueException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_createRelation_String_String_RoleList() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.relation.RelationServiceMBean#getRole(java.lang.String,java.lang.String) public abstract java.util.List javax.management.relation.RelationServiceMBean.getRole(java.lang.String,java.lang.String) throws javax.management.relation.RelationServiceNotRegisteredException,java.lang.IllegalArgumentException,javax.management.relation.RelationNotFoundException,javax.management.relation.RoleNotFoundException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getRole_String_String() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.relation.RelationServiceMBean#getRoleCardinality(java.lang.String,java.lang.String) public abstract java.lang.Integer javax.management.relation.RelationServiceMBean.getRoleCardinality(java.lang.String,java.lang.String) throws java.lang.IllegalArgumentException,javax.management.relation.RelationNotFoundException,javax.management.relation.RoleNotFoundException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getRoleCardinality_String_String() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.relation.RelationServiceMBean#checkRoleReading(java.lang.String,java.lang.String) public abstract java.lang.Integer javax.management.relation.RelationServiceMBean.checkRoleReading(java.lang.String,java.lang.String) throws java.lang.IllegalArgumentException,javax.management.relation.RelationTypeNotFoundException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_checkRoleReading_String_String() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.relation.RelationServiceMBean#isRelation(javax.management.ObjectName) public abstract java.lang.String javax.management.relation.RelationServiceMBean.isRelation(javax.management.ObjectName) throws java.lang.IllegalArgumentException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_isRelation_ObjectName() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
