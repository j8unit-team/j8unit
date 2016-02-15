package org.j8unit.repository.java.awt.im.spi;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.awt.im.spi.InputMethodContext interface
 * java.awt.im.spi.InputMethodContext}. The complementary j8unit test interface containing the class relevant aspects is
 * {@link InputMethodContextClassTests}.
 * </p>
 *
 * @see java.awt.im.spi.InputMethodContext interface java.awt.im.spi.InputMethodContext (the hereby targeted
 *      class-under-test class)
 * @see InputMethodContextClassTests InputMethodContextClassTests (the complementary j8unit test interface containing
 *      the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface InputMethodContextTests<SUT extends java.awt.im.spi.InputMethodContext>
extends org.j8unit.repository.java.awt.im.InputMethodRequestsTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.awt.im.spi.InputMethodContext#createInputMethodWindow(String, boolean) public
     * abstract java.awt.Window java.awt.im.spi.InputMethodContext.createInputMethodWindow(java.lang.String,boolean)}.
     *
     * <p>
     * Test method for {@link java.awt.im.spi.InputMethodContext#createInputMethodWindow(String, boolean) public
     * abstract java.awt.Window java.awt.im.spi.InputMethodContext.createInputMethodWindow(java.lang.String,boolean)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.awt.im.spi.InputMethodContext#createInputMethodWindow(String, boolean) public abstract java.awt.Window
     *      java.awt.im.spi.InputMethodContext.createInputMethodWindow(java.lang.String,boolean) (the hereby targeted
     *      method-under-test)
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
     * {@link java.awt.im.spi.InputMethodContext#dispatchInputMethodEvent(int, java.text.AttributedCharacterIterator, int, java.awt.font.TextHitInfo, java.awt.font.TextHitInfo)
     * public abstract void
     * java.awt.im.spi.InputMethodContext.dispatchInputMethodEvent(int,java.text.AttributedCharacterIterator,int,java.awt.font.TextHitInfo,java.awt.font.TextHitInfo)}
     * .
     *
     * <p>
     * Test method for
     * {@link java.awt.im.spi.InputMethodContext#dispatchInputMethodEvent(int, java.text.AttributedCharacterIterator, int, java.awt.font.TextHitInfo, java.awt.font.TextHitInfo)
     * public abstract void
     * java.awt.im.spi.InputMethodContext.dispatchInputMethodEvent(int,java.text.AttributedCharacterIterator,int,java.awt.font.TextHitInfo,java.awt.font.TextHitInfo)}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.awt.im.spi.InputMethodContext#dispatchInputMethodEvent(int, java.text.AttributedCharacterIterator, int,
     *      java.awt.font.TextHitInfo, java.awt.font.TextHitInfo) public abstract void
     *      java.awt.im.spi.InputMethodContext.dispatchInputMethodEvent(int,java.text.AttributedCharacterIterator,int,
     *      java.awt.font.TextHitInfo,java.awt.font.TextHitInfo) (the hereby targeted method-under-test)
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
     * Test method for {@link java.awt.im.spi.InputMethodContext#createInputMethodJFrame(String, boolean) public
     * abstract javax.swing.JFrame java.awt.im.spi.InputMethodContext.createInputMethodJFrame(java.lang.String,boolean)}
     * .
     *
     * <p>
     * Test method for {@link java.awt.im.spi.InputMethodContext#createInputMethodJFrame(String, boolean) public
     * abstract javax.swing.JFrame java.awt.im.spi.InputMethodContext.createInputMethodJFrame(java.lang.String,boolean)}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.awt.im.spi.InputMethodContext#createInputMethodJFrame(String, boolean) public abstract
     *      javax.swing.JFrame java.awt.im.spi.InputMethodContext.createInputMethodJFrame(java.lang.String,boolean) (the
     *      hereby targeted method-under-test)
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
     * Test method for
     * {@link java.awt.im.spi.InputMethodContext#enableClientWindowNotification(java.awt.im.spi.InputMethod, boolean)
     * public abstract void
     * java.awt.im.spi.InputMethodContext.enableClientWindowNotification(java.awt.im.spi.InputMethod,boolean)}.
     *
     * <p>
     * Test method for
     * {@link java.awt.im.spi.InputMethodContext#enableClientWindowNotification(java.awt.im.spi.InputMethod, boolean)
     * public abstract void
     * java.awt.im.spi.InputMethodContext.enableClientWindowNotification(java.awt.im.spi.InputMethod,boolean)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.awt.im.spi.InputMethodContext#enableClientWindowNotification(java.awt.im.spi.InputMethod, boolean)
     *      public abstract void
     *      java.awt.im.spi.InputMethodContext.enableClientWindowNotification(java.awt.im.spi.InputMethod,boolean) (the
     *      hereby targeted method-under-test)
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
