package org.j8unit.repository.javax.swing.text.html;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.swing.text.html.FormSubmitEvent class javax.swing.text.html.FormSubmitEvent}, containing
 * all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.swing.text.html.FormSubmitEventClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface FormSubmitEventTests<SUT extends javax.swing.text.html.FormSubmitEvent>
extends org.j8unit.repository.javax.swing.text.html.HTMLFrameHyperlinkEventTests<SUT> {

    /**
     * <p>
     * Test class for {@link javax.swing.text.html.FormSubmitEvent$MethodType class
     * javax.swing.text.html.FormSubmitEvent$MethodType}, containing all instance relevant test methods (i.&thinsp;e.,
     * test methods of non-{@code static} methods).
     * </p>
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     * @see org.j8unit.repository.javax.swing.text.html.FormSubmitEventClassTests.MethodTypeClassTests
     */
    @Category(J8UnitRepository.class)
    public static abstract interface MethodTypeTests<SUT extends javax.swing.text.html.FormSubmitEvent.MethodType>
    extends org.j8unit.repository.java.lang.EnumTests<SUT, javax.swing.text.html.FormSubmitEvent.MethodType> {

    }

    /**
     * <p>
     * Test method for {@link javax.swing.text.html.FormSubmitEvent#getData() public java.lang.String
     * javax.swing.text.html.FormSubmitEvent.getData()}.
     * </p>
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
     * Test method for {@link javax.swing.text.html.FormSubmitEvent#getMethod() public
     * javax.swing.text.html.FormSubmitEvent$MethodType javax.swing.text.html.FormSubmitEvent.getMethod()}.
     * </p>
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

}
