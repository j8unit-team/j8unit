package org.j8unit.repository.javax.management.modelmbean;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.management.modelmbean.ModelMBean interface javax.management.modelmbean.ModelMBean},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.management.modelmbean.ModelMBeanClassTests
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ModelMBeanTests<SUT extends javax.management.modelmbean.ModelMBean>
extends org.j8unit.repository.javax.management.DynamicMBeanTests<SUT>, org.j8unit.repository.javax.management.PersistentMBeanTests<SUT>,
org.j8unit.repository.javax.management.modelmbean.ModelMBeanNotificationBroadcasterTests<SUT> {

    /**
     * <p>
     * Test method for
     * {@link javax.management.modelmbean.ModelMBean#setManagedResource(java.lang.Object,java.lang.String) public
     * abstract void javax.management.modelmbean.ModelMBean.setManagedResource(java.lang.Object,java.lang.String) throws
     * javax.management.MBeanException,javax.management.RuntimeOperationsException,javax.management.InstanceNotFoundException,javax.management.modelmbean.InvalidTargetObjectTypeException}
     * .
     * </p>
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
     * </p>
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
