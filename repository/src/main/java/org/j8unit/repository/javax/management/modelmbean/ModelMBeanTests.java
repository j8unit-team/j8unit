package org.j8unit.repository.javax.management.modelmbean;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.management.modelmbean.ModelMBean interface
 * javax.management.modelmbean.ModelMBean}. The complementary j8unit test interface containing the class relevant
 * aspects is {@link ModelMBeanClassTests}.
 * </p>
 *
 * @see javax.management.modelmbean.ModelMBean interface javax.management.modelmbean.ModelMBean (the hereby targeted
 *      class-under-test class)
 * @see ModelMBeanClassTests ModelMBeanClassTests (the complementary j8unit test interface containing the class relevant
 *      test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ModelMBeanTests<SUT extends javax.management.modelmbean.ModelMBean>
extends org.j8unit.repository.javax.management.DynamicMBeanTests<SUT>, org.j8unit.repository.javax.management.PersistentMBeanTests<SUT>,
ModelMBeanNotificationBroadcasterTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.management.modelmbean.ModelMBean#setManagedResource(Object, String) public abstract
     * void javax.management.modelmbean.ModelMBean.setManagedResource(java.lang.Object,java.lang.String) throws
     * javax.management.MBeanException,javax.management.RuntimeOperationsException,javax.management.InstanceNotFoundException,javax.management.modelmbean.InvalidTargetObjectTypeException}
     * .
     *
     * <p>
     * Test method for {@link javax.management.modelmbean.ModelMBean#setManagedResource(Object, String) public abstract
     * void javax.management.modelmbean.ModelMBean.setManagedResource(java.lang.Object,java.lang.String) throws
     * javax.management.MBeanException,javax.management.RuntimeOperationsException,javax.management.InstanceNotFoundException,javax.management.modelmbean.InvalidTargetObjectTypeException}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.modelmbean.ModelMBean#setManagedResource(Object, String) public abstract void
     *      javax.management.modelmbean.ModelMBean.setManagedResource(java.lang.Object,java.lang.String) throws
     *      javax.management.MBeanException,javax.management.RuntimeOperationsException,javax.management.
     *      InstanceNotFoundException,javax.management.modelmbean.InvalidTargetObjectTypeException (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setManagedResource_Object_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.management.modelmbean.ModelMBean#setModelMBeanInfo(javax.management.modelmbean.ModelMBeanInfo)
     * public abstract void
     * javax.management.modelmbean.ModelMBean.setModelMBeanInfo(javax.management.modelmbean.ModelMBeanInfo) throws
     * javax.management.MBeanException,javax.management.RuntimeOperationsException}.
     *
     * <p>
     * Test method for
     * {@link javax.management.modelmbean.ModelMBean#setModelMBeanInfo(javax.management.modelmbean.ModelMBeanInfo)
     * public abstract void
     * javax.management.modelmbean.ModelMBean.setModelMBeanInfo(javax.management.modelmbean.ModelMBeanInfo) throws
     * javax.management.MBeanException,javax.management.RuntimeOperationsException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.modelmbean.ModelMBean#setModelMBeanInfo(javax.management.modelmbean.ModelMBeanInfo) public
     *      abstract void
     *      javax.management.modelmbean.ModelMBean.setModelMBeanInfo(javax.management.modelmbean.ModelMBeanInfo) throws
     *      javax.management.MBeanException,javax.management.RuntimeOperationsException (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setModelMBeanInfo_ModelMBeanInfo()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
