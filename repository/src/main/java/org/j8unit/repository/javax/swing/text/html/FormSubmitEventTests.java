package org.j8unit.repository.javax.swing.text.html;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.swing.text.html.FormSubmitEvent class
 * javax.swing.text.html.FormSubmitEvent}. The complementary j8unit test interface containing the class relevant aspects
 * is {@link FormSubmitEventClassTests}.
 * </p>
 *
 * @see javax.swing.text.html.FormSubmitEvent class javax.swing.text.html.FormSubmitEvent (the hereby targeted
 *      class-under-test class)
 * @see FormSubmitEventClassTests FormSubmitEventClassTests (the complementary j8unit test interface containing the
 *      class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface FormSubmitEventTests<SUT extends javax.swing.text.html.FormSubmitEvent>
extends HTMLFrameHyperlinkEventTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.swing.text.html.FormSubmitEvent#getMethod() public
     * javax.swing.text.html.FormSubmitEvent$MethodType javax.swing.text.html.FormSubmitEvent.getMethod()}.
     *
     * <p>
     * Test method for {@link javax.swing.text.html.FormSubmitEvent#getMethod() public
     * javax.swing.text.html.FormSubmitEvent$MethodType javax.swing.text.html.FormSubmitEvent.getMethod()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.text.html.FormSubmitEvent#getMethod() public javax.swing.text.html.FormSubmitEvent$MethodType
     *      javax.swing.text.html.FormSubmitEvent.getMethod() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getMethod()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.text.html.FormSubmitEvent#getData() public java.lang.String
     * javax.swing.text.html.FormSubmitEvent.getData()}.
     *
     * <p>
     * Test method for {@link javax.swing.text.html.FormSubmitEvent#getData() public java.lang.String
     * javax.swing.text.html.FormSubmitEvent.getData()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.text.html.FormSubmitEvent#getData() public java.lang.String
     *      javax.swing.text.html.FormSubmitEvent.getData() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getData()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
     * non-{@code static} methods) of {@linkplain javax.swing.text.html.FormSubmitEvent.MethodType class
     * javax.swing.text.html.FormSubmitEvent$MethodType}. The complementary j8unit test interface containing the class
     * relevant aspects is {@link FormSubmitEventClassTests.MethodTypeClassTests}.
     * </p>
     *
     * @see javax.swing.text.html.FormSubmitEvent.MethodType class javax.swing.text.html.FormSubmitEvent$MethodType (the
     *      hereby targeted class-under-test class)
     * @see FormSubmitEventClassTests.MethodTypeClassTests FormSubmitEventClassTests.MethodTypeClassTests (the
     *      complementary j8unit test interface containing the class relevant test methods)
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface MethodTypeTests<SUT extends javax.swing.text.html.FormSubmitEvent.MethodType>
    extends org.j8unit.repository.java.lang.EnumTests<SUT, javax.swing.text.html.FormSubmitEvent.MethodType> {

    }

}
