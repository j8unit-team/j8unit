package org.j8unit.repository.javax.management.openmbean;

import javax.management.MBeanOperationInfo;
import javax.management.openmbean.OpenMBeanOperationInfoSupport;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects &ndash;&nbsp;i.&thinsp;e., test methods
 * targeting the non-{@code static} behaviour&nbsp;&ndash; of the hereby targeted type-under-test
 * {@link OpenMBeanOperationInfoSupport public class javax.management.openmbean.OpenMBeanOperationInfoSupport}.
 * </p>
 *
 * <p>
 * j8unit strongly encourages you to not only test the instances behaviour but also to test the type constraints. For
 * this purpose, j8unit also provides a complementary test interface containing the class/type relevant aspects (see
 * {@link org.j8unit.repository.javax.management.openmbean.OpenMBeanOperationInfoSupportClassTests}).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */

@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface OpenMBeanOperationInfoSupportTests<SUT extends OpenMBeanOperationInfoSupport>
extends org.j8unit.repository.javax.management.openmbean.OpenMBeanOperationInfoTests<SUT>, org.j8unit.repository.javax.management.MBeanOperationInfoTests<SUT> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.management.openmbean.OpenMBeanOperationInfoSupport]

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link javax.management.openmbean.OpenMBeanOperationInfoSupport#toString() public java.lang.String
     * javax.management.openmbean.OpenMBeanOperationInfoSupport.toString()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
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
     * Test method for the hereby targeted method-under-test
     * {@link javax.management.openmbean.OpenMBeanOperationInfoSupport#getReturnOpenType() public
     * javax.management.openmbean.OpenType<?>
     * javax.management.openmbean.OpenMBeanOperationInfoSupport.getReturnOpenType()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getReturnOpenType()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link javax.management.openmbean.OpenMBeanOperationInfoSupport#hashCode() public int
     * javax.management.openmbean.OpenMBeanOperationInfoSupport.hashCode()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
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
     * Test method for the hereby targeted method-under-test
     * {@link javax.management.openmbean.OpenMBeanOperationInfoSupport#equals(Object) public boolean
     * javax.management.openmbean.OpenMBeanOperationInfoSupport.equals(java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
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
     * The method-under-test covered by this test method is inherited duplicatedly within the declaring
     * class-under-test:
     * </p>
     * <ul>
     * <li>{@link javax.management.MBeanOperationInfo#getSignature() class javax.management.MBeanOperationInfo}</li>
     * <li>{@link javax.management.openmbean.OpenMBeanOperationInfo#getSignature() interface
     * javax.management.openmbean.OpenMBeanOperationInfo}</li>
     * </ul>
     *
     * <p>
     * In result, there are duplicated according test methods within the parent test classes. To solve this
     * compiler-error situation, this method must be overridden. Dont't worry, there will be meaningful test methods
     * soon and, thus, overriding becomes unnecessary.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getSignature()
    throws Exception {
        org.j8unit.repository.javax.management.MBeanOperationInfoTests.super.test_getSignature();
        org.j8unit.repository.javax.management.openmbean.OpenMBeanOperationInfoTests.super.test_getSignature();
    }

    /**
     * <p>
     * The method-under-test covered by this test method is inherited duplicatedly within the declaring
     * class-under-test:
     * </p>
     * <ul>
     * <li>{@link javax.management.MBeanFeatureInfo#getName() class javax.management.MBeanFeatureInfo} (via parent
     * node(s) {@link MBeanOperationInfo MBeanOperationInfo})</li>
     * <li>{@link javax.management.openmbean.OpenMBeanOperationInfo#getName() interface
     * javax.management.openmbean.OpenMBeanOperationInfo}</li>
     * </ul>
     *
     * <p>
     * In result, there are duplicated according test methods within the parent test classes. To solve this
     * compiler-error situation, this method must be overridden. Dont't worry, there will be meaningful test methods
     * soon and, thus, overriding becomes unnecessary.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getName()
    throws Exception {
        org.j8unit.repository.javax.management.MBeanOperationInfoTests.super.test_getName();
        org.j8unit.repository.javax.management.openmbean.OpenMBeanOperationInfoTests.super.test_getName();
    }

    /**
     * <p>
     * The method-under-test covered by this test method is inherited duplicatedly within the declaring
     * class-under-test:
     * </p>
     * <ul>
     * <li>{@link javax.management.MBeanFeatureInfo#getDescription() class javax.management.MBeanFeatureInfo} (via
     * parent node(s) {@link MBeanOperationInfo MBeanOperationInfo})</li>
     * <li>{@link javax.management.openmbean.OpenMBeanOperationInfo#getDescription() interface
     * javax.management.openmbean.OpenMBeanOperationInfo}</li>
     * </ul>
     *
     * <p>
     * In result, there are duplicated according test methods within the parent test classes. To solve this
     * compiler-error situation, this method must be overridden. Dont't worry, there will be meaningful test methods
     * soon and, thus, overriding becomes unnecessary.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getDescription()
    throws Exception {
        org.j8unit.repository.javax.management.MBeanOperationInfoTests.super.test_getDescription();
        org.j8unit.repository.javax.management.openmbean.OpenMBeanOperationInfoTests.super.test_getDescription();
    }

    /**
     * <p>
     * The method-under-test covered by this test method is inherited duplicatedly within the declaring
     * class-under-test:
     * </p>
     * <ul>
     * <li>{@link javax.management.MBeanOperationInfo#getReturnType() class javax.management.MBeanOperationInfo}</li>
     * <li>{@link javax.management.openmbean.OpenMBeanOperationInfo#getReturnType() interface
     * javax.management.openmbean.OpenMBeanOperationInfo}</li>
     * </ul>
     *
     * <p>
     * In result, there are duplicated according test methods within the parent test classes. To solve this
     * compiler-error situation, this method must be overridden. Dont't worry, there will be meaningful test methods
     * soon and, thus, overriding becomes unnecessary.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getReturnType()
    throws Exception {
        org.j8unit.repository.javax.management.MBeanOperationInfoTests.super.test_getReturnType();
        org.j8unit.repository.javax.management.openmbean.OpenMBeanOperationInfoTests.super.test_getReturnType();
    }

    /**
     * <p>
     * The method-under-test covered by this test method is inherited duplicatedly within the declaring
     * class-under-test:
     * </p>
     * <ul>
     * <li>{@link javax.management.MBeanOperationInfo#getImpact() class javax.management.MBeanOperationInfo}</li>
     * <li>{@link javax.management.openmbean.OpenMBeanOperationInfo#getImpact() interface
     * javax.management.openmbean.OpenMBeanOperationInfo}</li>
     * </ul>
     *
     * <p>
     * In result, there are duplicated according test methods within the parent test classes. To solve this
     * compiler-error situation, this method must be overridden. Dont't worry, there will be meaningful test methods
     * soon and, thus, overriding becomes unnecessary.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getImpact()
    throws Exception {
        org.j8unit.repository.javax.management.MBeanOperationInfoTests.super.test_getImpact();
        org.j8unit.repository.javax.management.openmbean.OpenMBeanOperationInfoTests.super.test_getImpact();
    }

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.management.openmbean.OpenMBeanOperationInfoSupport]

}
