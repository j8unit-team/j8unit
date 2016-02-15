package org.j8unit.repository.javax.management;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.management.MBeanServerBuilder class
 * javax.management.MBeanServerBuilder}. The complementary j8unit test interface containing the class relevant aspects
 * is {@link MBeanServerBuilderClassTests}.
 * </p>
 *
 * @see javax.management.MBeanServerBuilder class javax.management.MBeanServerBuilder (the hereby targeted
 *      class-under-test class)
 * @see MBeanServerBuilderClassTests MBeanServerBuilderClassTests (the complementary j8unit test interface containing
 *      the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface MBeanServerBuilderTests<SUT extends javax.management.MBeanServerBuilder>
extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.management.MBeanServerBuilder#newMBeanServerDelegate() public
     * javax.management.MBeanServerDelegate javax.management.MBeanServerBuilder.newMBeanServerDelegate()}.
     *
     * <p>
     * Test method for {@link javax.management.MBeanServerBuilder#newMBeanServerDelegate() public
     * javax.management.MBeanServerDelegate javax.management.MBeanServerBuilder.newMBeanServerDelegate()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.MBeanServerBuilder#newMBeanServerDelegate() public javax.management.MBeanServerDelegate
     *      javax.management.MBeanServerBuilder.newMBeanServerDelegate() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_newMBeanServerDelegate()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.management.MBeanServerBuilder#newMBeanServer(String, javax.management.MBeanServer, javax.management.MBeanServerDelegate)
     * public javax.management.MBeanServer
     * javax.management.MBeanServerBuilder.newMBeanServer(java.lang.String,javax.management.MBeanServer,javax.management.MBeanServerDelegate)}
     * .
     *
     * <p>
     * Test method for
     * {@link javax.management.MBeanServerBuilder#newMBeanServer(String, javax.management.MBeanServer, javax.management.MBeanServerDelegate)
     * public javax.management.MBeanServer
     * javax.management.MBeanServerBuilder.newMBeanServer(java.lang.String,javax.management.MBeanServer,javax.management.MBeanServerDelegate)}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.MBeanServerBuilder#newMBeanServer(String, javax.management.MBeanServer,
     *      javax.management.MBeanServerDelegate) public javax.management.MBeanServer
     *      javax.management.MBeanServerBuilder.newMBeanServer(java.lang.String,javax.management.MBeanServer,javax.
     *      management.MBeanServerDelegate) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_newMBeanServer_String_MBeanServer_MBeanServerDelegate()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
