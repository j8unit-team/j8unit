package org.j8unit.repository.javax.management.openmbean;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.management.openmbean.OpenMBeanConstructorInfoSupport class
 * javax.management.openmbean.OpenMBeanConstructorInfoSupport}. The complementary j8unit test interface containing the
 * class relevant aspects is {@link OpenMBeanConstructorInfoSupportClassTests}.
 * </p>
 *
 * @see javax.management.openmbean.OpenMBeanConstructorInfoSupport class
 *      javax.management.openmbean.OpenMBeanConstructorInfoSupport (the hereby targeted class-under-test class)
 * @see OpenMBeanConstructorInfoSupportClassTests OpenMBeanConstructorInfoSupportClassTests (the complementary j8unit
 *      test interface containing the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface OpenMBeanConstructorInfoSupportTests<SUT extends javax.management.openmbean.OpenMBeanConstructorInfoSupport>
extends OpenMBeanConstructorInfoTests<SUT>, org.j8unit.repository.javax.management.MBeanConstructorInfoTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.management.openmbean.OpenMBeanConstructorInfoSupport#toString() public
     * java.lang.String javax.management.openmbean.OpenMBeanConstructorInfoSupport.toString()}.
     *
     * <p>
     * Test method for {@link javax.management.openmbean.OpenMBeanConstructorInfoSupport#toString() public
     * java.lang.String javax.management.openmbean.OpenMBeanConstructorInfoSupport.toString()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.openmbean.OpenMBeanConstructorInfoSupport#toString() public java.lang.String
     *      javax.management.openmbean.OpenMBeanConstructorInfoSupport.toString() (the hereby targeted
     *      method-under-test)
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
     * Test method for {@link javax.management.openmbean.OpenMBeanConstructorInfoSupport#equals(Object) public boolean
     * javax.management.openmbean.OpenMBeanConstructorInfoSupport.equals(java.lang.Object)}.
     *
     * <p>
     * Test method for {@link javax.management.openmbean.OpenMBeanConstructorInfoSupport#equals(Object) public boolean
     * javax.management.openmbean.OpenMBeanConstructorInfoSupport.equals(java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.openmbean.OpenMBeanConstructorInfoSupport#equals(Object) public boolean
     *      javax.management.openmbean.OpenMBeanConstructorInfoSupport.equals(java.lang.Object) (the hereby targeted
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
     * Test method for {@link javax.management.openmbean.OpenMBeanConstructorInfoSupport#hashCode() public int
     * javax.management.openmbean.OpenMBeanConstructorInfoSupport.hashCode()}.
     *
     * <p>
     * Test method for {@link javax.management.openmbean.OpenMBeanConstructorInfoSupport#hashCode() public int
     * javax.management.openmbean.OpenMBeanConstructorInfoSupport.hashCode()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.openmbean.OpenMBeanConstructorInfoSupport#hashCode() public int
     *      javax.management.openmbean.OpenMBeanConstructorInfoSupport.hashCode() (the hereby targeted
     *      method-under-test)
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
     * <li>{@linkplain javax.management.MBeanFeatureInfo#getName() class javax.management.MBeanFeatureInfo}</li>
     * <li>{@linkplain javax.management.openmbean.OpenMBeanConstructorInfo#getName() interface
     * javax.management.openmbean.OpenMBeanConstructorInfo}</li>
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
    public default void test_getName()
    throws Exception {
    }

    /**
     * <p>
     * The method-under-test covered by this test method is inherited duplicatedly within the declaring
     * class-under-test:
     * </p>
     * <ul>
     * <li>{@linkplain javax.management.MBeanFeatureInfo#getDescription() class javax.management.MBeanFeatureInfo}</li>
     * <li>{@linkplain javax.management.openmbean.OpenMBeanConstructorInfo#getDescription() interface
     * javax.management.openmbean.OpenMBeanConstructorInfo}</li>
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
     * <li>{@linkplain javax.management.MBeanConstructorInfo#getSignature() class javax.management.MBeanConstructorInfo}
     * </li>
     * <li>{@linkplain javax.management.openmbean.OpenMBeanConstructorInfo#getSignature() interface
     * javax.management.openmbean.OpenMBeanConstructorInfo}</li>
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
    public default void test_getSignature()
    throws Exception {
    }

}
