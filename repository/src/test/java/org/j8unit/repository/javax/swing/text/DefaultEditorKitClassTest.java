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
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link DefaultEditorKit} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.swing.text.DefaultEditorKitClassTests}).
 */

@RunWith(J8Unit4.class)
public class DefaultEditorKitClassTest
implements DefaultEditorKitClassTests<DefaultEditorKit> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.text.DefaultEditorKit]

    @Override
    public Class<DefaultEditorKit> createNewSUT() {
        return DefaultEditorKit.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.swing.text.DefaultEditorKit#DefaultEditorKit() public javax.swing.text.DefaultEditorKit()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void create_DefaultEditorKit()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final DefaultEditorKit sut = new DefaultEditorKit();
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.text.DefaultEditorKit]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.text.DefaultEditorKit]

    /**
     * Specific JUnit test class to proof the type relevant aspects of type {@link InsertBreakAction} (by simply reusing
     * the J8Unit test interface
     * {@link org.j8unit.repository.javax.swing.text.DefaultEditorKitClassTests.InsertBreakActionClassTests}).
     */

    @RunWith(J8Unit4.class)
    public static class InsertBreakActionClassTest
    implements InsertBreakActionClassTests<InsertBreakAction> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.text.DefaultEditorKit$InsertBreakAction]

        @Override
        public Class<InsertBreakAction> createNewSUT() {
            return InsertBreakAction.class;
        }

        /**
         * <p>
         * Test method for the hereby targeted constructor-under-test
         * {@link javax.swing.text.DefaultEditorKit.InsertBreakAction#InsertBreakAction() public
         * javax.swing.text.DefaultEditorKit$InsertBreakAction()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @since 0.9.0
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public void create_InsertBreakAction()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final InsertBreakAction sut = new InsertBreakAction();
        }

        // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.text.DefaultEditorKit$InsertBreakAction]

        // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.text.DefaultEditorKit$InsertBreakAction]

    }

    /**
     * Specific JUnit test class to proof the type relevant aspects of type {@link DefaultKeyTypedAction} (by simply
     * reusing the J8Unit test interface
     * {@link org.j8unit.repository.javax.swing.text.DefaultEditorKitClassTests.DefaultKeyTypedActionClassTests}).
     */

    @RunWith(J8Unit4.class)
    public static class DefaultKeyTypedActionClassTest
    implements DefaultKeyTypedActionClassTests<DefaultKeyTypedAction> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.text.DefaultEditorKit$DefaultKeyTypedAction]

        @Override
        public Class<DefaultKeyTypedAction> createNewSUT() {
            return DefaultKeyTypedAction.class;
        }

        /**
         * <p>
         * Test method for the hereby targeted constructor-under-test
         * {@link javax.swing.text.DefaultEditorKit.DefaultKeyTypedAction#DefaultKeyTypedAction() public
         * javax.swing.text.DefaultEditorKit$DefaultKeyTypedAction()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @since 0.9.0
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public void create_DefaultKeyTypedAction()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final DefaultKeyTypedAction sut = new DefaultKeyTypedAction();
        }

        // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.text.DefaultEditorKit$DefaultKeyTypedAction]

        // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.text.DefaultEditorKit$DefaultKeyTypedAction]

    }

    /**
     * Specific JUnit test class to proof the type relevant aspects of type {@link InsertTabAction} (by simply reusing
     * the J8Unit test interface
     * {@link org.j8unit.repository.javax.swing.text.DefaultEditorKitClassTests.InsertTabActionClassTests}).
     */

    @RunWith(J8Unit4.class)
    public static class InsertTabActionClassTest
    implements InsertTabActionClassTests<InsertTabAction> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.text.DefaultEditorKit$InsertTabAction]

        @Override
        public Class<InsertTabAction> createNewSUT() {
            return InsertTabAction.class;
        }

        /**
         * <p>
         * Test method for the hereby targeted constructor-under-test
         * {@link javax.swing.text.DefaultEditorKit.InsertTabAction#InsertTabAction() public
         * javax.swing.text.DefaultEditorKit$InsertTabAction()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @since 0.9.0
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public void create_InsertTabAction()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final InsertTabAction sut = new InsertTabAction();
        }

        // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.text.DefaultEditorKit$InsertTabAction]

        // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.text.DefaultEditorKit$InsertTabAction]

    }

    /**
     * Specific JUnit test class to proof the type relevant aspects of type {@link CutAction} (by simply reusing the
     * J8Unit test interface
     * {@link org.j8unit.repository.javax.swing.text.DefaultEditorKitClassTests.CutActionClassTests}).
     */

    @RunWith(J8Unit4.class)
    public static class CutActionClassTest
    implements CutActionClassTests<CutAction> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.text.DefaultEditorKit$CutAction]

        @Override
        public Class<CutAction> createNewSUT() {
            return CutAction.class;
        }

        /**
         * <p>
         * Test method for the hereby targeted constructor-under-test
         * {@link javax.swing.text.DefaultEditorKit.CutAction#CutAction() public
         * javax.swing.text.DefaultEditorKit$CutAction()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @since 0.9.0
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public void create_CutAction()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final CutAction sut = new CutAction();
        }

        // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.text.DefaultEditorKit$CutAction]

        // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.text.DefaultEditorKit$CutAction]

    }

    /**
     * Specific JUnit test class to proof the type relevant aspects of type {@link InsertContentAction} (by simply
     * reusing the J8Unit test interface
     * {@link org.j8unit.repository.javax.swing.text.DefaultEditorKitClassTests.InsertContentActionClassTests}).
     */

    @RunWith(J8Unit4.class)
    public static class InsertContentActionClassTest
    implements InsertContentActionClassTests<InsertContentAction> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.text.DefaultEditorKit$InsertContentAction]

        @Override
        public Class<InsertContentAction> createNewSUT() {
            return InsertContentAction.class;
        }

        /**
         * <p>
         * Test method for the hereby targeted constructor-under-test
         * {@link javax.swing.text.DefaultEditorKit.InsertContentAction#InsertContentAction() public
         * javax.swing.text.DefaultEditorKit$InsertContentAction()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @since 0.9.0
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public void create_InsertContentAction()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final InsertContentAction sut = new InsertContentAction();
        }

        // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.text.DefaultEditorKit$InsertContentAction]

        // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.text.DefaultEditorKit$InsertContentAction]

    }

    /**
     * Specific JUnit test class to proof the type relevant aspects of type {@link PasteAction} (by simply reusing the
     * J8Unit test interface
     * {@link org.j8unit.repository.javax.swing.text.DefaultEditorKitClassTests.PasteActionClassTests}).
     */

    @RunWith(J8Unit4.class)
    public static class PasteActionClassTest
    implements PasteActionClassTests<PasteAction> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.text.DefaultEditorKit$PasteAction]

        @Override
        public Class<PasteAction> createNewSUT() {
            return PasteAction.class;
        }

        /**
         * <p>
         * Test method for the hereby targeted constructor-under-test
         * {@link javax.swing.text.DefaultEditorKit.PasteAction#PasteAction() public
         * javax.swing.text.DefaultEditorKit$PasteAction()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @since 0.9.0
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public void create_PasteAction()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final PasteAction sut = new PasteAction();
        }

        // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.text.DefaultEditorKit$PasteAction]

        // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.text.DefaultEditorKit$PasteAction]

    }

    /**
     * Specific JUnit test class to proof the type relevant aspects of type {@link BeepAction} (by simply reusing the
     * J8Unit test interface
     * {@link org.j8unit.repository.javax.swing.text.DefaultEditorKitClassTests.BeepActionClassTests}).
     */

    @RunWith(J8Unit4.class)
    public static class BeepActionClassTest
    implements BeepActionClassTests<BeepAction> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.text.DefaultEditorKit$BeepAction]

        @Override
        public Class<BeepAction> createNewSUT() {
            return BeepAction.class;
        }

        /**
         * <p>
         * Test method for the hereby targeted constructor-under-test
         * {@link javax.swing.text.DefaultEditorKit.BeepAction#BeepAction() public
         * javax.swing.text.DefaultEditorKit$BeepAction()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @since 0.9.0
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public void create_BeepAction()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final BeepAction sut = new BeepAction();
        }

        // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.text.DefaultEditorKit$BeepAction]

        // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.text.DefaultEditorKit$BeepAction]

    }

    /**
     * Specific JUnit test class to proof the type relevant aspects of type {@link CopyAction} (by simply reusing the
     * J8Unit test interface
     * {@link org.j8unit.repository.javax.swing.text.DefaultEditorKitClassTests.CopyActionClassTests}).
     */

    @RunWith(J8Unit4.class)
    public static class CopyActionClassTest
    implements CopyActionClassTests<CopyAction> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.text.DefaultEditorKit$CopyAction]

        @Override
        public Class<CopyAction> createNewSUT() {
            return CopyAction.class;
        }

        /**
         * <p>
         * Test method for the hereby targeted constructor-under-test
         * {@link javax.swing.text.DefaultEditorKit.CopyAction#CopyAction() public
         * javax.swing.text.DefaultEditorKit$CopyAction()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @since 0.9.0
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public void create_CopyAction()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final CopyAction sut = new CopyAction();
        }

        // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.text.DefaultEditorKit$CopyAction]

        // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.text.DefaultEditorKit$CopyAction]

    }

}
