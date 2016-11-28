package org.j8unit.repository.javax.swing.text;

import static org.junit.Assert.fail;
import javax.swing.text.StyledEditorKit;
import javax.swing.text.StyledEditorKit.AlignmentAction;
import javax.swing.text.StyledEditorKit.BoldAction;
import javax.swing.text.StyledEditorKit.FontFamilyAction;
import javax.swing.text.StyledEditorKit.FontSizeAction;
import javax.swing.text.StyledEditorKit.ForegroundAction;
import javax.swing.text.StyledEditorKit.ItalicAction;
import javax.swing.text.StyledEditorKit.StyledTextAction;
import javax.swing.text.StyledEditorKit.UnderlineAction;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link StyledEditorKit} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.swing.text.StyledEditorKitClassTests}).
 */
@RunWith(J8Unit4.class)
public class StyledEditorKitClassTest
implements StyledEditorKitClassTests<StyledEditorKit> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.text.StyledEditorKit]

    @Override
    public Class<StyledEditorKit> createNewSUT() {
        return StyledEditorKit.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.swing.text.StyledEditorKit#StyledEditorKit() public javax.swing.text.StyledEditorKit()}.
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
    public void create_StyledEditorKit()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final StyledEditorKit sut = new StyledEditorKit();
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.text.StyledEditorKit]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.text.StyledEditorKit]

    /**
     * Specific JUnit test class to proof the type relevant aspects of type {@link FontFamilyAction} (by simply reusing
     * the J8Unit test interface
     * {@link org.j8unit.repository.javax.swing.text.StyledEditorKitClassTests.FontFamilyActionClassTests}).
     */
    @RunWith(J8Unit4.class)
    public static class FontFamilyActionClassTest
    implements FontFamilyActionClassTests<FontFamilyAction> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.text.StyledEditorKit$FontFamilyAction]

        @Override
        public Class<FontFamilyAction> createNewSUT() {
            return FontFamilyAction.class;
        }

        /**
         * <p>
         * Test method for the hereby targeted constructor-under-test
         * {@link javax.swing.text.StyledEditorKit.FontFamilyAction#FontFamilyAction(String, String) public
         * javax.swing.text.StyledEditorKit$FontFamilyAction(java.lang.String,java.lang.String)}.
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
        public void create_FontFamilyAction_String_String()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final FontFamilyAction sut = null; // = new FontFamilyAction(String, String);
        }

        // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.text.StyledEditorKit$FontFamilyAction]

        // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.text.StyledEditorKit$FontFamilyAction]

    }

    /**
     * Specific JUnit test class to proof the type relevant aspects of type {@link BoldAction} (by simply reusing the
     * J8Unit test interface
     * {@link org.j8unit.repository.javax.swing.text.StyledEditorKitClassTests.BoldActionClassTests}).
     */
    @RunWith(J8Unit4.class)
    public static class BoldActionClassTest
    implements BoldActionClassTests<BoldAction> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.text.StyledEditorKit$BoldAction]

        @Override
        public Class<BoldAction> createNewSUT() {
            return BoldAction.class;
        }

        /**
         * <p>
         * Test method for the hereby targeted constructor-under-test
         * {@link javax.swing.text.StyledEditorKit.BoldAction#BoldAction() public
         * javax.swing.text.StyledEditorKit$BoldAction()}.
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
        public void create_BoldAction()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final BoldAction sut = new BoldAction();
        }

        // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.text.StyledEditorKit$BoldAction]

        // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.text.StyledEditorKit$BoldAction]

    }

    /**
     * Specific JUnit test class to proof the type relevant aspects of type {@link ItalicAction} (by simply reusing the
     * J8Unit test interface
     * {@link org.j8unit.repository.javax.swing.text.StyledEditorKitClassTests.ItalicActionClassTests}).
     */
    @RunWith(J8Unit4.class)
    public static class ItalicActionClassTest
    implements ItalicActionClassTests<ItalicAction> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.text.StyledEditorKit$ItalicAction]

        @Override
        public Class<ItalicAction> createNewSUT() {
            return ItalicAction.class;
        }

        /**
         * <p>
         * Test method for the hereby targeted constructor-under-test
         * {@link javax.swing.text.StyledEditorKit.ItalicAction#ItalicAction() public
         * javax.swing.text.StyledEditorKit$ItalicAction()}.
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
        public void create_ItalicAction()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final ItalicAction sut = new ItalicAction();
        }

        // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.text.StyledEditorKit$ItalicAction]

        // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.text.StyledEditorKit$ItalicAction]

    }

    /**
     * Specific JUnit test class to proof the type relevant aspects of type {@link AlignmentAction} (by simply reusing
     * the J8Unit test interface
     * {@link org.j8unit.repository.javax.swing.text.StyledEditorKitClassTests.AlignmentActionClassTests}).
     */
    @RunWith(J8Unit4.class)
    public static class AlignmentActionClassTest
    implements AlignmentActionClassTests<AlignmentAction> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.text.StyledEditorKit$AlignmentAction]

        @Override
        public Class<AlignmentAction> createNewSUT() {
            return AlignmentAction.class;
        }

        /**
         * <p>
         * Test method for the hereby targeted constructor-under-test
         * {@link javax.swing.text.StyledEditorKit.AlignmentAction#AlignmentAction(String, int) public
         * javax.swing.text.StyledEditorKit$AlignmentAction(java.lang.String,int)}.
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
        public void create_AlignmentAction_String_int()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final AlignmentAction sut = null; // = new AlignmentAction(String, int);
        }

        // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.text.StyledEditorKit$AlignmentAction]

        // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.text.StyledEditorKit$AlignmentAction]

    }

    /**
     * Specific JUnit test class to proof the type relevant aspects of type {@link StyledTextAction} (by simply reusing
     * the J8Unit test interface
     * {@link org.j8unit.repository.javax.swing.text.StyledEditorKitClassTests.StyledTextActionClassTests}).
     */
    @RunWith(J8Unit4.class)
    public static class StyledTextActionClassTest
    implements StyledTextActionClassTests<StyledTextAction> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.text.StyledEditorKit$StyledTextAction]

        @Override
        public Class<StyledTextAction> createNewSUT() {
            return StyledTextAction.class;
        }

        /**
         * <p>
         * Test method for the hereby targeted constructor-under-test
         * {@link javax.swing.text.StyledEditorKit.StyledTextAction#StyledTextAction(String) public
         * javax.swing.text.StyledEditorKit$StyledTextAction(java.lang.String)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @since 0.9.0
         */
        @Ignore("Cannot construct an abstract class!")
        @Test
        @Category(Draft.class)
        public void create_StyledTextAction_String()
        throws Exception {
            fail("Cannot construct an abstract class!");
        }

        // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.text.StyledEditorKit$StyledTextAction]

        // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.text.StyledEditorKit$StyledTextAction]

    }

    /**
     * Specific JUnit test class to proof the type relevant aspects of type {@link ForegroundAction} (by simply reusing
     * the J8Unit test interface
     * {@link org.j8unit.repository.javax.swing.text.StyledEditorKitClassTests.ForegroundActionClassTests}).
     */
    @RunWith(J8Unit4.class)
    public static class ForegroundActionClassTest
    implements ForegroundActionClassTests<ForegroundAction> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.text.StyledEditorKit$ForegroundAction]

        @Override
        public Class<ForegroundAction> createNewSUT() {
            return ForegroundAction.class;
        }

        /**
         * <p>
         * Test method for the hereby targeted constructor-under-test
         * {@link javax.swing.text.StyledEditorKit.ForegroundAction#ForegroundAction(String, java.awt.Color) public
         * javax.swing.text.StyledEditorKit$ForegroundAction(java.lang.String,java.awt.Color)}.
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
        public void create_ForegroundAction_String_Color()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final ForegroundAction sut = null; // = new ForegroundAction(String, java.awt.Color);
        }

        // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.text.StyledEditorKit$ForegroundAction]

        // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.text.StyledEditorKit$ForegroundAction]

    }

    /**
     * Specific JUnit test class to proof the type relevant aspects of type {@link UnderlineAction} (by simply reusing
     * the J8Unit test interface
     * {@link org.j8unit.repository.javax.swing.text.StyledEditorKitClassTests.UnderlineActionClassTests}).
     */
    @RunWith(J8Unit4.class)
    public static class UnderlineActionClassTest
    implements UnderlineActionClassTests<UnderlineAction> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.text.StyledEditorKit$UnderlineAction]

        @Override
        public Class<UnderlineAction> createNewSUT() {
            return UnderlineAction.class;
        }

        /**
         * <p>
         * Test method for the hereby targeted constructor-under-test
         * {@link javax.swing.text.StyledEditorKit.UnderlineAction#UnderlineAction() public
         * javax.swing.text.StyledEditorKit$UnderlineAction()}.
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
        public void create_UnderlineAction()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final UnderlineAction sut = new UnderlineAction();
        }

        // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.text.StyledEditorKit$UnderlineAction]

        // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.text.StyledEditorKit$UnderlineAction]

    }

    /**
     * Specific JUnit test class to proof the type relevant aspects of type {@link FontSizeAction} (by simply reusing
     * the J8Unit test interface
     * {@link org.j8unit.repository.javax.swing.text.StyledEditorKitClassTests.FontSizeActionClassTests}).
     */
    @RunWith(J8Unit4.class)
    public static class FontSizeActionClassTest
    implements FontSizeActionClassTests<FontSizeAction> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.text.StyledEditorKit$FontSizeAction]

        @Override
        public Class<FontSizeAction> createNewSUT() {
            return FontSizeAction.class;
        }

        /**
         * <p>
         * Test method for the hereby targeted constructor-under-test
         * {@link javax.swing.text.StyledEditorKit.FontSizeAction#FontSizeAction(String, int) public
         * javax.swing.text.StyledEditorKit$FontSizeAction(java.lang.String,int)}.
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
        public void create_FontSizeAction_String_int()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final FontSizeAction sut = null; // = new FontSizeAction(String, int);
        }

        // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.text.StyledEditorKit$FontSizeAction]

        // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.text.StyledEditorKit$FontSizeAction]

    }

}
