package org.j8unit.repository.javax.management.relation;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.management.relation.RelationService class
 * javax.management.relation.RelationService}. The complementary j8unit test interface containing the class relevant
 * aspects is {@link RelationServiceClassTests}.
 * </p>
 *
 * @see javax.management.relation.RelationService class javax.management.relation.RelationService (the hereby targeted
 *      class-under-test class)
 * @see RelationServiceClassTests RelationServiceClassTests (the complementary j8unit test interface containing the
 *      class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface RelationServiceTests<SUT extends javax.management.relation.RelationService>
extends RelationServiceMBeanTests<SUT>, org.j8unit.repository.javax.management.MBeanRegistrationTests<SUT>,
org.j8unit.repository.javax.management.NotificationListenerTests<SUT>, org.j8unit.repository.javax.management.NotificationBroadcasterSupportTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.management.relation.RelationService#isRelation(javax.management.ObjectName) public
     * java.lang.String javax.management.relation.RelationService.isRelation(javax.management.ObjectName) throws
     * java.lang.IllegalArgumentException}.
     *
     * <p>
     * Test method for {@link javax.management.relation.RelationService#isRelation(javax.management.ObjectName) public
     * java.lang.String javax.management.relation.RelationService.isRelation(javax.management.ObjectName) throws
     * java.lang.IllegalArgumentException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.relation.RelationService#isRelation(javax.management.ObjectName) public java.lang.String
     *      javax.management.relation.RelationService.isRelation(javax.management.ObjectName) throws
     *      java.lang.IllegalArgumentException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_isRelation_ObjectName()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.management.relation.RelationService#createRelation(String, String, javax.management.relation.RoleList)
     * public void
     * javax.management.relation.RelationService.createRelation(java.lang.String,java.lang.String,javax.management.relation.RoleList)
     * throws
     * javax.management.relation.RelationServiceNotRegisteredException,java.lang.IllegalArgumentException,javax.management.relation.RoleNotFoundException,javax.management.relation.InvalidRelationIdException,javax.management.relation.RelationTypeNotFoundException,javax.management.relation.InvalidRoleValueException}
     * .
     *
     * <p>
     * Test method for
     * {@link javax.management.relation.RelationService#createRelation(String, String, javax.management.relation.RoleList)
     * public void
     * javax.management.relation.RelationService.createRelation(java.lang.String,java.lang.String,javax.management.relation.RoleList)
     * throws
     * javax.management.relation.RelationServiceNotRegisteredException,java.lang.IllegalArgumentException,javax.management.relation.RoleNotFoundException,javax.management.relation.InvalidRelationIdException,javax.management.relation.RelationTypeNotFoundException,javax.management.relation.InvalidRoleValueException}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.relation.RelationService#createRelation(String, String, javax.management.relation.RoleList)
     *      public void
     *      javax.management.relation.RelationService.createRelation(java.lang.String,java.lang.String,javax.management.
     *      relation.RoleList) throws
     *      javax.management.relation.RelationServiceNotRegisteredException,java.lang.IllegalArgumentException,javax.
     *      management.relation.RoleNotFoundException,javax.management.relation.InvalidRelationIdException,javax.
     *      management.relation.RelationTypeNotFoundException,javax.management.relation.InvalidRoleValueException (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_createRelation_String_String_RoleList()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.relation.RelationService#getRole(String, String) public java.util.List
     * <javax.management.ObjectName>
     * javax.management.relation.RelationService.getRole(java.lang.String,java.lang.String) throws
     * javax.management.relation.RelationServiceNotRegisteredException,java.lang.IllegalArgumentException,javax.management.relation.RelationNotFoundException,javax.management.relation.RoleNotFoundException}
     * .
     *
     * <p>
     * Test method for {@link javax.management.relation.RelationService#getRole(String, String) public java.util.List
     * javax.management.relation.RelationService.getRole(java.lang.String,java.lang.String) throws
     * javax.management.relation.RelationServiceNotRegisteredException,java.lang.IllegalArgumentException,javax.management.relation.RelationNotFoundException,javax.management.relation.RoleNotFoundException}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.relation.RelationService#getRole(String, String) public java.util.List
     *      javax.management.relation.RelationService.getRole(java.lang.String,java.lang.String) throws
     *      javax.management.relation.RelationServiceNotRegisteredException,java.lang.IllegalArgumentException,javax.
     *      management.relation.RelationNotFoundException,javax.management.relation.RoleNotFoundException (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getRole_String_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.relation.RelationService#getRoleCardinality(String, String) public
     * java.lang.Integer javax.management.relation.RelationService.getRoleCardinality(java.lang.String,java.lang.String)
     * throws
     * java.lang.IllegalArgumentException,javax.management.relation.RelationNotFoundException,javax.management.relation.RoleNotFoundException}
     * .
     *
     * <p>
     * Test method for {@link javax.management.relation.RelationService#getRoleCardinality(String, String) public
     * java.lang.Integer javax.management.relation.RelationService.getRoleCardinality(java.lang.String,java.lang.String)
     * throws
     * java.lang.IllegalArgumentException,javax.management.relation.RelationNotFoundException,javax.management.relation.RoleNotFoundException}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.relation.RelationService#getRoleCardinality(String, String) public java.lang.Integer
     *      javax.management.relation.RelationService.getRoleCardinality(java.lang.String,java.lang.String) throws
     *      java.lang.IllegalArgumentException,javax.management.relation.RelationNotFoundException,javax.management.
     *      relation.RoleNotFoundException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getRoleCardinality_String_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.relation.RelationService#checkRoleReading(String, String) public
     * java.lang.Integer javax.management.relation.RelationService.checkRoleReading(java.lang.String,java.lang.String)
     * throws java.lang.IllegalArgumentException,javax.management.relation.RelationTypeNotFoundException}.
     *
     * <p>
     * Test method for {@link javax.management.relation.RelationService#checkRoleReading(String, String) public
     * java.lang.Integer javax.management.relation.RelationService.checkRoleReading(java.lang.String,java.lang.String)
     * throws java.lang.IllegalArgumentException,javax.management.relation.RelationTypeNotFoundException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.relation.RelationService#checkRoleReading(String, String) public java.lang.Integer
     *      javax.management.relation.RelationService.checkRoleReading(java.lang.String,java.lang.String) throws
     *      java.lang.IllegalArgumentException,javax.management.relation.RelationTypeNotFoundException (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_checkRoleReading_String_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.relation.RelationService#getAllRelationIds() public java.util.List
     * <java.lang.String> javax.management.relation.RelationService.getAllRelationIds()}.
     *
     * <p>
     * Test method for {@link javax.management.relation.RelationService#getAllRelationIds() public java.util.List
     * javax.management.relation.RelationService.getAllRelationIds()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.relation.RelationService#getAllRelationIds() public java.util.List
     *      javax.management.relation.RelationService.getAllRelationIds() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getAllRelationIds()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.management.relation.RelationService#sendRoleUpdateNotification(String, javax.management.relation.Role, java.util.List)
     * public void
     * javax.management.relation.RelationService.sendRoleUpdateNotification(java.lang.String,javax.management.relation.Role,java.util.List
     * <javax.management.ObjectName>) throws
     * java.lang.IllegalArgumentException,javax.management.relation.RelationNotFoundException}.
     *
     * <p>
     * Test method for
     * {@link javax.management.relation.RelationService#sendRoleUpdateNotification(String, javax.management.relation.Role, java.util.List)
     * public void
     * javax.management.relation.RelationService.sendRoleUpdateNotification(java.lang.String,javax.management.relation.Role,java.util.List)
     * throws java.lang.IllegalArgumentException,javax.management.relation.RelationNotFoundException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.relation.RelationService#sendRoleUpdateNotification(String, javax.management.relation.Role,
     *      java.util.List) public void
     *      javax.management.relation.RelationService.sendRoleUpdateNotification(java.lang.String,javax.management.
     *      relation.Role,java.util.List) throws
     *      java.lang.IllegalArgumentException,javax.management.relation.RelationNotFoundException (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_sendRoleUpdateNotification_String_Role_List()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.relation.RelationService#preDeregister() public void
     * javax.management.relation.RelationService.preDeregister() throws java.lang.Exception}.
     *
     * <p>
     * Test method for {@link javax.management.relation.RelationService#preDeregister() public void
     * javax.management.relation.RelationService.preDeregister() throws java.lang.Exception}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.relation.RelationService#preDeregister() public void
     *      javax.management.relation.RelationService.preDeregister() throws java.lang.Exception (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_preDeregister()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.relation.RelationService#setPurgeFlag(boolean) public void
     * javax.management.relation.RelationService.setPurgeFlag(boolean)}.
     *
     * <p>
     * Test method for {@link javax.management.relation.RelationService#setPurgeFlag(boolean) public void
     * javax.management.relation.RelationService.setPurgeFlag(boolean)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.relation.RelationService#setPurgeFlag(boolean) public void
     *      javax.management.relation.RelationService.setPurgeFlag(boolean) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_setPurgeFlag_boolean()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.relation.RelationService#getReferencedMBeans(String) public
     * java.util.Map<javax.management.ObjectName, java.util.List<java.lang.String>>
     * javax.management.relation.RelationService.getReferencedMBeans(java.lang.String) throws
     * java.lang.IllegalArgumentException,javax.management.relation.RelationNotFoundException}.
     *
     * <p>
     * Test method for {@link javax.management.relation.RelationService#getReferencedMBeans(String) public java.util.Map
     * javax.management.relation.RelationService.getReferencedMBeans(java.lang.String) throws
     * java.lang.IllegalArgumentException,javax.management.relation.RelationNotFoundException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.relation.RelationService#getReferencedMBeans(String) public java.util.Map
     *      javax.management.relation.RelationService.getReferencedMBeans(java.lang.String) throws
     *      java.lang.IllegalArgumentException,javax.management.relation.RelationNotFoundException (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getReferencedMBeans_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.management.relation.RelationService#createRelationType(String, javax.management.relation.RoleInfo[])
     * public void
     * javax.management.relation.RelationService.createRelationType(java.lang.String,javax.management.relation.RoleInfo[])
     * throws java.lang.IllegalArgumentException,javax.management.relation.InvalidRelationTypeException}.
     *
     * <p>
     * Test method for
     * {@link javax.management.relation.RelationService#createRelationType(String, javax.management.relation.RoleInfo[])
     * public void
     * javax.management.relation.RelationService.createRelationType(java.lang.String,javax.management.relation.RoleInfo[])
     * throws java.lang.IllegalArgumentException,javax.management.relation.InvalidRelationTypeException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.relation.RelationService#createRelationType(String, javax.management.relation.RoleInfo[])
     *      public void
     *      javax.management.relation.RelationService.createRelationType(java.lang.String,javax.management.relation.
     *      RoleInfo[]) throws java.lang.IllegalArgumentException,javax.management.relation.InvalidRelationTypeException
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_createRelationType_String_RoleInfoArray()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.management.relation.RelationService#findReferencingRelations(javax.management.ObjectName, String, String)
     * public java.util.Map<java.lang.String, java.util.List<java.lang.String>>
     * javax.management.relation.RelationService.findReferencingRelations(javax.management.ObjectName,java.lang.String,java.lang.String)
     * throws java.lang.IllegalArgumentException}.
     *
     * <p>
     * Test method for
     * {@link javax.management.relation.RelationService#findReferencingRelations(javax.management.ObjectName, String, String)
     * public java.util.Map
     * javax.management.relation.RelationService.findReferencingRelations(javax.management.ObjectName,java.lang.String,java.lang.String)
     * throws java.lang.IllegalArgumentException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.relation.RelationService#findReferencingRelations(javax.management.ObjectName, String,
     *      String) public java.util.Map
     *      javax.management.relation.RelationService.findReferencingRelations(javax.management.ObjectName,java.lang.
     *      String,java.lang.String) throws java.lang.IllegalArgumentException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_findReferencingRelations_ObjectName_String_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.relation.RelationService#sendRelationCreationNotification(String) public
     * void javax.management.relation.RelationService.sendRelationCreationNotification(java.lang.String) throws
     * java.lang.IllegalArgumentException,javax.management.relation.RelationNotFoundException}.
     *
     * <p>
     * Test method for {@link javax.management.relation.RelationService#sendRelationCreationNotification(String) public
     * void javax.management.relation.RelationService.sendRelationCreationNotification(java.lang.String) throws
     * java.lang.IllegalArgumentException,javax.management.relation.RelationNotFoundException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.relation.RelationService#sendRelationCreationNotification(String) public void
     *      javax.management.relation.RelationService.sendRelationCreationNotification(java.lang.String) throws
     *      java.lang.IllegalArgumentException,javax.management.relation.RelationNotFoundException (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_sendRelationCreationNotification_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.management.relation.RelationService#handleNotification(javax.management.Notification, Object) public
     * void
     * javax.management.relation.RelationService.handleNotification(javax.management.Notification,java.lang.Object)}.
     *
     * <p>
     * Test method for
     * {@link javax.management.relation.RelationService#handleNotification(javax.management.Notification, Object) public
     * void
     * javax.management.relation.RelationService.handleNotification(javax.management.Notification,java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.relation.RelationService#handleNotification(javax.management.Notification, Object) public
     *      void
     *      javax.management.relation.RelationService.handleNotification(javax.management.Notification,java.lang.Object)
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_handleNotification_Notification_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.relation.RelationService#hasRelation(String) public java.lang.Boolean
     * javax.management.relation.RelationService.hasRelation(java.lang.String) throws
     * java.lang.IllegalArgumentException}.
     *
     * <p>
     * Test method for {@link javax.management.relation.RelationService#hasRelation(String) public java.lang.Boolean
     * javax.management.relation.RelationService.hasRelation(java.lang.String) throws
     * java.lang.IllegalArgumentException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.relation.RelationService#hasRelation(String) public java.lang.Boolean
     *      javax.management.relation.RelationService.hasRelation(java.lang.String) throws
     *      java.lang.IllegalArgumentException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_hasRelation_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.relation.RelationService#postRegister(Boolean) public void
     * javax.management.relation.RelationService.postRegister(java.lang.Boolean)}.
     *
     * <p>
     * Test method for {@link javax.management.relation.RelationService#postRegister(Boolean) public void
     * javax.management.relation.RelationService.postRegister(java.lang.Boolean)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.relation.RelationService#postRegister(Boolean) public void
     *      javax.management.relation.RelationService.postRegister(java.lang.Boolean) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_postRegister_Boolean()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.relation.RelationService#setRole(String, javax.management.relation.Role)
     * public void javax.management.relation.RelationService.setRole(java.lang.String,javax.management.relation.Role)
     * throws
     * javax.management.relation.RelationServiceNotRegisteredException,java.lang.IllegalArgumentException,javax.management.relation.RelationNotFoundException,javax.management.relation.RoleNotFoundException,javax.management.relation.InvalidRoleValueException}
     * .
     *
     * <p>
     * Test method for {@link javax.management.relation.RelationService#setRole(String, javax.management.relation.Role)
     * public void javax.management.relation.RelationService.setRole(java.lang.String,javax.management.relation.Role)
     * throws
     * javax.management.relation.RelationServiceNotRegisteredException,java.lang.IllegalArgumentException,javax.management.relation.RelationNotFoundException,javax.management.relation.RoleNotFoundException,javax.management.relation.InvalidRoleValueException}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.relation.RelationService#setRole(String, javax.management.relation.Role) public void
     *      javax.management.relation.RelationService.setRole(java.lang.String,javax.management.relation.Role) throws
     *      javax.management.relation.RelationServiceNotRegisteredException,java.lang.IllegalArgumentException,javax.
     *      management.relation.RelationNotFoundException,javax.management.relation.RoleNotFoundException,javax.
     *      management.relation.InvalidRoleValueException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_setRole_String_Role()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.relation.RelationService#findRelationsOfType(String) public
     * java.util.List<java.lang.String> javax.management.relation.RelationService.findRelationsOfType(java.lang.String)
     * throws java.lang.IllegalArgumentException,javax.management.relation.RelationTypeNotFoundException}.
     *
     * <p>
     * Test method for {@link javax.management.relation.RelationService#findRelationsOfType(String) public
     * java.util.List javax.management.relation.RelationService.findRelationsOfType(java.lang.String) throws
     * java.lang.IllegalArgumentException,javax.management.relation.RelationTypeNotFoundException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.relation.RelationService#findRelationsOfType(String) public java.util.List
     *      javax.management.relation.RelationService.findRelationsOfType(java.lang.String) throws
     *      java.lang.IllegalArgumentException,javax.management.relation.RelationTypeNotFoundException (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_findRelationsOfType_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.relation.RelationService#removeRelationType(String) public void
     * javax.management.relation.RelationService.removeRelationType(java.lang.String) throws
     * javax.management.relation.RelationServiceNotRegisteredException,java.lang.IllegalArgumentException,javax.management.relation.RelationTypeNotFoundException}
     * .
     *
     * <p>
     * Test method for {@link javax.management.relation.RelationService#removeRelationType(String) public void
     * javax.management.relation.RelationService.removeRelationType(java.lang.String) throws
     * javax.management.relation.RelationServiceNotRegisteredException,java.lang.IllegalArgumentException,javax.management.relation.RelationTypeNotFoundException}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.relation.RelationService#removeRelationType(String) public void
     *      javax.management.relation.RelationService.removeRelationType(java.lang.String) throws
     *      javax.management.relation.RelationServiceNotRegisteredException,java.lang.IllegalArgumentException,javax.
     *      management.relation.RelationTypeNotFoundException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_removeRelationType_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.relation.RelationService#isActive() public void
     * javax.management.relation.RelationService.isActive() throws
     * javax.management.relation.RelationServiceNotRegisteredException}.
     *
     * <p>
     * Test method for {@link javax.management.relation.RelationService#isActive() public void
     * javax.management.relation.RelationService.isActive() throws
     * javax.management.relation.RelationServiceNotRegisteredException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.relation.RelationService#isActive() public void
     *      javax.management.relation.RelationService.isActive() throws
     *      javax.management.relation.RelationServiceNotRegisteredException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_isActive()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.relation.RelationService#purgeRelations() public void
     * javax.management.relation.RelationService.purgeRelations() throws
     * javax.management.relation.RelationServiceNotRegisteredException}.
     *
     * <p>
     * Test method for {@link javax.management.relation.RelationService#purgeRelations() public void
     * javax.management.relation.RelationService.purgeRelations() throws
     * javax.management.relation.RelationServiceNotRegisteredException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.relation.RelationService#purgeRelations() public void
     *      javax.management.relation.RelationService.purgeRelations() throws
     *      javax.management.relation.RelationServiceNotRegisteredException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_purgeRelations()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.relation.RelationService#getNotificationInfo() public
     * javax.management.MBeanNotificationInfo[] javax.management.relation.RelationService.getNotificationInfo()}.
     *
     * <p>
     * Test method for {@link javax.management.relation.RelationService#getNotificationInfo() public
     * javax.management.MBeanNotificationInfo[] javax.management.relation.RelationService.getNotificationInfo()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.relation.RelationService#getNotificationInfo() public
     *      javax.management.MBeanNotificationInfo[] javax.management.relation.RelationService.getNotificationInfo()
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getNotificationInfo()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.relation.RelationService#getRoleInfo(String, String) public
     * javax.management.relation.RoleInfo
     * javax.management.relation.RelationService.getRoleInfo(java.lang.String,java.lang.String) throws
     * java.lang.IllegalArgumentException,javax.management.relation.RelationTypeNotFoundException,javax.management.relation.RoleInfoNotFoundException}
     * .
     *
     * <p>
     * Test method for {@link javax.management.relation.RelationService#getRoleInfo(String, String) public
     * javax.management.relation.RoleInfo
     * javax.management.relation.RelationService.getRoleInfo(java.lang.String,java.lang.String) throws
     * java.lang.IllegalArgumentException,javax.management.relation.RelationTypeNotFoundException,javax.management.relation.RoleInfoNotFoundException}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.relation.RelationService#getRoleInfo(String, String) public
     *      javax.management.relation.RoleInfo
     *      javax.management.relation.RelationService.getRoleInfo(java.lang.String,java.lang.String) throws
     *      java.lang.IllegalArgumentException,javax.management.relation.RelationTypeNotFoundException,javax.management.
     *      relation.RoleInfoNotFoundException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getRoleInfo_String_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.relation.RelationService#removeRelation(String) public void
     * javax.management.relation.RelationService.removeRelation(java.lang.String) throws
     * javax.management.relation.RelationServiceNotRegisteredException,java.lang.IllegalArgumentException,javax.management.relation.RelationNotFoundException}
     * .
     *
     * <p>
     * Test method for {@link javax.management.relation.RelationService#removeRelation(String) public void
     * javax.management.relation.RelationService.removeRelation(java.lang.String) throws
     * javax.management.relation.RelationServiceNotRegisteredException,java.lang.IllegalArgumentException,javax.management.relation.RelationNotFoundException}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.relation.RelationService#removeRelation(String) public void
     *      javax.management.relation.RelationService.removeRelation(java.lang.String) throws
     *      javax.management.relation.RelationServiceNotRegisteredException,java.lang.IllegalArgumentException,javax.
     *      management.relation.RelationNotFoundException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_removeRelation_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.relation.RelationService#getRoleInfos(String) public java.util.List
     * <javax.management.relation.RoleInfo> javax.management.relation.RelationService.getRoleInfos(java.lang.String)
     * throws java.lang.IllegalArgumentException,javax.management.relation.RelationTypeNotFoundException}.
     *
     * <p>
     * Test method for {@link javax.management.relation.RelationService#getRoleInfos(String) public java.util.List
     * javax.management.relation.RelationService.getRoleInfos(java.lang.String) throws
     * java.lang.IllegalArgumentException,javax.management.relation.RelationTypeNotFoundException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.relation.RelationService#getRoleInfos(String) public java.util.List
     *      javax.management.relation.RelationService.getRoleInfos(java.lang.String) throws
     *      java.lang.IllegalArgumentException,javax.management.relation.RelationTypeNotFoundException (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getRoleInfos_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.management.relation.RelationService#sendRelationRemovalNotification(String, java.util.List) public
     * void javax.management.relation.RelationService.sendRelationRemovalNotification(java.lang.String,java.util.List
     * <javax.management.ObjectName>) throws
     * java.lang.IllegalArgumentException,javax.management.relation.RelationNotFoundException}.
     *
     * <p>
     * Test method for
     * {@link javax.management.relation.RelationService#sendRelationRemovalNotification(String, java.util.List) public
     * void javax.management.relation.RelationService.sendRelationRemovalNotification(java.lang.String,java.util.List)
     * throws java.lang.IllegalArgumentException,javax.management.relation.RelationNotFoundException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.relation.RelationService#sendRelationRemovalNotification(String, java.util.List) public
     *      void
     *      javax.management.relation.RelationService.sendRelationRemovalNotification(java.lang.String,java.util.List)
     *      throws java.lang.IllegalArgumentException,javax.management.relation.RelationNotFoundException (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_sendRelationRemovalNotification_String_List()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.management.relation.RelationService#addRelationType(javax.management.relation.RelationType) public
     * void javax.management.relation.RelationService.addRelationType(javax.management.relation.RelationType) throws
     * java.lang.IllegalArgumentException,javax.management.relation.InvalidRelationTypeException}.
     *
     * <p>
     * Test method for
     * {@link javax.management.relation.RelationService#addRelationType(javax.management.relation.RelationType) public
     * void javax.management.relation.RelationService.addRelationType(javax.management.relation.RelationType) throws
     * java.lang.IllegalArgumentException,javax.management.relation.InvalidRelationTypeException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.relation.RelationService#addRelationType(javax.management.relation.RelationType) public
     *      void javax.management.relation.RelationService.addRelationType(javax.management.relation.RelationType)
     *      throws java.lang.IllegalArgumentException,javax.management.relation.InvalidRelationTypeException (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_addRelationType_RelationType()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.relation.RelationService#postDeregister() public void
     * javax.management.relation.RelationService.postDeregister()}.
     *
     * <p>
     * Test method for {@link javax.management.relation.RelationService#postDeregister() public void
     * javax.management.relation.RelationService.postDeregister()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.relation.RelationService#postDeregister() public void
     *      javax.management.relation.RelationService.postDeregister() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_postDeregister()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.relation.RelationService#getPurgeFlag() public boolean
     * javax.management.relation.RelationService.getPurgeFlag()}.
     *
     * <p>
     * Test method for {@link javax.management.relation.RelationService#getPurgeFlag() public boolean
     * javax.management.relation.RelationService.getPurgeFlag()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.relation.RelationService#getPurgeFlag() public boolean
     *      javax.management.relation.RelationService.getPurgeFlag() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getPurgeFlag()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.relation.RelationService#getAllRoles(String) public
     * javax.management.relation.RoleResult javax.management.relation.RelationService.getAllRoles(java.lang.String)
     * throws
     * java.lang.IllegalArgumentException,javax.management.relation.RelationNotFoundException,javax.management.relation.RelationServiceNotRegisteredException}
     * .
     *
     * <p>
     * Test method for {@link javax.management.relation.RelationService#getAllRoles(String) public
     * javax.management.relation.RoleResult javax.management.relation.RelationService.getAllRoles(java.lang.String)
     * throws
     * java.lang.IllegalArgumentException,javax.management.relation.RelationNotFoundException,javax.management.relation.RelationServiceNotRegisteredException}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.relation.RelationService#getAllRoles(String) public javax.management.relation.RoleResult
     *      javax.management.relation.RelationService.getAllRoles(java.lang.String) throws
     *      java.lang.IllegalArgumentException,javax.management.relation.RelationNotFoundException,javax.management.
     *      relation.RelationServiceNotRegisteredException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getAllRoles_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.management.relation.RelationService#setRoles(String, javax.management.relation.RoleList) public
     * javax.management.relation.RoleResult
     * javax.management.relation.RelationService.setRoles(java.lang.String,javax.management.relation.RoleList) throws
     * javax.management.relation.RelationServiceNotRegisteredException,java.lang.IllegalArgumentException,javax.management.relation.RelationNotFoundException}
     * .
     *
     * <p>
     * Test method for
     * {@link javax.management.relation.RelationService#setRoles(String, javax.management.relation.RoleList) public
     * javax.management.relation.RoleResult
     * javax.management.relation.RelationService.setRoles(java.lang.String,javax.management.relation.RoleList) throws
     * javax.management.relation.RelationServiceNotRegisteredException,java.lang.IllegalArgumentException,javax.management.relation.RelationNotFoundException}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.relation.RelationService#setRoles(String, javax.management.relation.RoleList) public
     *      javax.management.relation.RoleResult
     *      javax.management.relation.RelationService.setRoles(java.lang.String,javax.management.relation.RoleList)
     *      throws
     *      javax.management.relation.RelationServiceNotRegisteredException,java.lang.IllegalArgumentException,javax.
     *      management.relation.RelationNotFoundException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_setRoles_String_RoleList()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.relation.RelationService#addRelation(javax.management.ObjectName) public
     * void javax.management.relation.RelationService.addRelation(javax.management.ObjectName) throws
     * java.lang.IllegalArgumentException,javax.management.relation.RelationServiceNotRegisteredException,java.lang.NoSuchMethodException,javax.management.relation.InvalidRelationIdException,javax.management.InstanceNotFoundException,javax.management.relation.InvalidRelationServiceException,javax.management.relation.RelationTypeNotFoundException,javax.management.relation.RoleNotFoundException,javax.management.relation.InvalidRoleValueException}
     * .
     *
     * <p>
     * Test method for {@link javax.management.relation.RelationService#addRelation(javax.management.ObjectName) public
     * void javax.management.relation.RelationService.addRelation(javax.management.ObjectName) throws
     * java.lang.IllegalArgumentException,javax.management.relation.RelationServiceNotRegisteredException,java.lang.NoSuchMethodException,javax.management.relation.InvalidRelationIdException,javax.management.InstanceNotFoundException,javax.management.relation.InvalidRelationServiceException,javax.management.relation.RelationTypeNotFoundException,javax.management.relation.RoleNotFoundException,javax.management.relation.InvalidRoleValueException}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.relation.RelationService#addRelation(javax.management.ObjectName) public void
     *      javax.management.relation.RelationService.addRelation(javax.management.ObjectName) throws
     *      java.lang.IllegalArgumentException,javax.management.relation.RelationServiceNotRegisteredException,java.lang
     *      .NoSuchMethodException,javax.management.relation.InvalidRelationIdException,javax.management.
     *      InstanceNotFoundException,javax.management.relation.InvalidRelationServiceException,javax.management.
     *      relation.RelationTypeNotFoundException,javax.management.relation.RoleNotFoundException,javax.management.
     *      relation.InvalidRoleValueException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_addRelation_ObjectName()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.relation.RelationService#getRelationTypeName(String) public
     * java.lang.String javax.management.relation.RelationService.getRelationTypeName(java.lang.String) throws
     * java.lang.IllegalArgumentException,javax.management.relation.RelationNotFoundException}.
     *
     * <p>
     * Test method for {@link javax.management.relation.RelationService#getRelationTypeName(String) public
     * java.lang.String javax.management.relation.RelationService.getRelationTypeName(java.lang.String) throws
     * java.lang.IllegalArgumentException,javax.management.relation.RelationNotFoundException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.relation.RelationService#getRelationTypeName(String) public java.lang.String
     *      javax.management.relation.RelationService.getRelationTypeName(java.lang.String) throws
     *      java.lang.IllegalArgumentException,javax.management.relation.RelationNotFoundException (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getRelationTypeName_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.relation.RelationService#getRoles(String, String[]) public
     * javax.management.relation.RoleResult
     * javax.management.relation.RelationService.getRoles(java.lang.String,java.lang.String[]) throws
     * javax.management.relation.RelationServiceNotRegisteredException,java.lang.IllegalArgumentException,javax.management.relation.RelationNotFoundException}
     * .
     *
     * <p>
     * Test method for {@link javax.management.relation.RelationService#getRoles(String, String[]) public
     * javax.management.relation.RoleResult
     * javax.management.relation.RelationService.getRoles(java.lang.String,java.lang.String[]) throws
     * javax.management.relation.RelationServiceNotRegisteredException,java.lang.IllegalArgumentException,javax.management.relation.RelationNotFoundException}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.relation.RelationService#getRoles(String, String[]) public
     *      javax.management.relation.RoleResult
     *      javax.management.relation.RelationService.getRoles(java.lang.String,java.lang.String[]) throws
     *      javax.management.relation.RelationServiceNotRegisteredException,java.lang.IllegalArgumentException,javax.
     *      management.relation.RelationNotFoundException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getRoles_String_StringArray()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.management.relation.RelationService#preRegister(javax.management.MBeanServer, javax.management.ObjectName)
     * public javax.management.ObjectName
     * javax.management.relation.RelationService.preRegister(javax.management.MBeanServer,javax.management.ObjectName)
     * throws java.lang.Exception}.
     *
     * <p>
     * Test method for
     * {@link javax.management.relation.RelationService#preRegister(javax.management.MBeanServer, javax.management.ObjectName)
     * public javax.management.ObjectName
     * javax.management.relation.RelationService.preRegister(javax.management.MBeanServer,javax.management.ObjectName)
     * throws java.lang.Exception}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.relation.RelationService#preRegister(javax.management.MBeanServer,
     *      javax.management.ObjectName) public javax.management.ObjectName
     *      javax.management.relation.RelationService.preRegister(javax.management.MBeanServer,javax.management.
     *      ObjectName) throws java.lang.Exception (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_preRegister_MBeanServer_ObjectName()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.management.relation.RelationService#updateRoleMap(String, javax.management.relation.Role, java.util.List)
     * public void
     * javax.management.relation.RelationService.updateRoleMap(java.lang.String,javax.management.relation.Role,java.util.List
     * <javax.management.ObjectName>) throws
     * java.lang.IllegalArgumentException,javax.management.relation.RelationServiceNotRegisteredException,javax.management.relation.RelationNotFoundException}
     * .
     *
     * <p>
     * Test method for
     * {@link javax.management.relation.RelationService#updateRoleMap(String, javax.management.relation.Role, java.util.List)
     * public void
     * javax.management.relation.RelationService.updateRoleMap(java.lang.String,javax.management.relation.Role,java.util.List)
     * throws
     * java.lang.IllegalArgumentException,javax.management.relation.RelationServiceNotRegisteredException,javax.management.relation.RelationNotFoundException}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.relation.RelationService#updateRoleMap(String, javax.management.relation.Role,
     *      java.util.List) public void
     *      javax.management.relation.RelationService.updateRoleMap(java.lang.String,javax.management.relation.Role,java
     *      .util.List) throws
     *      java.lang.IllegalArgumentException,javax.management.relation.RelationServiceNotRegisteredException,javax.
     *      management.relation.RelationNotFoundException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_updateRoleMap_String_Role_List()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.relation.RelationService#getAllRelationTypeNames() public java.util.List
     * <java.lang.String> javax.management.relation.RelationService.getAllRelationTypeNames()}.
     *
     * <p>
     * Test method for {@link javax.management.relation.RelationService#getAllRelationTypeNames() public java.util.List
     * javax.management.relation.RelationService.getAllRelationTypeNames()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.relation.RelationService#getAllRelationTypeNames() public java.util.List
     *      javax.management.relation.RelationService.getAllRelationTypeNames() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getAllRelationTypeNames()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.management.relation.RelationService#checkRoleWriting(javax.management.relation.Role, String, Boolean)
     * public java.lang.Integer
     * javax.management.relation.RelationService.checkRoleWriting(javax.management.relation.Role,java.lang.String,java.lang.Boolean)
     * throws java.lang.IllegalArgumentException,javax.management.relation.RelationTypeNotFoundException}.
     *
     * <p>
     * Test method for
     * {@link javax.management.relation.RelationService#checkRoleWriting(javax.management.relation.Role, String, Boolean)
     * public java.lang.Integer
     * javax.management.relation.RelationService.checkRoleWriting(javax.management.relation.Role,java.lang.String,java.lang.Boolean)
     * throws java.lang.IllegalArgumentException,javax.management.relation.RelationTypeNotFoundException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.relation.RelationService#checkRoleWriting(javax.management.relation.Role, String, Boolean)
     *      public java.lang.Integer
     *      javax.management.relation.RelationService.checkRoleWriting(javax.management.relation.Role,java.lang.String,
     *      java.lang.Boolean) throws
     *      java.lang.IllegalArgumentException,javax.management.relation.RelationTypeNotFoundException (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_checkRoleWriting_Role_String_Boolean()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.relation.RelationService#isRelationMBean(String) public
     * javax.management.ObjectName javax.management.relation.RelationService.isRelationMBean(java.lang.String) throws
     * java.lang.IllegalArgumentException,javax.management.relation.RelationNotFoundException}.
     *
     * <p>
     * Test method for {@link javax.management.relation.RelationService#isRelationMBean(String) public
     * javax.management.ObjectName javax.management.relation.RelationService.isRelationMBean(java.lang.String) throws
     * java.lang.IllegalArgumentException,javax.management.relation.RelationNotFoundException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.relation.RelationService#isRelationMBean(String) public javax.management.ObjectName
     *      javax.management.relation.RelationService.isRelationMBean(java.lang.String) throws
     *      java.lang.IllegalArgumentException,javax.management.relation.RelationNotFoundException (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_isRelationMBean_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.management.relation.RelationService#findAssociatedMBeans(javax.management.ObjectName, String, String)
     * public java.util.Map<javax.management.ObjectName, java.util.List<java.lang.String>>
     * javax.management.relation.RelationService.findAssociatedMBeans(javax.management.ObjectName,java.lang.String,java.lang.String)
     * throws java.lang.IllegalArgumentException}.
     *
     * <p>
     * Test method for
     * {@link javax.management.relation.RelationService#findAssociatedMBeans(javax.management.ObjectName, String, String)
     * public java.util.Map
     * javax.management.relation.RelationService.findAssociatedMBeans(javax.management.ObjectName,java.lang.String,java.lang.String)
     * throws java.lang.IllegalArgumentException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.relation.RelationService#findAssociatedMBeans(javax.management.ObjectName, String, String)
     *      public java.util.Map
     *      javax.management.relation.RelationService.findAssociatedMBeans(javax.management.ObjectName,java.lang.String,
     *      java.lang.String) throws java.lang.IllegalArgumentException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_findAssociatedMBeans_ObjectName_String_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
