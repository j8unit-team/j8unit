package org.j8unit.repository.javax.management.relation;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain javax.management.relation.RelationType interface
 * javax.management.relation.RelationType}, containing all instance relevant test methods (i.&thinsp;e., test methods of
 * non-{@code static} methods). The counterpart J8Unit test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.javax.management.relation.RelationTypeTests}.
 * </p>
 *
 * @see org.j8unit.repository.javax.management.relation.RelationTypeClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim javax.management.relation.RelationType
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface RelationTypeTests<SUT extends javax.management.relation.RelationType>
extends org.j8unit.repository.java.io.SerializableTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.management.relation.RelationType#getRelationTypeName() public abstract
     * java.lang.String javax.management.relation.RelationType.getRelationTypeName()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.management.relation.RelationType#getRelationTypeName()
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
     * Test method for {@link javax.management.relation.RelationType#getRoleInfo(java.lang.String) public abstract
     * javax.management.relation.RoleInfo javax.management.relation.RelationType.getRoleInfo(java.lang.String) throws
     * java.lang.IllegalArgumentException,javax.management.relation.RoleInfoNotFoundException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.management.relation.RelationType#getRoleInfo(java.lang.String)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
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
     * Test method for {@link javax.management.relation.RelationType#getRoleInfos() public abstract java.util.List
     * javax.management.relation.RelationType.getRoleInfos()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.management.relation.RelationType#getRoleInfos()
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getRoleInfos()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
