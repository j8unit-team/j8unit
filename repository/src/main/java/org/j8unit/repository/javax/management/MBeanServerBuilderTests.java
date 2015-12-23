package org.j8unit.repository.javax.management;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain javax.management.MBeanServerBuilder class
 * javax.management.MBeanServerBuilder}, containing all instance relevant test methods (i.&thinsp;e., test methods of
 * non-{@code static} methods). The counterpart J8Unit test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.javax.management.MBeanServerBuilderTests}.
 * </p>
 *
 * @see org.j8unit.repository.javax.management.MBeanServerBuilderClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim javax.management.MBeanServerBuilder
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface MBeanServerBuilderTests<SUT extends javax.management.MBeanServerBuilder>
extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for
     * {@link javax.management.MBeanServerBuilder#newMBeanServer(java.lang.String, javax.management.MBeanServer, javax.management.MBeanServerDelegate)
     * public javax.management.MBeanServer
     * javax.management.MBeanServerBuilder.newMBeanServer(java.lang.String,javax.management.MBeanServer,javax.management.MBeanServerDelegate)}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.management.MBeanServerBuilder#newMBeanServer(java.lang.String, javax.management.MBeanServer,
     *             javax.management.MBeanServerDelegate)
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

    /**
     * <p>
     * Test method for {@link javax.management.MBeanServerBuilder#newMBeanServerDelegate() public
     * javax.management.MBeanServerDelegate javax.management.MBeanServerBuilder.newMBeanServerDelegate()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.management.MBeanServerBuilder#newMBeanServerDelegate()
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

}
