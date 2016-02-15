package org.j8unit.repository.javax.management.relation;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.management.relation.RelationTypeSupport class
 * javax.management.relation.RelationTypeSupport}. The complementary j8unit test interface containing the class relevant
 * aspects is {@link RelationTypeSupportClassTests}.
 * </p>
 *
 * @see javax.management.relation.RelationTypeSupport class javax.management.relation.RelationTypeSupport (the hereby
 *      targeted class-under-test class)
 * @see RelationTypeSupportClassTests RelationTypeSupportClassTests (the complementary j8unit test interface containing
 *      the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface RelationTypeSupportTests<SUT extends javax.management.relation.RelationTypeSupport>
extends RelationTypeTests<SUT>, org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.management.relation.RelationTypeSupport#getRelationTypeName() public
     * java.lang.String javax.management.relation.RelationTypeSupport.getRelationTypeName()}.
     *
     * <p>
     * Test method for {@link javax.management.relation.RelationTypeSupport#getRelationTypeName() public
     * java.lang.String javax.management.relation.RelationTypeSupport.getRelationTypeName()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.relation.RelationTypeSupport#getRelationTypeName() public java.lang.String
     *      javax.management.relation.RelationTypeSupport.getRelationTypeName() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
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
     * Test method for {@link javax.management.relation.RelationTypeSupport#getRoleInfo(String) public
     * javax.management.relation.RoleInfo javax.management.relation.RelationTypeSupport.getRoleInfo(java.lang.String)
     * throws java.lang.IllegalArgumentException,javax.management.relation.RoleInfoNotFoundException}.
     *
     * <p>
     * Test method for {@link javax.management.relation.RelationTypeSupport#getRoleInfo(String) public
     * javax.management.relation.RoleInfo javax.management.relation.RelationTypeSupport.getRoleInfo(java.lang.String)
     * throws java.lang.IllegalArgumentException,javax.management.relation.RoleInfoNotFoundException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.relation.RelationTypeSupport#getRoleInfo(String) public javax.management.relation.RoleInfo
     *      javax.management.relation.RelationTypeSupport.getRoleInfo(java.lang.String) throws
     *      java.lang.IllegalArgumentException,javax.management.relation.RoleInfoNotFoundException (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getRoleInfo_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.relation.RelationTypeSupport#getRoleInfos() public java.util.List
     * <javax.management.relation.RoleInfo> javax.management.relation.RelationTypeSupport.getRoleInfos()}.
     *
     * <p>
     * Test method for {@link javax.management.relation.RelationTypeSupport#getRoleInfos() public java.util.List
     * javax.management.relation.RelationTypeSupport.getRoleInfos()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.relation.RelationTypeSupport#getRoleInfos() public java.util.List
     *      javax.management.relation.RelationTypeSupport.getRoleInfos() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getRoleInfos()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
