package org.j8unit.repository.javax.management;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.management.MBeanServerBuilder class javax.management.MBeanServerBuilder}, containing all
 * instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.management.MBeanServerBuilderClassTests
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface MBeanServerBuilderTests<SUT extends javax.management.MBeanServerBuilder>
extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for
     * {@link javax.management.MBeanServerBuilder#newMBeanServer(java.lang.String,javax.management.MBeanServer,javax.management.MBeanServerDelegate)
     * public javax.management.MBeanServer
     * javax.management.MBeanServerBuilder.newMBeanServer(java.lang.String,javax.management.MBeanServer,javax.management.MBeanServerDelegate)}
     * .
     * </p>
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
     * </p>
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
