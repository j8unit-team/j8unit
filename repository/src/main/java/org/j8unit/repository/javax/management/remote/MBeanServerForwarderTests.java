package org.j8unit.repository.javax.management.remote;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.management.remote.MBeanServerForwarder interface
 * javax.management.remote.MBeanServerForwarder}, containing all instance relevant test methods (i.&thinsp;e., test
 * methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.management.remote.MBeanServerForwarderClassTests
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface MBeanServerForwarderTests<SUT extends javax.management.remote.MBeanServerForwarder>
extends org.j8unit.repository.javax.management.MBeanServerTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.management.remote.MBeanServerForwarder#getMBeanServer() public abstract
     * javax.management.MBeanServer javax.management.remote.MBeanServerForwarder.getMBeanServer()}.
     * </p>
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

    /**
     * <p>
     * Test method for {@link javax.management.remote.MBeanServerForwarder#setMBeanServer(javax.management.MBeanServer)
     * public abstract void javax.management.remote.MBeanServerForwarder.setMBeanServer(javax.management.MBeanServer)}.
     * </p>
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

}
