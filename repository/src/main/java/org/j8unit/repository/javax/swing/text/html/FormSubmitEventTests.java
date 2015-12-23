package org.j8unit.repository.javax.swing.text.html;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain javax.swing.text.html.FormSubmitEvent class
 * javax.swing.text.html.FormSubmitEvent}, containing all instance relevant test methods (i.&thinsp;e., test methods of
 * non-{@code static} methods). The counterpart J8Unit test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.javax.swing.text.html.FormSubmitEventTests}.
 * </p>
 *
 * @see org.j8unit.repository.javax.swing.text.html.FormSubmitEventClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim javax.swing.text.html.FormSubmitEvent
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface FormSubmitEventTests<SUT extends javax.swing.text.html.FormSubmitEvent>
extends org.j8unit.repository.javax.swing.text.html.HTMLFrameHyperlinkEventTests<SUT> {

    /**
     * <p>
     * Reusable J8Unit test interface for {@linkplain javax.swing.text.html.FormSubmitEvent.MethodType class
     * javax.swing.text.html.FormSubmitEvent$MethodType}, containing all instance relevant test methods (i.&thinsp;e.,
     * test methods of non-{@code static} methods). The counterpart J8Unit test interface containing the class relevant
     * test methods is {@link org.j8unit.repository.javax.swing.text.html.FormSubmitEventTests.MethodTypeTests}.
     * </p>
     *
     * @see org.j8unit.repository.javax.swing.text.html.FormSubmitEventClassTests.MethodTypeClassTests
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     *
     * @j8unit.aim javax.swing.text.html.FormSubmitEvent.MethodType
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface MethodTypeTests<SUT extends javax.swing.text.html.FormSubmitEvent.MethodType>
    extends org.j8unit.repository.java.lang.EnumTests<SUT, javax.swing.text.html.FormSubmitEvent.MethodType> {

    }

    /**
     * <p>
     * Test method for {@link javax.swing.text.html.FormSubmitEvent#getData() public java.lang.String
     * javax.swing.text.html.FormSubmitEvent.getData()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.swing.text.html.FormSubmitEvent#getData()
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
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.swing.text.html.FormSubmitEvent#getMethod()
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
