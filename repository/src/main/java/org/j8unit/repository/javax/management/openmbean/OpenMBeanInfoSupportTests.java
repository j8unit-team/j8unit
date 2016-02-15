package org.j8unit.repository.javax.management.openmbean;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.management.openmbean.OpenMBeanInfoSupport class
 * javax.management.openmbean.OpenMBeanInfoSupport}. The complementary j8unit test interface containing the class
 * relevant aspects is {@link OpenMBeanInfoSupportClassTests}.
 * </p>
 *
 * @see javax.management.openmbean.OpenMBeanInfoSupport class javax.management.openmbean.OpenMBeanInfoSupport (the
 *      hereby targeted class-under-test class)
 * @see OpenMBeanInfoSupportClassTests OpenMBeanInfoSupportClassTests (the complementary j8unit test interface
 *      containing the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface OpenMBeanInfoSupportTests<SUT extends javax.management.openmbean.OpenMBeanInfoSupport>
extends OpenMBeanInfoTests<SUT>, org.j8unit.repository.javax.management.MBeanInfoTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.management.openmbean.OpenMBeanInfoSupport#toString() public java.lang.String
     * javax.management.openmbean.OpenMBeanInfoSupport.toString()}.
     *
     * <p>
     * Test method for {@link javax.management.openmbean.OpenMBeanInfoSupport#toString() public java.lang.String
     * javax.management.openmbean.OpenMBeanInfoSupport.toString()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.openmbean.OpenMBeanInfoSupport#toString() public java.lang.String
     *      javax.management.openmbean.OpenMBeanInfoSupport.toString() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_toString()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.openmbean.OpenMBeanInfoSupport#equals(Object) public boolean
     * javax.management.openmbean.OpenMBeanInfoSupport.equals(java.lang.Object)}.
     *
     * <p>
     * Test method for {@link javax.management.openmbean.OpenMBeanInfoSupport#equals(Object) public boolean
     * javax.management.openmbean.OpenMBeanInfoSupport.equals(java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.openmbean.OpenMBeanInfoSupport#equals(Object) public boolean
     *      javax.management.openmbean.OpenMBeanInfoSupport.equals(java.lang.Object) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_equals_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.openmbean.OpenMBeanInfoSupport#hashCode() public int
     * javax.management.openmbean.OpenMBeanInfoSupport.hashCode()}.
     *
     * <p>
     * Test method for {@link javax.management.openmbean.OpenMBeanInfoSupport#hashCode() public int
     * javax.management.openmbean.OpenMBeanInfoSupport.hashCode()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.openmbean.OpenMBeanInfoSupport#hashCode() public int
     *      javax.management.openmbean.OpenMBeanInfoSupport.hashCode() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_hashCode()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * The method-under-test covered by this test method is inherited duplicatedly within the declaring
     * class-under-test:
     * </p>
     * <ul>
     * <li>{@linkplain javax.management.openmbean.OpenMBeanInfo#getDescription() interface
     * javax.management.openmbean.OpenMBeanInfo}</li>
     * <li>{@linkplain javax.management.MBeanInfo#getDescription() class javax.management.MBeanInfo}</li>
     * </ul>
     *
     * <p>
     * In result, there are duplicated according test methods within the parent test classes. To solve this situation,
     * this method must be overridden. Dont't worry, there will be meaningful test methods soon and, thus, overriding
     * becomes unnecessary.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getDescription()
    throws Exception {
    }

    /**
     * <p>
     * The method-under-test covered by this test method is inherited duplicatedly within the declaring
     * class-under-test:
     * </p>
     * <ul>
     * <li>{@linkplain javax.management.openmbean.OpenMBeanInfo#getClassName() interface
     * javax.management.openmbean.OpenMBeanInfo}</li>
     * <li>{@linkplain javax.management.MBeanInfo#getClassName() class javax.management.MBeanInfo}</li>
     * </ul>
     *
     * <p>
     * In result, there are duplicated according test methods within the parent test classes. To solve this situation,
     * this method must be overridden. Dont't worry, there will be meaningful test methods soon and, thus, overriding
     * becomes unnecessary.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getClassName()
    throws Exception {
    }

    /**
     * <p>
     * The method-under-test covered by this test method is inherited duplicatedly within the declaring
     * class-under-test:
     * </p>
     * <ul>
     * <li>{@linkplain javax.management.openmbean.OpenMBeanInfo#getConstructors() interface
     * javax.management.openmbean.OpenMBeanInfo}</li>
     * <li>{@linkplain javax.management.MBeanInfo#getConstructors() class javax.management.MBeanInfo}</li>
     * </ul>
     *
     * <p>
     * In result, there are duplicated according test methods within the parent test classes. To solve this situation,
     * this method must be overridden. Dont't worry, there will be meaningful test methods soon and, thus, overriding
     * becomes unnecessary.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getConstructors()
    throws Exception {
    }

    /**
     * <p>
     * The method-under-test covered by this test method is inherited duplicatedly within the declaring
     * class-under-test:
     * </p>
     * <ul>
     * <li>{@linkplain javax.management.openmbean.OpenMBeanInfo#getNotifications() interface
     * javax.management.openmbean.OpenMBeanInfo}</li>
     * <li>{@linkplain javax.management.MBeanInfo#getNotifications() class javax.management.MBeanInfo}</li>
     * </ul>
     *
     * <p>
     * In result, there are duplicated according test methods within the parent test classes. To solve this situation,
     * this method must be overridden. Dont't worry, there will be meaningful test methods soon and, thus, overriding
     * becomes unnecessary.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getNotifications()
    throws Exception {
    }

    /**
     * <p>
     * The method-under-test covered by this test method is inherited duplicatedly within the declaring
     * class-under-test:
     * </p>
     * <ul>
     * <li>{@linkplain javax.management.openmbean.OpenMBeanInfo#getAttributes() interface
     * javax.management.openmbean.OpenMBeanInfo}</li>
     * <li>{@linkplain javax.management.MBeanInfo#getAttributes() class javax.management.MBeanInfo}</li>
     * </ul>
     *
     * <p>
     * In result, there are duplicated according test methods within the parent test classes. To solve this situation,
     * this method must be overridden. Dont't worry, there will be meaningful test methods soon and, thus, overriding
     * becomes unnecessary.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getAttributes()
    throws Exception {
    }

    /**
     * <p>
     * The method-under-test covered by this test method is inherited duplicatedly within the declaring
     * class-under-test:
     * </p>
     * <ul>
     * <li>{@linkplain javax.management.openmbean.OpenMBeanInfo#getOperations() interface
     * javax.management.openmbean.OpenMBeanInfo}</li>
     * <li>{@linkplain javax.management.MBeanInfo#getOperations() class javax.management.MBeanInfo}</li>
     * </ul>
     *
     * <p>
     * In result, there are duplicated according test methods within the parent test classes. To solve this situation,
     * this method must be overridden. Dont't worry, there will be meaningful test methods soon and, thus, overriding
     * becomes unnecessary.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getOperations()
    throws Exception {
    }

}
