package org.j8unit.repository.javax.management;

import org.j8unit.repository.RepositoryTests;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.management.PersistentMBean interface
 * javax.management.PersistentMBean}. The complementary j8unit test interface containing the class relevant aspects is
 * {@link PersistentMBeanClassTests}.
 * </p>
 *
 * @see javax.management.PersistentMBean interface javax.management.PersistentMBean (the hereby targeted
 *      class-under-test class)
 * @see PersistentMBeanClassTests PersistentMBeanClassTests (the complementary j8unit test interface containing the
 *      class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface PersistentMBeanTests<SUT extends javax.management.PersistentMBean>
extends RepositoryTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.management.PersistentMBean#load() public abstract void
     * javax.management.PersistentMBean.load() throws
     * javax.management.MBeanException,javax.management.RuntimeOperationsException,javax.management.InstanceNotFoundException}
     * .
     *
     * <p>
     * Test method for {@link javax.management.PersistentMBean#load() public abstract void
     * javax.management.PersistentMBean.load() throws
     * javax.management.MBeanException,javax.management.RuntimeOperationsException,javax.management.InstanceNotFoundException}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.PersistentMBean#load() public abstract void javax.management.PersistentMBean.load() throws
     *      javax.management.MBeanException,javax.management.RuntimeOperationsException,javax.management.
     *      InstanceNotFoundException (the hereby targeted method-under-test)
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
     *
     * <p>
     * Test method for {@link javax.management.PersistentMBean#store() public abstract void
     * javax.management.PersistentMBean.store() throws
     * javax.management.MBeanException,javax.management.RuntimeOperationsException,javax.management.InstanceNotFoundException}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.PersistentMBean#store() public abstract void javax.management.PersistentMBean.store()
     *      throws javax.management.MBeanException,javax.management.RuntimeOperationsException,javax.management.
     *      InstanceNotFoundException (the hereby targeted method-under-test)
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
