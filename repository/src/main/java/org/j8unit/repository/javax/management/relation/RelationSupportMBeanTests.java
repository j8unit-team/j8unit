package org.j8unit.repository.javax.management.relation;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.management.relation.RelationSupportMBean interface
 * javax.management.relation.RelationSupportMBean}. The complementary j8unit test interface containing the class
 * relevant aspects is {@link RelationSupportMBeanClassTests}.
 * </p>
 *
 * @see javax.management.relation.RelationSupportMBean interface javax.management.relation.RelationSupportMBean (the
 *      hereby targeted class-under-test class)
 * @see RelationSupportMBeanClassTests RelationSupportMBeanClassTests (the complementary j8unit test interface
 *      containing the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface RelationSupportMBeanTests<SUT extends javax.management.relation.RelationSupportMBean>
extends RelationTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.management.relation.RelationSupportMBean#setRelationServiceManagementFlag(Boolean)
     * public abstract void
     * javax.management.relation.RelationSupportMBean.setRelationServiceManagementFlag(java.lang.Boolean) throws
     * java.lang.IllegalArgumentException}.
     *
     * <p>
     * Test method for {@link javax.management.relation.RelationSupportMBean#setRelationServiceManagementFlag(Boolean)
     * public abstract void
     * javax.management.relation.RelationSupportMBean.setRelationServiceManagementFlag(java.lang.Boolean) throws
     * java.lang.IllegalArgumentException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.relation.RelationSupportMBean#setRelationServiceManagementFlag(Boolean) public abstract
     *      void javax.management.relation.RelationSupportMBean.setRelationServiceManagementFlag(java.lang.Boolean)
     *      throws java.lang.IllegalArgumentException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setRelationServiceManagementFlag_Boolean()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.relation.RelationSupportMBean#isInRelationService() public abstract
     * java.lang.Boolean javax.management.relation.RelationSupportMBean.isInRelationService()}.
     *
     * <p>
     * Test method for {@link javax.management.relation.RelationSupportMBean#isInRelationService() public abstract
     * java.lang.Boolean javax.management.relation.RelationSupportMBean.isInRelationService()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.relation.RelationSupportMBean#isInRelationService() public abstract java.lang.Boolean
     *      javax.management.relation.RelationSupportMBean.isInRelationService() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_isInRelationService()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
