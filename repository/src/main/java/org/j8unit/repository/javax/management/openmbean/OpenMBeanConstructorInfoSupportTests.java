package org.j8unit.repository.javax.management.openmbean;

import javax.management.MBeanConstructorInfo;
import javax.management.openmbean.OpenMBeanConstructorInfoSupport;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.j8unit.repository.javax.management.MBeanConstructorInfoTests;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects &ndash;&nbsp;i.&thinsp;e., test methods
 * targeting the non-{@code static} behaviour&nbsp;&ndash; of the hereby targeted type-under-test
 * {@link OpenMBeanConstructorInfoSupport public class javax.management.openmbean.OpenMBeanConstructorInfoSupport}.
 * </p>
 *
 * <p>
 * j8unit strongly encourages you to not only test the instances behaviour but also to test the type constraints. For
 * this purpose, j8unit also provides a complementary test interface containing the class/type relevant aspects (see
 * {@link org.j8unit.repository.javax.management.openmbean.OpenMBeanConstructorInfoSupportClassTests}).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */

@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface OpenMBeanConstructorInfoSupportTests<SUT extends OpenMBeanConstructorInfoSupport>
extends OpenMBeanConstructorInfoTests<SUT>, MBeanConstructorInfoTests<SUT> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.management.openmbean.OpenMBeanConstructorInfoSupport]

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link javax.management.openmbean.OpenMBeanConstructorInfoSupport#toString() public java.lang.String
     * javax.management.openmbean.OpenMBeanConstructorInfoSupport.toString()}.
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
     * {@link javax.management.openmbean.OpenMBeanConstructorInfoSupport#equals(Object) public boolean
     * javax.management.openmbean.OpenMBeanConstructorInfoSupport.equals(java.lang.Object)}.
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
     * Test method for the hereby targeted method-under-test
     * {@link javax.management.openmbean.OpenMBeanConstructorInfoSupport#hashCode() public int
     * javax.management.openmbean.OpenMBeanConstructorInfoSupport.hashCode()}.
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
     * The method-under-test covered by this test method is inherited duplicatedly within the declaring
     * class-under-test:
     * </p>
     * <ul>
     * <li>{@link javax.management.openmbean.OpenMBeanConstructorInfo#getName() interface
     * javax.management.openmbean.OpenMBeanConstructorInfo}</li>
     * <li>{@link javax.management.MBeanFeatureInfo#getName() class javax.management.MBeanFeatureInfo} (via parent
     * node(s) {@link MBeanConstructorInfo MBeanConstructorInfo})</li>
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
        OpenMBeanConstructorInfoTests.super.test_getName();
        MBeanConstructorInfoTests.super.test_getName();
    }

    /**
     * <p>
     * The method-under-test covered by this test method is inherited duplicatedly within the declaring
     * class-under-test:
     * </p>
     * <ul>
     * <li>{@link javax.management.openmbean.OpenMBeanConstructorInfo#getDescription() interface
     * javax.management.openmbean.OpenMBeanConstructorInfo}</li>
     * <li>{@link javax.management.MBeanFeatureInfo#getDescription() class javax.management.MBeanFeatureInfo} (via
     * parent node(s) {@link MBeanConstructorInfo MBeanConstructorInfo})</li>
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
        OpenMBeanConstructorInfoTests.super.test_getDescription();
        MBeanConstructorInfoTests.super.test_getDescription();
    }

    /**
     * <p>
     * The method-under-test covered by this test method is inherited duplicatedly within the declaring
     * class-under-test:
     * </p>
     * <ul>
     * <li>{@link javax.management.MBeanConstructorInfo#getSignature() class javax.management.MBeanConstructorInfo}</li>
     * <li>{@link javax.management.openmbean.OpenMBeanConstructorInfo#getSignature() interface
     * javax.management.openmbean.OpenMBeanConstructorInfo}</li>
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
        MBeanConstructorInfoTests.super.test_getSignature();
        OpenMBeanConstructorInfoTests.super.test_getSignature();
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.management.openmbean.OpenMBeanConstructorInfoSupport]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.management.openmbean.OpenMBeanConstructorInfoSupport]

}
