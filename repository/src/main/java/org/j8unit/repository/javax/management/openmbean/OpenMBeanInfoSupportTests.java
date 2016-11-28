package org.j8unit.repository.javax.management.openmbean;

import javax.management.openmbean.OpenMBeanInfoSupport;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.j8unit.repository.javax.management.MBeanInfoTests;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects &ndash;&nbsp;i.&thinsp;e., test methods
 * targeting the non-{@code static} behaviour&nbsp;&ndash; of the hereby targeted type-under-test
 * {@link OpenMBeanInfoSupport public class javax.management.openmbean.OpenMBeanInfoSupport}.
 * </p>
 *
 * <p>
 * j8unit strongly encourages you to not only test the instances behaviour but also to test the type constraints. For
 * this purpose, j8unit also provides a complementary test interface containing the class/type relevant aspects (see
 * {@link org.j8unit.repository.javax.management.openmbean.OpenMBeanInfoSupportClassTests}).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface OpenMBeanInfoSupportTests<SUT extends OpenMBeanInfoSupport>
extends OpenMBeanInfoTests<SUT>, MBeanInfoTests<SUT> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.management.openmbean.OpenMBeanInfoSupport]

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link javax.management.openmbean.OpenMBeanInfoSupport#toString() public java.lang.String
     * javax.management.openmbean.OpenMBeanInfoSupport.toString()}.
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
     * {@link javax.management.openmbean.OpenMBeanInfoSupport#equals(Object) public boolean
     * javax.management.openmbean.OpenMBeanInfoSupport.equals(java.lang.Object)}.
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
     * {@link javax.management.openmbean.OpenMBeanInfoSupport#hashCode() public int
     * javax.management.openmbean.OpenMBeanInfoSupport.hashCode()}.
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
     * <li>{@link javax.management.MBeanInfo#getDescription() class javax.management.MBeanInfo}</li>
     * <li>{@link javax.management.openmbean.OpenMBeanInfo#getDescription() interface
     * javax.management.openmbean.OpenMBeanInfo}</li>
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
        MBeanInfoTests.super.test_getDescription();
        OpenMBeanInfoTests.super.test_getDescription();
    }

    /**
     * <p>
     * The method-under-test covered by this test method is inherited duplicatedly within the declaring
     * class-under-test:
     * </p>
     * <ul>
     * <li>{@link javax.management.MBeanInfo#getNotifications() class javax.management.MBeanInfo}</li>
     * <li>{@link javax.management.openmbean.OpenMBeanInfo#getNotifications() interface
     * javax.management.openmbean.OpenMBeanInfo}</li>
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
    public default void test_getNotifications()
    throws Exception {
        MBeanInfoTests.super.test_getNotifications();
        OpenMBeanInfoTests.super.test_getNotifications();
    }

    /**
     * <p>
     * The method-under-test covered by this test method is inherited duplicatedly within the declaring
     * class-under-test:
     * </p>
     * <ul>
     * <li>{@link javax.management.MBeanInfo#getAttributes() class javax.management.MBeanInfo}</li>
     * <li>{@link javax.management.openmbean.OpenMBeanInfo#getAttributes() interface
     * javax.management.openmbean.OpenMBeanInfo}</li>
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
    public default void test_getAttributes()
    throws Exception {
        MBeanInfoTests.super.test_getAttributes();
        OpenMBeanInfoTests.super.test_getAttributes();
    }

    /**
     * <p>
     * The method-under-test covered by this test method is inherited duplicatedly within the declaring
     * class-under-test:
     * </p>
     * <ul>
     * <li>{@link javax.management.MBeanInfo#getOperations() class javax.management.MBeanInfo}</li>
     * <li>{@link javax.management.openmbean.OpenMBeanInfo#getOperations() interface
     * javax.management.openmbean.OpenMBeanInfo}</li>
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
    public default void test_getOperations()
    throws Exception {
        MBeanInfoTests.super.test_getOperations();
        OpenMBeanInfoTests.super.test_getOperations();
    }

    /**
     * <p>
     * The method-under-test covered by this test method is inherited duplicatedly within the declaring
     * class-under-test:
     * </p>
     * <ul>
     * <li>{@link javax.management.MBeanInfo#getClassName() class javax.management.MBeanInfo}</li>
     * <li>{@link javax.management.openmbean.OpenMBeanInfo#getClassName() interface
     * javax.management.openmbean.OpenMBeanInfo}</li>
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
    public default void test_getClassName()
    throws Exception {
        MBeanInfoTests.super.test_getClassName();
        OpenMBeanInfoTests.super.test_getClassName();
    }

    /**
     * <p>
     * The method-under-test covered by this test method is inherited duplicatedly within the declaring
     * class-under-test:
     * </p>
     * <ul>
     * <li>{@link javax.management.MBeanInfo#getConstructors() class javax.management.MBeanInfo}</li>
     * <li>{@link javax.management.openmbean.OpenMBeanInfo#getConstructors() interface
     * javax.management.openmbean.OpenMBeanInfo}</li>
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
    public default void test_getConstructors()
    throws Exception {
        MBeanInfoTests.super.test_getConstructors();
        OpenMBeanInfoTests.super.test_getConstructors();
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.management.openmbean.OpenMBeanInfoSupport]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.management.openmbean.OpenMBeanInfoSupport]

}
