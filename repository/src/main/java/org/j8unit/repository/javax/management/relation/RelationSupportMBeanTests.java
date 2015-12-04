package org.j8unit.repository.javax.management.relation;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.management.relation.RelationSupportMBean interface
 * javax.management.relation.RelationSupportMBean}, containing all instance relevant test methods (i.&thinsp;e., test
 * methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.management.relation.RelationSupportMBeanClassTests
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface RelationSupportMBeanTests<SUT extends javax.management.relation.RelationSupportMBean>
extends org.j8unit.repository.javax.management.relation.RelationTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.management.relation.RelationSupportMBean#isInRelationService() public abstract
     * java.lang.Boolean javax.management.relation.RelationSupportMBean.isInRelationService()}.
     * </p>
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
     * </p>
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
