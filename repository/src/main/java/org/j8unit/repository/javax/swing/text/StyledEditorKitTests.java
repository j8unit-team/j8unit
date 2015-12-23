package org.j8unit.repository.javax.swing.text;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain javax.swing.text.StyledEditorKit class
 * javax.swing.text.StyledEditorKit}, containing all instance relevant test methods (i.&thinsp;e., test methods of non-
 * {@code static} methods). The counterpart J8Unit test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.javax.swing.text.StyledEditorKitTests}.
 * </p>
 *
 * @see org.j8unit.repository.javax.swing.text.StyledEditorKitClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim javax.swing.text.StyledEditorKit
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface StyledEditorKitTests<SUT extends javax.swing.text.StyledEditorKit>
extends org.j8unit.repository.javax.swing.text.DefaultEditorKitTests<SUT> {

    /**
     * <p>
     * Reusable J8Unit test interface for {@linkplain javax.swing.text.StyledEditorKit.AlignmentAction class
     * javax.swing.text.StyledEditorKit$AlignmentAction}, containing all instance relevant test methods (i.&thinsp;e.,
     * test methods of non-{@code static} methods). The counterpart J8Unit test interface containing the class relevant
     * test methods is {@link org.j8unit.repository.javax.swing.text.StyledEditorKitTests.AlignmentActionTests}.
     * </p>
     *
     * @see org.j8unit.repository.javax.swing.text.StyledEditorKitClassTests.AlignmentActionClassTests
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     *
     * @j8unit.aim javax.swing.text.StyledEditorKit.AlignmentAction
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface AlignmentActionTests<SUT extends javax.swing.text.StyledEditorKit.AlignmentAction>
    extends org.j8unit.repository.javax.swing.text.StyledEditorKitTests.StyledTextActionTests<SUT> {

        /**
         * <p>
         * Test method for
         * {@link javax.swing.text.StyledEditorKit.AlignmentAction#actionPerformed(java.awt.event.ActionEvent) public
         * void javax.swing.text.StyledEditorKit$AlignmentAction.actionPerformed(java.awt.event.ActionEvent)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim javax.swing.text.StyledEditorKit.AlignmentAction#actionPerformed(java.awt.event.ActionEvent)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        @Override
        public default void test_actionPerformed_ActionEvent()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

    }

    /**
     * <p>
     * Reusable J8Unit test interface for {@linkplain javax.swing.text.StyledEditorKit.BoldAction class
     * javax.swing.text.StyledEditorKit$BoldAction}, containing all instance relevant test methods (i.&thinsp;e., test
     * methods of non-{@code static} methods). The counterpart J8Unit test interface containing the class relevant test
     * methods is {@link org.j8unit.repository.javax.swing.text.StyledEditorKitTests.BoldActionTests}.
     * </p>
     *
     * @see org.j8unit.repository.javax.swing.text.StyledEditorKitClassTests.BoldActionClassTests
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     *
     * @j8unit.aim javax.swing.text.StyledEditorKit.BoldAction
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface BoldActionTests<SUT extends javax.swing.text.StyledEditorKit.BoldAction>
    extends org.j8unit.repository.javax.swing.text.StyledEditorKitTests.StyledTextActionTests<SUT> {

        /**
         * <p>
         * Test method for
         * {@link javax.swing.text.StyledEditorKit.BoldAction#actionPerformed(java.awt.event.ActionEvent) public void
         * javax.swing.text.StyledEditorKit$BoldAction.actionPerformed(java.awt.event.ActionEvent)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim javax.swing.text.StyledEditorKit.BoldAction#actionPerformed(java.awt.event.ActionEvent)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        @Override
        public default void test_actionPerformed_ActionEvent()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

    }

    /**
     * <p>
     * Reusable J8Unit test interface for {@linkplain javax.swing.text.StyledEditorKit.FontFamilyAction class
     * javax.swing.text.StyledEditorKit$FontFamilyAction}, containing all instance relevant test methods (i.&thinsp;e.,
     * test methods of non-{@code static} methods). The counterpart J8Unit test interface containing the class relevant
     * test methods is {@link org.j8unit.repository.javax.swing.text.StyledEditorKitTests.FontFamilyActionTests}.
     * </p>
     *
     * @see org.j8unit.repository.javax.swing.text.StyledEditorKitClassTests.FontFamilyActionClassTests
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     *
     * @j8unit.aim javax.swing.text.StyledEditorKit.FontFamilyAction
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface FontFamilyActionTests<SUT extends javax.swing.text.StyledEditorKit.FontFamilyAction>
    extends org.j8unit.repository.javax.swing.text.StyledEditorKitTests.StyledTextActionTests<SUT> {

        /**
         * <p>
         * Test method for
         * {@link javax.swing.text.StyledEditorKit.FontFamilyAction#actionPerformed(java.awt.event.ActionEvent) public
         * void javax.swing.text.StyledEditorKit$FontFamilyAction.actionPerformed(java.awt.event.ActionEvent)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim javax.swing.text.StyledEditorKit.FontFamilyAction#actionPerformed(java.awt.event.ActionEvent)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        @Override
        public default void test_actionPerformed_ActionEvent()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

    }

    /**
     * <p>
     * Reusable J8Unit test interface for {@linkplain javax.swing.text.StyledEditorKit.FontSizeAction class
     * javax.swing.text.StyledEditorKit$FontSizeAction}, containing all instance relevant test methods (i.&thinsp;e.,
     * test methods of non-{@code static} methods). The counterpart J8Unit test interface containing the class relevant
     * test methods is {@link org.j8unit.repository.javax.swing.text.StyledEditorKitTests.FontSizeActionTests}.
     * </p>
     *
     * @see org.j8unit.repository.javax.swing.text.StyledEditorKitClassTests.FontSizeActionClassTests
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     *
     * @j8unit.aim javax.swing.text.StyledEditorKit.FontSizeAction
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface FontSizeActionTests<SUT extends javax.swing.text.StyledEditorKit.FontSizeAction>
    extends org.j8unit.repository.javax.swing.text.StyledEditorKitTests.StyledTextActionTests<SUT> {

        /**
         * <p>
         * Test method for
         * {@link javax.swing.text.StyledEditorKit.FontSizeAction#actionPerformed(java.awt.event.ActionEvent) public
         * void javax.swing.text.StyledEditorKit$FontSizeAction.actionPerformed(java.awt.event.ActionEvent)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim javax.swing.text.StyledEditorKit.FontSizeAction#actionPerformed(java.awt.event.ActionEvent)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        @Override
        public default void test_actionPerformed_ActionEvent()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

    }

    /**
     * <p>
     * Reusable J8Unit test interface for {@linkplain javax.swing.text.StyledEditorKit.ForegroundAction class
     * javax.swing.text.StyledEditorKit$ForegroundAction}, containing all instance relevant test methods (i.&thinsp;e.,
     * test methods of non-{@code static} methods). The counterpart J8Unit test interface containing the class relevant
     * test methods is {@link org.j8unit.repository.javax.swing.text.StyledEditorKitTests.ForegroundActionTests}.
     * </p>
     *
     * @see org.j8unit.repository.javax.swing.text.StyledEditorKitClassTests.ForegroundActionClassTests
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     *
     * @j8unit.aim javax.swing.text.StyledEditorKit.ForegroundAction
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface ForegroundActionTests<SUT extends javax.swing.text.StyledEditorKit.ForegroundAction>
    extends org.j8unit.repository.javax.swing.text.StyledEditorKitTests.StyledTextActionTests<SUT> {

        /**
         * <p>
         * Test method for
         * {@link javax.swing.text.StyledEditorKit.ForegroundAction#actionPerformed(java.awt.event.ActionEvent) public
         * void javax.swing.text.StyledEditorKit$ForegroundAction.actionPerformed(java.awt.event.ActionEvent)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim javax.swing.text.StyledEditorKit.ForegroundAction#actionPerformed(java.awt.event.ActionEvent)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        @Override
        public default void test_actionPerformed_ActionEvent()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

    }

    /**
     * <p>
     * Reusable J8Unit test interface for {@linkplain javax.swing.text.StyledEditorKit.ItalicAction class
     * javax.swing.text.StyledEditorKit$ItalicAction}, containing all instance relevant test methods (i.&thinsp;e., test
     * methods of non-{@code static} methods). The counterpart J8Unit test interface containing the class relevant test
     * methods is {@link org.j8unit.repository.javax.swing.text.StyledEditorKitTests.ItalicActionTests}.
     * </p>
     *
     * @see org.j8unit.repository.javax.swing.text.StyledEditorKitClassTests.ItalicActionClassTests
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     *
     * @j8unit.aim javax.swing.text.StyledEditorKit.ItalicAction
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface ItalicActionTests<SUT extends javax.swing.text.StyledEditorKit.ItalicAction>
    extends org.j8unit.repository.javax.swing.text.StyledEditorKitTests.StyledTextActionTests<SUT> {

        /**
         * <p>
         * Test method for
         * {@link javax.swing.text.StyledEditorKit.ItalicAction#actionPerformed(java.awt.event.ActionEvent) public void
         * javax.swing.text.StyledEditorKit$ItalicAction.actionPerformed(java.awt.event.ActionEvent)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim javax.swing.text.StyledEditorKit.ItalicAction#actionPerformed(java.awt.event.ActionEvent)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        @Override
        public default void test_actionPerformed_ActionEvent()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

    }

    /**
     * <p>
     * Reusable J8Unit test interface for {@linkplain javax.swing.text.StyledEditorKit.StyledTextAction class
     * javax.swing.text.StyledEditorKit$StyledTextAction}, containing all instance relevant test methods (i.&thinsp;e.,
     * test methods of non-{@code static} methods). The counterpart J8Unit test interface containing the class relevant
     * test methods is {@link org.j8unit.repository.javax.swing.text.StyledEditorKitTests.StyledTextActionTests}.
     * </p>
     *
     * @see org.j8unit.repository.javax.swing.text.StyledEditorKitClassTests.StyledTextActionClassTests
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     *
     * @j8unit.aim javax.swing.text.StyledEditorKit.StyledTextAction
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface StyledTextActionTests<SUT extends javax.swing.text.StyledEditorKit.StyledTextAction>
    extends org.j8unit.repository.javax.swing.text.TextActionTests<SUT> {

    }

    /**
     * <p>
     * Reusable J8Unit test interface for {@linkplain javax.swing.text.StyledEditorKit.UnderlineAction class
     * javax.swing.text.StyledEditorKit$UnderlineAction}, containing all instance relevant test methods (i.&thinsp;e.,
     * test methods of non-{@code static} methods). The counterpart J8Unit test interface containing the class relevant
     * test methods is {@link org.j8unit.repository.javax.swing.text.StyledEditorKitTests.UnderlineActionTests}.
     * </p>
     *
     * @see org.j8unit.repository.javax.swing.text.StyledEditorKitClassTests.UnderlineActionClassTests
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     *
     * @j8unit.aim javax.swing.text.StyledEditorKit.UnderlineAction
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface UnderlineActionTests<SUT extends javax.swing.text.StyledEditorKit.UnderlineAction>
    extends org.j8unit.repository.javax.swing.text.StyledEditorKitTests.StyledTextActionTests<SUT> {

        /**
         * <p>
         * Test method for
         * {@link javax.swing.text.StyledEditorKit.UnderlineAction#actionPerformed(java.awt.event.ActionEvent) public
         * void javax.swing.text.StyledEditorKit$UnderlineAction.actionPerformed(java.awt.event.ActionEvent)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim javax.swing.text.StyledEditorKit.UnderlineAction#actionPerformed(java.awt.event.ActionEvent)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        @Override
        public default void test_actionPerformed_ActionEvent()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

    }

    /**
     * <p>
     * Test method for {@link javax.swing.text.StyledEditorKit#clone() public java.lang.Object
     * javax.swing.text.StyledEditorKit.clone()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.swing.text.StyledEditorKit#clone()
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_clone()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.text.StyledEditorKit#createDefaultDocument() public javax.swing.text.Document
     * javax.swing.text.StyledEditorKit.createDefaultDocument()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.swing.text.StyledEditorKit#createDefaultDocument()
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_createDefaultDocument()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.text.StyledEditorKit#deinstall(javax.swing.JEditorPane) public void
     * javax.swing.text.StyledEditorKit.deinstall(javax.swing.JEditorPane)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.swing.text.StyledEditorKit#deinstall(javax.swing.JEditorPane)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_deinstall_JEditorPane()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.text.StyledEditorKit#getActions() public javax.swing.Action[]
     * javax.swing.text.StyledEditorKit.getActions()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.swing.text.StyledEditorKit#getActions()
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_getActions()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.text.StyledEditorKit#getCharacterAttributeRun() public
     * javax.swing.text.Element javax.swing.text.StyledEditorKit.getCharacterAttributeRun()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.swing.text.StyledEditorKit#getCharacterAttributeRun()
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getCharacterAttributeRun()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.text.StyledEditorKit#getInputAttributes() public
     * javax.swing.text.MutableAttributeSet javax.swing.text.StyledEditorKit.getInputAttributes()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.swing.text.StyledEditorKit#getInputAttributes()
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getInputAttributes()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.text.StyledEditorKit#getViewFactory() public javax.swing.text.ViewFactory
     * javax.swing.text.StyledEditorKit.getViewFactory()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.swing.text.StyledEditorKit#getViewFactory()
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_getViewFactory()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.text.StyledEditorKit#install(javax.swing.JEditorPane) public void
     * javax.swing.text.StyledEditorKit.install(javax.swing.JEditorPane)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.swing.text.StyledEditorKit#install(javax.swing.JEditorPane)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_install_JEditorPane()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
