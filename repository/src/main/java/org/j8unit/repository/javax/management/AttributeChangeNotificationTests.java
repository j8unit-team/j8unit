package org.j8unit.repository.javax.management;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.management.AttributeChangeNotification class
 * javax.management.AttributeChangeNotification}. The complementary j8unit test interface containing the class relevant
 * aspects is {@link AttributeChangeNotificationClassTests}.
 * </p>
 *
 * @see javax.management.AttributeChangeNotification class javax.management.AttributeChangeNotification (the hereby
 *      targeted class-under-test class)
 * @see AttributeChangeNotificationClassTests AttributeChangeNotificationClassTests (the complementary j8unit test
 *      interface containing the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface AttributeChangeNotificationTests<SUT extends javax.management.AttributeChangeNotification>
extends NotificationTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.management.AttributeChangeNotification#getNewValue() public java.lang.Object
     * javax.management.AttributeChangeNotification.getNewValue()}.
     *
     * <p>
     * Test method for {@link javax.management.AttributeChangeNotification#getNewValue() public java.lang.Object
     * javax.management.AttributeChangeNotification.getNewValue()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.AttributeChangeNotification#getNewValue() public java.lang.Object
     *      javax.management.AttributeChangeNotification.getNewValue() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getNewValue()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.AttributeChangeNotification#getAttributeName() public java.lang.String
     * javax.management.AttributeChangeNotification.getAttributeName()}.
     *
     * <p>
     * Test method for {@link javax.management.AttributeChangeNotification#getAttributeName() public java.lang.String
     * javax.management.AttributeChangeNotification.getAttributeName()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.AttributeChangeNotification#getAttributeName() public java.lang.String
     *      javax.management.AttributeChangeNotification.getAttributeName() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getAttributeName()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.AttributeChangeNotification#getOldValue() public java.lang.Object
     * javax.management.AttributeChangeNotification.getOldValue()}.
     *
     * <p>
     * Test method for {@link javax.management.AttributeChangeNotification#getOldValue() public java.lang.Object
     * javax.management.AttributeChangeNotification.getOldValue()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.AttributeChangeNotification#getOldValue() public java.lang.Object
     *      javax.management.AttributeChangeNotification.getOldValue() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getOldValue()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.management.AttributeChangeNotification#getAttributeType() public java.lang.String
     * javax.management.AttributeChangeNotification.getAttributeType()}.
     *
     * <p>
     * Test method for {@link javax.management.AttributeChangeNotification#getAttributeType() public java.lang.String
     * javax.management.AttributeChangeNotification.getAttributeType()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.management.AttributeChangeNotification#getAttributeType() public java.lang.String
     *      javax.management.AttributeChangeNotification.getAttributeType() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getAttributeType()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
