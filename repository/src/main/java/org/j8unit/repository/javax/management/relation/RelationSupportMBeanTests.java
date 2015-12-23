package org.j8unit.repository.javax.management.relation;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain javax.management.relation.RelationSupportMBean interface
 * javax.management.relation.RelationSupportMBean}, containing all instance relevant test methods (i.&thinsp;e., test
 * methods of non-{@code static} methods). The counterpart J8Unit test interface containing the class relevant test
 * methods is {@link org.j8unit.repository.javax.management.relation.RelationSupportMBeanTests}.
 * </p>
 *
 * @see org.j8unit.repository.javax.management.relation.RelationSupportMBeanClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim javax.management.relation.RelationSupportMBean
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface RelationSupportMBeanTests<SUT extends javax.management.relation.RelationSupportMBean>
extends org.j8unit.repository.javax.management.relation.RelationTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.management.relation.RelationSupportMBean#isInRelationService() public abstract
     * java.lang.Boolean javax.management.relation.RelationSupportMBean.isInRelationService()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.management.relation.RelationSupportMBean#isInRelationService()
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

    /**
     * <p>
     * Test method for
     * {@link javax.management.relation.RelationSupportMBean#setRelationServiceManagementFlag(java.lang.Boolean) public
     * abstract void javax.management.relation.RelationSupportMBean.setRelationServiceManagementFlag(java.lang.Boolean)
     * throws java.lang.IllegalArgumentException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.management.relation.RelationSupportMBean#setRelationServiceManagementFlag(java.lang.Boolean)
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

}
