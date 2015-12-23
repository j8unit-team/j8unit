package org.j8unit.repository.javax.management.modelmbean;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain javax.management.modelmbean.ModelMBean interface
 * javax.management.modelmbean.ModelMBean}, containing all instance relevant test methods (i.&thinsp;e., test methods of
 * non-{@code static} methods). The counterpart J8Unit test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.javax.management.modelmbean.ModelMBeanTests}.
 * </p>
 *
 * @see org.j8unit.repository.javax.management.modelmbean.ModelMBeanClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim javax.management.modelmbean.ModelMBean
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ModelMBeanTests<SUT extends javax.management.modelmbean.ModelMBean>
extends org.j8unit.repository.javax.management.DynamicMBeanTests<SUT>, org.j8unit.repository.javax.management.PersistentMBeanTests<SUT>,
org.j8unit.repository.javax.management.modelmbean.ModelMBeanNotificationBroadcasterTests<SUT> {

    /**
     * <p>
     * Test method for
     * {@link javax.management.modelmbean.ModelMBean#setManagedResource(java.lang.Object, java.lang.String) public
     * abstract void javax.management.modelmbean.ModelMBean.setManagedResource(java.lang.Object,java.lang.String) throws
     * javax.management.MBeanException,javax.management.RuntimeOperationsException,javax.management.InstanceNotFoundException,javax.management.modelmbean.InvalidTargetObjectTypeException}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.management.modelmbean.ModelMBean#setManagedResource(java.lang.Object, java.lang.String)
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
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.management.modelmbean.ModelMBean#setModelMBeanInfo(javax.management.modelmbean.ModelMBeanInfo)
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
