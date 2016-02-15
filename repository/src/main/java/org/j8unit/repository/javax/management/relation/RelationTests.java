package org.j8unit.repository.javax.management.relation;

import org.j8unit.repository.RepositoryTests;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.management.relation.Relation interface
 * javax.management.relation.Relation}. The complementary j8unit test interface containing the class relevant aspects is
 * {@link RelationClassTests}.
 * </p>
 *
 * @see javax.management.relation.Relation interface javax.management.relation.Relation (the hereby targeted
 *      class-under-test class)
 * @see RelationClassTests RelationClassTests (the complementary j8unit test interface containing the class relevant
 *      test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface RelationTests<SUT extends javax.management.relation.Relation>
extends RepositoryTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.management.relation.Relation#getRole(String) public abstract java.util.List
     * <javax.management.ObjectName> javax.management.relation.Relation.getRole(java.lang.String) throws
     * java.lang.IllegalArgumentException,javax.management.relation.RoleNotFoundException,javax.management.relation.RelationServiceNotRegisteredException}
     * .
     *
     * <p>
     * Test method for {@link javax.management.relation.Relation#getRole(String) public abstract java.util.List
     * javax.management.relation.Relation.getRole(java.lang.String) throws
     * java.lang.IllegalArgumentException,javax.management.relation.RoleNotFoundException,javax.management.relation.RelationServiceNotRegisteredException}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.relation.Relation#getRole(String) public abstract java.util.List
     *      javax.management.relation.Relation.getRole(java.lang.String) throws
     *      java.lang.IllegalArgumentException,javax.management.relation.RoleNotFoundException,javax.management.relation
     *      .RelationServiceNotRegisteredException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getRole_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.relation.Relation#getRoleCardinality(String) public abstract
     * java.lang.Integer javax.management.relation.Relation.getRoleCardinality(java.lang.String) throws
     * java.lang.IllegalArgumentException,javax.management.relation.RoleNotFoundException}.
     *
     * <p>
     * Test method for {@link javax.management.relation.Relation#getRoleCardinality(String) public abstract
     * java.lang.Integer javax.management.relation.Relation.getRoleCardinality(java.lang.String) throws
     * java.lang.IllegalArgumentException,javax.management.relation.RoleNotFoundException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.relation.Relation#getRoleCardinality(String) public abstract java.lang.Integer
     *      javax.management.relation.Relation.getRoleCardinality(java.lang.String) throws
     *      java.lang.IllegalArgumentException,javax.management.relation.RoleNotFoundException (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getRoleCardinality_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.relation.Relation#setRoles(javax.management.relation.RoleList) public
     * abstract javax.management.relation.RoleResult
     * javax.management.relation.Relation.setRoles(javax.management.relation.RoleList) throws
     * java.lang.IllegalArgumentException,javax.management.relation.RelationServiceNotRegisteredException,javax.management.relation.RelationTypeNotFoundException,javax.management.relation.RelationNotFoundException}
     * .
     *
     * <p>
     * Test method for {@link javax.management.relation.Relation#setRoles(javax.management.relation.RoleList) public
     * abstract javax.management.relation.RoleResult
     * javax.management.relation.Relation.setRoles(javax.management.relation.RoleList) throws
     * java.lang.IllegalArgumentException,javax.management.relation.RelationServiceNotRegisteredException,javax.management.relation.RelationTypeNotFoundException,javax.management.relation.RelationNotFoundException}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.relation.Relation#setRoles(javax.management.relation.RoleList) public abstract
     *      javax.management.relation.RoleResult
     *      javax.management.relation.Relation.setRoles(javax.management.relation.RoleList) throws
     *      java.lang.IllegalArgumentException,javax.management.relation.RelationServiceNotRegisteredException,javax.
     *      management.relation.RelationTypeNotFoundException,javax.management.relation.RelationNotFoundException (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setRoles_RoleList()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.relation.Relation#getRelationTypeName() public abstract java.lang.String
     * javax.management.relation.Relation.getRelationTypeName()}.
     *
     * <p>
     * Test method for {@link javax.management.relation.Relation#getRelationTypeName() public abstract java.lang.String
     * javax.management.relation.Relation.getRelationTypeName()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.relation.Relation#getRelationTypeName() public abstract java.lang.String
     *      javax.management.relation.Relation.getRelationTypeName() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getRelationTypeName()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.relation.Relation#getRoles(String[]) public abstract
     * javax.management.relation.RoleResult javax.management.relation.Relation.getRoles(java.lang.String[]) throws
     * java.lang.IllegalArgumentException,javax.management.relation.RelationServiceNotRegisteredException}.
     *
     * <p>
     * Test method for {@link javax.management.relation.Relation#getRoles(String[]) public abstract
     * javax.management.relation.RoleResult javax.management.relation.Relation.getRoles(java.lang.String[]) throws
     * java.lang.IllegalArgumentException,javax.management.relation.RelationServiceNotRegisteredException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.relation.Relation#getRoles(String[]) public abstract javax.management.relation.RoleResult
     *      javax.management.relation.Relation.getRoles(java.lang.String[]) throws
     *      java.lang.IllegalArgumentException,javax.management.relation.RelationServiceNotRegisteredException (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getRoles_StringArray()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.relation.Relation#getReferencedMBeans() public abstract
     * java.util.Map<javax.management.ObjectName, java.util.List<java.lang.String>>
     * javax.management.relation.Relation.getReferencedMBeans()}.
     *
     * <p>
     * Test method for {@link javax.management.relation.Relation#getReferencedMBeans() public abstract java.util.Map
     * javax.management.relation.Relation.getReferencedMBeans()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.relation.Relation#getReferencedMBeans() public abstract java.util.Map
     *      javax.management.relation.Relation.getReferencedMBeans() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getReferencedMBeans()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.relation.Relation#getRelationId() public abstract java.lang.String
     * javax.management.relation.Relation.getRelationId()}.
     *
     * <p>
     * Test method for {@link javax.management.relation.Relation#getRelationId() public abstract java.lang.String
     * javax.management.relation.Relation.getRelationId()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.relation.Relation#getRelationId() public abstract java.lang.String
     *      javax.management.relation.Relation.getRelationId() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getRelationId()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.relation.Relation#getAllRoles() public abstract
     * javax.management.relation.RoleResult javax.management.relation.Relation.getAllRoles() throws
     * javax.management.relation.RelationServiceNotRegisteredException}.
     *
     * <p>
     * Test method for {@link javax.management.relation.Relation#getAllRoles() public abstract
     * javax.management.relation.RoleResult javax.management.relation.Relation.getAllRoles() throws
     * javax.management.relation.RelationServiceNotRegisteredException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.relation.Relation#getAllRoles() public abstract javax.management.relation.RoleResult
     *      javax.management.relation.Relation.getAllRoles() throws
     *      javax.management.relation.RelationServiceNotRegisteredException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getAllRoles()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.management.relation.Relation#handleMBeanUnregistration(javax.management.ObjectName, String) public
     * abstract void
     * javax.management.relation.Relation.handleMBeanUnregistration(javax.management.ObjectName,java.lang.String) throws
     * java.lang.IllegalArgumentException,javax.management.relation.RoleNotFoundException,javax.management.relation.InvalidRoleValueException,javax.management.relation.RelationServiceNotRegisteredException,javax.management.relation.RelationTypeNotFoundException,javax.management.relation.RelationNotFoundException}
     * .
     *
     * <p>
     * Test method for
     * {@link javax.management.relation.Relation#handleMBeanUnregistration(javax.management.ObjectName, String) public
     * abstract void
     * javax.management.relation.Relation.handleMBeanUnregistration(javax.management.ObjectName,java.lang.String) throws
     * java.lang.IllegalArgumentException,javax.management.relation.RoleNotFoundException,javax.management.relation.InvalidRoleValueException,javax.management.relation.RelationServiceNotRegisteredException,javax.management.relation.RelationTypeNotFoundException,javax.management.relation.RelationNotFoundException}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.relation.Relation#handleMBeanUnregistration(javax.management.ObjectName, String) public
     *      abstract void
     *      javax.management.relation.Relation.handleMBeanUnregistration(javax.management.ObjectName,java.lang.String)
     *      throws
     *      java.lang.IllegalArgumentException,javax.management.relation.RoleNotFoundException,javax.management.relation
     *      .InvalidRoleValueException,javax.management.relation.RelationServiceNotRegisteredException,javax.management.
     *      relation.RelationTypeNotFoundException,javax.management.relation.RelationNotFoundException (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_handleMBeanUnregistration_ObjectName_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.relation.Relation#getRelationServiceName() public abstract
     * javax.management.ObjectName javax.management.relation.Relation.getRelationServiceName()}.
     *
     * <p>
     * Test method for {@link javax.management.relation.Relation#getRelationServiceName() public abstract
     * javax.management.ObjectName javax.management.relation.Relation.getRelationServiceName()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.relation.Relation#getRelationServiceName() public abstract javax.management.ObjectName
     *      javax.management.relation.Relation.getRelationServiceName() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getRelationServiceName()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.relation.Relation#retrieveAllRoles() public abstract
     * javax.management.relation.RoleList javax.management.relation.Relation.retrieveAllRoles()}.
     *
     * <p>
     * Test method for {@link javax.management.relation.Relation#retrieveAllRoles() public abstract
     * javax.management.relation.RoleList javax.management.relation.Relation.retrieveAllRoles()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.relation.Relation#retrieveAllRoles() public abstract javax.management.relation.RoleList
     *      javax.management.relation.Relation.retrieveAllRoles() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_retrieveAllRoles()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.relation.Relation#setRole(javax.management.relation.Role) public abstract
     * void javax.management.relation.Relation.setRole(javax.management.relation.Role) throws
     * java.lang.IllegalArgumentException,javax.management.relation.RoleNotFoundException,javax.management.relation.RelationTypeNotFoundException,javax.management.relation.InvalidRoleValueException,javax.management.relation.RelationServiceNotRegisteredException,javax.management.relation.RelationNotFoundException}
     * .
     *
     * <p>
     * Test method for {@link javax.management.relation.Relation#setRole(javax.management.relation.Role) public abstract
     * void javax.management.relation.Relation.setRole(javax.management.relation.Role) throws
     * java.lang.IllegalArgumentException,javax.management.relation.RoleNotFoundException,javax.management.relation.RelationTypeNotFoundException,javax.management.relation.InvalidRoleValueException,javax.management.relation.RelationServiceNotRegisteredException,javax.management.relation.RelationNotFoundException}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.relation.Relation#setRole(javax.management.relation.Role) public abstract void
     *      javax.management.relation.Relation.setRole(javax.management.relation.Role) throws
     *      java.lang.IllegalArgumentException,javax.management.relation.RoleNotFoundException,javax.management.relation
     *      .RelationTypeNotFoundException,javax.management.relation.InvalidRoleValueException,javax.management.relation
     *      .RelationServiceNotRegisteredException,javax.management.relation.RelationNotFoundException (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setRole_Role()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
