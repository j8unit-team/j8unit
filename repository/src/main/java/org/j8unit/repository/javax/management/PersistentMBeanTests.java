package org.j8unit.repository.javax.management;

import org.j8unit.J8UnitTest;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.management.PersistentMBean interface javax.management.PersistentMBean}, containing all
 * instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.management.PersistentMBeanClassTests
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface PersistentMBeanTests<SUT extends javax.management.PersistentMBean>
extends J8UnitTest<SUT> {

    /**
     * <p>
     * Test method for {@link javax.management.PersistentMBean#load() public abstract void
     * javax.management.PersistentMBean.load() throws
     * javax.management.MBeanException,javax.management.RuntimeOperationsException,javax.management.InstanceNotFoundException}
     * .
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_load()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.PersistentMBean#store() public abstract void
     * javax.management.PersistentMBean.store() throws
     * javax.management.MBeanException,javax.management.RuntimeOperationsException,javax.management.InstanceNotFoundException}
     * .
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_store()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
