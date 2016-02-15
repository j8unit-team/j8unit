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
 * non-{@code static} methods) of {@linkplain javax.management.MBeanRegistration interface
 * javax.management.MBeanRegistration}. The complementary j8unit test interface containing the class relevant aspects is
 * {@link MBeanRegistrationClassTests}.
 * </p>
 *
 * @see javax.management.MBeanRegistration interface javax.management.MBeanRegistration (the hereby targeted
 *      class-under-test class)
 * @see MBeanRegistrationClassTests MBeanRegistrationClassTests (the complementary j8unit test interface containing the
 *      class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface MBeanRegistrationTests<SUT extends javax.management.MBeanRegistration>
extends RepositoryTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.management.MBeanRegistration#postDeregister() public abstract void
     * javax.management.MBeanRegistration.postDeregister()}.
     *
     * <p>
     * Test method for {@link javax.management.MBeanRegistration#postDeregister() public abstract void
     * javax.management.MBeanRegistration.postDeregister()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.MBeanRegistration#postDeregister() public abstract void
     *      javax.management.MBeanRegistration.postDeregister() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
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
     * Test method for {@link javax.management.MBeanRegistration#preDeregister() public abstract void
     * javax.management.MBeanRegistration.preDeregister() throws java.lang.Exception}.
     *
     * <p>
     * Test method for {@link javax.management.MBeanRegistration#preDeregister() public abstract void
     * javax.management.MBeanRegistration.preDeregister() throws java.lang.Exception}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.MBeanRegistration#preDeregister() public abstract void
     *      javax.management.MBeanRegistration.preDeregister() throws java.lang.Exception (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
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
     * Test method for {@link javax.management.MBeanRegistration#postRegister(Boolean) public abstract void
     * javax.management.MBeanRegistration.postRegister(java.lang.Boolean)}.
     *
     * <p>
     * Test method for {@link javax.management.MBeanRegistration#postRegister(Boolean) public abstract void
     * javax.management.MBeanRegistration.postRegister(java.lang.Boolean)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.MBeanRegistration#postRegister(Boolean) public abstract void
     *      javax.management.MBeanRegistration.postRegister(java.lang.Boolean) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
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
     * Test method for
     * {@link javax.management.MBeanRegistration#preRegister(javax.management.MBeanServer, javax.management.ObjectName)
     * public abstract javax.management.ObjectName
     * javax.management.MBeanRegistration.preRegister(javax.management.MBeanServer,javax.management.ObjectName) throws
     * java.lang.Exception}.
     *
     * <p>
     * Test method for
     * {@link javax.management.MBeanRegistration#preRegister(javax.management.MBeanServer, javax.management.ObjectName)
     * public abstract javax.management.ObjectName
     * javax.management.MBeanRegistration.preRegister(javax.management.MBeanServer,javax.management.ObjectName) throws
     * java.lang.Exception}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.MBeanRegistration#preRegister(javax.management.MBeanServer, javax.management.ObjectName)
     *      public abstract javax.management.ObjectName
     *      javax.management.MBeanRegistration.preRegister(javax.management.MBeanServer,javax.management.ObjectName)
     *      throws java.lang.Exception (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_preRegister_MBeanServer_ObjectName()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
