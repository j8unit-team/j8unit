package org.j8unit.repository.javax.print.attribute.standard;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.print.attribute.standard.JobStateReasons class
 * javax.print.attribute.standard.JobStateReasons}, containing all instance relevant test methods (i.&thinsp;e., test
 * methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.print.attribute.standard.JobStateReasonsClassTests
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface JobStateReasonsTests<SUT extends javax.print.attribute.standard.JobStateReasons>
extends org.j8unit.repository.javax.print.attribute.PrintJobAttributeTests<SUT>,
org.j8unit.repository.java.util.HashSetTests<SUT, javax.print.attribute.standard.JobStateReason> {

    /**
     * <p>
     * Test method for
     * {@link javax.print.attribute.standard.JobStateReasons#add(javax.print.attribute.standard.JobStateReason) public
     * boolean javax.print.attribute.standard.JobStateReasons.add(javax.print.attribute.standard.JobStateReason)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_add_JobStateReason()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.print.attribute.standard.JobStateReasons#getCategory() public final java.lang.Class
     * javax.print.attribute.standard.JobStateReasons.getCategory()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_getCategory()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.print.attribute.standard.JobStateReasons#getName() public final java.lang.String
     * javax.print.attribute.standard.JobStateReasons.getName()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_getName()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}