package org.j8unit.repository.java.awt.im.spi;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link java.awt.im.spi.InputMethodContext interface java.awt.im.spi.InputMethodContext}, containing
 * all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.java.awt.im.spi.InputMethodContextClassTests
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface InputMethodContextTests<SUT extends java.awt.im.spi.InputMethodContext>
extends org.j8unit.repository.java.awt.im.InputMethodRequestsTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.awt.im.spi.InputMethodContext#createInputMethodJFrame(java.lang.String,boolean)
     * public abstract javax.swing.JFrame
     * java.awt.im.spi.InputMethodContext.createInputMethodJFrame(java.lang.String,boolean)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_createInputMethodJFrame_String_boolean()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.awt.im.spi.InputMethodContext#createInputMethodWindow(java.lang.String,boolean)
     * public abstract java.awt.Window
     * java.awt.im.spi.InputMethodContext.createInputMethodWindow(java.lang.String,boolean)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_createInputMethodWindow_String_boolean()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.awt.im.spi.InputMethodContext#dispatchInputMethodEvent(int,java.text.AttributedCharacterIterator,int,java.awt.font.TextHitInfo,java.awt.font.TextHitInfo)
     * public abstract void
     * java.awt.im.spi.InputMethodContext.dispatchInputMethodEvent(int,java.text.AttributedCharacterIterator,int,java.awt.font.TextHitInfo,java.awt.font.TextHitInfo)}
     * .
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_dispatchInputMethodEvent_int_AttributedCharacterIterator_int_TextHitInfo_TextHitInfo()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.awt.im.spi.InputMethodContext#enableClientWindowNotification(java.awt.im.spi.InputMethod,boolean)
     * public abstract void
     * java.awt.im.spi.InputMethodContext.enableClientWindowNotification(java.awt.im.spi.InputMethod,boolean)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_enableClientWindowNotification_InputMethod_boolean()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
