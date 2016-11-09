package org.j8unit.repository.javax.swing.text;

import javax.swing.text.DefaultEditorKit;
import javax.swing.text.DefaultEditorKit.BeepAction;
import javax.swing.text.DefaultEditorKit.CopyAction;
import javax.swing.text.DefaultEditorKit.CutAction;
import javax.swing.text.DefaultEditorKit.DefaultKeyTypedAction;
import javax.swing.text.DefaultEditorKit.InsertBreakAction;
import javax.swing.text.DefaultEditorKit.InsertContentAction;
import javax.swing.text.DefaultEditorKit.InsertTabAction;
import javax.swing.text.DefaultEditorKit.PasteAction;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.j8unit.repository.javax.swing.text.DefaultEditorKitClassTests.BeepActionClassTests;
import org.j8unit.repository.javax.swing.text.DefaultEditorKitClassTests.CopyActionClassTests;
import org.j8unit.repository.javax.swing.text.DefaultEditorKitClassTests.CutActionClassTests;
import org.j8unit.repository.javax.swing.text.DefaultEditorKitClassTests.DefaultKeyTypedActionClassTests;
import org.j8unit.repository.javax.swing.text.DefaultEditorKitClassTests.InsertBreakActionClassTests;
import org.j8unit.repository.javax.swing.text.DefaultEditorKitClassTests.InsertContentActionClassTests;
import org.j8unit.repository.javax.swing.text.DefaultEditorKitClassTests.InsertTabActionClassTests;
import org.j8unit.repository.javax.swing.text.DefaultEditorKitClassTests.PasteActionClassTests;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects &ndash;&nbsp;i.&thinsp;e., test methods
 * targeting the non-{@code static} behaviour&nbsp;&ndash; of the hereby targeted type-under-test
 * {@link DefaultEditorKit public class javax.swing.text.DefaultEditorKit}.
 * </p>
 *
 * <p>
 * j8unit strongly encourages you to not only test the instances behaviour but also to test the type constraints. For
 * this purpose, j8unit also provides a complementary test interface containing the class/type relevant aspects (see
 * {@link DefaultEditorKitClassTests}).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */

@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface DefaultEditorKitTests<SUT extends DefaultEditorKit>
extends EditorKitTests<SUT> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.text.DefaultEditorKit]

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link javax.swing.text.DefaultEditorKit#createCaret()
     * public javax.swing.text.Caret javax.swing.text.DefaultEditorKit.createCaret()}.
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
    public default void test_createCaret()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link javax.swing.text.DefaultEditorKit#createDefaultDocument() public javax.swing.text.Document
     * javax.swing.text.DefaultEditorKit.createDefaultDocument()}.
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
    public default void test_createDefaultDocument()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link javax.swing.text.DefaultEditorKit#read(java.io.Reader, javax.swing.text.Document, int) public void
     * javax.swing.text.DefaultEditorKit.read(java.io.Reader,javax.swing.text.Document,int) throws
     * java.io.IOException,javax.swing.text.BadLocationException}.
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
    public default void test_read_Reader_Document_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link javax.swing.text.DefaultEditorKit#read(java.io.InputStream, javax.swing.text.Document, int) public void
     * javax.swing.text.DefaultEditorKit.read(java.io.InputStream,javax.swing.text.Document,int) throws
     * java.io.IOException,javax.swing.text.BadLocationException}.
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
    public default void test_read_InputStream_Document_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link javax.swing.text.DefaultEditorKit#getViewFactory()
     * public javax.swing.text.ViewFactory javax.swing.text.DefaultEditorKit.getViewFactory()}.
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
    public default void test_getViewFactory()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link javax.swing.text.DefaultEditorKit#write(java.io.Writer, javax.swing.text.Document, int, int) public void
     * javax.swing.text.DefaultEditorKit.write(java.io.Writer,javax.swing.text.Document,int,int) throws
     * java.io.IOException,javax.swing.text.BadLocationException}.
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
    public default void test_write_Writer_Document_int_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link javax.swing.text.DefaultEditorKit#write(java.io.OutputStream, javax.swing.text.Document, int, int) public
     * void javax.swing.text.DefaultEditorKit.write(java.io.OutputStream,javax.swing.text.Document,int,int) throws
     * java.io.IOException,javax.swing.text.BadLocationException}.
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
    public default void test_write_OutputStream_Document_int_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link javax.swing.text.DefaultEditorKit#getActions()
     * public javax.swing.Action[] javax.swing.text.DefaultEditorKit.getActions()}.
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
    public default void test_getActions()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link javax.swing.text.DefaultEditorKit#getContentType()
     * public java.lang.String javax.swing.text.DefaultEditorKit.getContentType()}.
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
    public default void test_getContentType()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.text.DefaultEditorKit]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.text.DefaultEditorKit]
    /**
     * <p>
     * Reusable j8unit test interface containing the instance relevant aspects &ndash;&nbsp;i.&thinsp;e., test methods
     * targeting the non-{@code static} behaviour&nbsp;&ndash; of the hereby targeted type-under-test {@link PasteAction
     * public static class javax.swing.text.DefaultEditorKit$PasteAction}.
     * </p>
     *
     * <p>
     * j8unit strongly encourages you to not only test the instances behaviour but also to test the type constraints.
     * For this purpose, j8unit also provides a complementary test interface containing the class/type relevant aspects
     * (see {@link PasteActionClassTests}).
     * </p>
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     */

    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface PasteActionTests<SUT extends PasteAction>
    extends TextActionTests<SUT> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.text.DefaultEditorKit$PasteAction]

        /**
         * <p>
         * Test method for the hereby targeted method-under-test
         * {@link javax.swing.text.DefaultEditorKit.PasteAction#actionPerformed(java.awt.event.ActionEvent) public void
         * javax.swing.text.DefaultEditorKit$PasteAction.actionPerformed(java.awt.event.ActionEvent)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @since 0.9.0
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Override
        @Test
        @Category(Draft.class)
        public default void test_actionPerformed_ActionEvent()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.text.DefaultEditorKit$PasteAction]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.text.DefaultEditorKit$PasteAction]
    }

    /**
     * <p>
     * Reusable j8unit test interface containing the instance relevant aspects &ndash;&nbsp;i.&thinsp;e., test methods
     * targeting the non-{@code static} behaviour&nbsp;&ndash; of the hereby targeted type-under-test
     * {@link InsertContentAction public static class javax.swing.text.DefaultEditorKit$InsertContentAction}.
     * </p>
     *
     * <p>
     * j8unit strongly encourages you to not only test the instances behaviour but also to test the type constraints.
     * For this purpose, j8unit also provides a complementary test interface containing the class/type relevant aspects
     * (see {@link InsertContentActionClassTests}).
     * </p>
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     */

    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface InsertContentActionTests<SUT extends InsertContentAction>
    extends TextActionTests<SUT> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.text.DefaultEditorKit$InsertContentAction]

        /**
         * <p>
         * Test method for the hereby targeted method-under-test
         * {@link javax.swing.text.DefaultEditorKit.InsertContentAction#actionPerformed(java.awt.event.ActionEvent)
         * public void
         * javax.swing.text.DefaultEditorKit$InsertContentAction.actionPerformed(java.awt.event.ActionEvent)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @since 0.9.0
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Override
        @Test
        @Category(Draft.class)
        public default void test_actionPerformed_ActionEvent()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.text.DefaultEditorKit$InsertContentAction]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.text.DefaultEditorKit$InsertContentAction]
    }

    /**
     * <p>
     * Reusable j8unit test interface containing the instance relevant aspects &ndash;&nbsp;i.&thinsp;e., test methods
     * targeting the non-{@code static} behaviour&nbsp;&ndash; of the hereby targeted type-under-test {@link CopyAction
     * public static class javax.swing.text.DefaultEditorKit$CopyAction}.
     * </p>
     *
     * <p>
     * j8unit strongly encourages you to not only test the instances behaviour but also to test the type constraints.
     * For this purpose, j8unit also provides a complementary test interface containing the class/type relevant aspects
     * (see {@link CopyActionClassTests}).
     * </p>
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     */

    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface CopyActionTests<SUT extends CopyAction>
    extends TextActionTests<SUT> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.text.DefaultEditorKit$CopyAction]

        /**
         * <p>
         * Test method for the hereby targeted method-under-test
         * {@link javax.swing.text.DefaultEditorKit.CopyAction#actionPerformed(java.awt.event.ActionEvent) public void
         * javax.swing.text.DefaultEditorKit$CopyAction.actionPerformed(java.awt.event.ActionEvent)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @since 0.9.0
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Override
        @Test
        @Category(Draft.class)
        public default void test_actionPerformed_ActionEvent()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.text.DefaultEditorKit$CopyAction]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.text.DefaultEditorKit$CopyAction]
    }

    /**
     * <p>
     * Reusable j8unit test interface containing the instance relevant aspects &ndash;&nbsp;i.&thinsp;e., test methods
     * targeting the non-{@code static} behaviour&nbsp;&ndash; of the hereby targeted type-under-test
     * {@link InsertTabAction public static class javax.swing.text.DefaultEditorKit$InsertTabAction}.
     * </p>
     *
     * <p>
     * j8unit strongly encourages you to not only test the instances behaviour but also to test the type constraints.
     * For this purpose, j8unit also provides a complementary test interface containing the class/type relevant aspects
     * (see {@link InsertTabActionClassTests}).
     * </p>
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     */

    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface InsertTabActionTests<SUT extends InsertTabAction>
    extends TextActionTests<SUT> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.text.DefaultEditorKit$InsertTabAction]

        /**
         * <p>
         * Test method for the hereby targeted method-under-test
         * {@link javax.swing.text.DefaultEditorKit.InsertTabAction#actionPerformed(java.awt.event.ActionEvent) public
         * void javax.swing.text.DefaultEditorKit$InsertTabAction.actionPerformed(java.awt.event.ActionEvent)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @since 0.9.0
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Override
        @Test
        @Category(Draft.class)
        public default void test_actionPerformed_ActionEvent()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.text.DefaultEditorKit$InsertTabAction]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.text.DefaultEditorKit$InsertTabAction]
    }

    /**
     * <p>
     * Reusable j8unit test interface containing the instance relevant aspects &ndash;&nbsp;i.&thinsp;e., test methods
     * targeting the non-{@code static} behaviour&nbsp;&ndash; of the hereby targeted type-under-test {@link BeepAction
     * public static class javax.swing.text.DefaultEditorKit$BeepAction}.
     * </p>
     *
     * <p>
     * j8unit strongly encourages you to not only test the instances behaviour but also to test the type constraints.
     * For this purpose, j8unit also provides a complementary test interface containing the class/type relevant aspects
     * (see {@link BeepActionClassTests}).
     * </p>
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     */

    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface BeepActionTests<SUT extends BeepAction>
    extends TextActionTests<SUT> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.text.DefaultEditorKit$BeepAction]

        /**
         * <p>
         * Test method for the hereby targeted method-under-test
         * {@link javax.swing.text.DefaultEditorKit.BeepAction#actionPerformed(java.awt.event.ActionEvent) public void
         * javax.swing.text.DefaultEditorKit$BeepAction.actionPerformed(java.awt.event.ActionEvent)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @since 0.9.0
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Override
        @Test
        @Category(Draft.class)
        public default void test_actionPerformed_ActionEvent()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.text.DefaultEditorKit$BeepAction]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.text.DefaultEditorKit$BeepAction]
    }

    /**
     * <p>
     * Reusable j8unit test interface containing the instance relevant aspects &ndash;&nbsp;i.&thinsp;e., test methods
     * targeting the non-{@code static} behaviour&nbsp;&ndash; of the hereby targeted type-under-test
     * {@link DefaultKeyTypedAction public static class javax.swing.text.DefaultEditorKit$DefaultKeyTypedAction}.
     * </p>
     *
     * <p>
     * j8unit strongly encourages you to not only test the instances behaviour but also to test the type constraints.
     * For this purpose, j8unit also provides a complementary test interface containing the class/type relevant aspects
     * (see {@link DefaultKeyTypedActionClassTests}).
     * </p>
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     */

    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface DefaultKeyTypedActionTests<SUT extends DefaultKeyTypedAction>
    extends TextActionTests<SUT> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.text.DefaultEditorKit$DefaultKeyTypedAction]

        /**
         * <p>
         * Test method for the hereby targeted method-under-test
         * {@link javax.swing.text.DefaultEditorKit.DefaultKeyTypedAction#actionPerformed(java.awt.event.ActionEvent)
         * public void
         * javax.swing.text.DefaultEditorKit$DefaultKeyTypedAction.actionPerformed(java.awt.event.ActionEvent)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @since 0.9.0
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Override
        @Test
        @Category(Draft.class)
        public default void test_actionPerformed_ActionEvent()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.text.DefaultEditorKit$DefaultKeyTypedAction]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.text.DefaultEditorKit$DefaultKeyTypedAction]
    }

    /**
     * <p>
     * Reusable j8unit test interface containing the instance relevant aspects &ndash;&nbsp;i.&thinsp;e., test methods
     * targeting the non-{@code static} behaviour&nbsp;&ndash; of the hereby targeted type-under-test {@link CutAction
     * public static class javax.swing.text.DefaultEditorKit$CutAction}.
     * </p>
     *
     * <p>
     * j8unit strongly encourages you to not only test the instances behaviour but also to test the type constraints.
     * For this purpose, j8unit also provides a complementary test interface containing the class/type relevant aspects
     * (see {@link CutActionClassTests}).
     * </p>
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     */

    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface CutActionTests<SUT extends CutAction>
    extends TextActionTests<SUT> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.text.DefaultEditorKit$CutAction]

        /**
         * <p>
         * Test method for the hereby targeted method-under-test
         * {@link javax.swing.text.DefaultEditorKit.CutAction#actionPerformed(java.awt.event.ActionEvent) public void
         * javax.swing.text.DefaultEditorKit$CutAction.actionPerformed(java.awt.event.ActionEvent)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @since 0.9.0
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Override
        @Test
        @Category(Draft.class)
        public default void test_actionPerformed_ActionEvent()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.text.DefaultEditorKit$CutAction]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.text.DefaultEditorKit$CutAction]
    }

    /**
     * <p>
     * Reusable j8unit test interface containing the instance relevant aspects &ndash;&nbsp;i.&thinsp;e., test methods
     * targeting the non-{@code static} behaviour&nbsp;&ndash; of the hereby targeted type-under-test
     * {@link InsertBreakAction public static class javax.swing.text.DefaultEditorKit$InsertBreakAction}.
     * </p>
     *
     * <p>
     * j8unit strongly encourages you to not only test the instances behaviour but also to test the type constraints.
     * For this purpose, j8unit also provides a complementary test interface containing the class/type relevant aspects
     * (see {@link InsertBreakActionClassTests}).
     * </p>
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     */

    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface InsertBreakActionTests<SUT extends InsertBreakAction>
    extends TextActionTests<SUT> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.text.DefaultEditorKit$InsertBreakAction]

        /**
         * <p>
         * Test method for the hereby targeted method-under-test
         * {@link javax.swing.text.DefaultEditorKit.InsertBreakAction#actionPerformed(java.awt.event.ActionEvent) public
         * void javax.swing.text.DefaultEditorKit$InsertBreakAction.actionPerformed(java.awt.event.ActionEvent)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @since 0.9.0
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Override
        @Test
        @Category(Draft.class)
        public default void test_actionPerformed_ActionEvent()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.text.DefaultEditorKit$InsertBreakAction]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.text.DefaultEditorKit$InsertBreakAction]
    }

}
