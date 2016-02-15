package org.j8unit.repository.javax.management.remote;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.management.remote.MBeanServerForwarder interface
 * javax.management.remote.MBeanServerForwarder}. The complementary j8unit test interface containing the class relevant
 * aspects is {@link MBeanServerForwarderClassTests}.
 * </p>
 *
 * @see javax.management.remote.MBeanServerForwarder interface javax.management.remote.MBeanServerForwarder (the hereby
 *      targeted class-under-test class)
 * @see MBeanServerForwarderClassTests MBeanServerForwarderClassTests (the complementary j8unit test interface
 *      containing the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface MBeanServerForwarderTests<SUT extends javax.management.remote.MBeanServerForwarder>
extends org.j8unit.repository.javax.management.MBeanServerTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.management.remote.MBeanServerForwarder#setMBeanServer(javax.management.MBeanServer)
     * public abstract void javax.management.remote.MBeanServerForwarder.setMBeanServer(javax.management.MBeanServer)}.
     *
     * <p>
     * Test method for {@link javax.management.remote.MBeanServerForwarder#setMBeanServer(javax.management.MBeanServer)
     * public abstract void javax.management.remote.MBeanServerForwarder.setMBeanServer(javax.management.MBeanServer)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.remote.MBeanServerForwarder#setMBeanServer(javax.management.MBeanServer) public abstract
     *      void javax.management.remote.MBeanServerForwarder.setMBeanServer(javax.management.MBeanServer) (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setMBeanServer_MBeanServer()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.remote.MBeanServerForwarder#getMBeanServer() public abstract
     * javax.management.MBeanServer javax.management.remote.MBeanServerForwarder.getMBeanServer()}.
     *
     * <p>
     * Test method for {@link javax.management.remote.MBeanServerForwarder#getMBeanServer() public abstract
     * javax.management.MBeanServer javax.management.remote.MBeanServerForwarder.getMBeanServer()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.remote.MBeanServerForwarder#getMBeanServer() public abstract javax.management.MBeanServer
     *      javax.management.remote.MBeanServerForwarder.getMBeanServer() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getMBeanServer()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
