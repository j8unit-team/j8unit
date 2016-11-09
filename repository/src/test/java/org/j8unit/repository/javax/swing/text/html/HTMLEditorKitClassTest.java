package org.j8unit.repository.javax.swing.text.html;

import static org.junit.Assert.fail;
import javax.swing.text.html.HTMLEditorKit;
import javax.swing.text.html.HTMLEditorKit.HTMLFactory;
import javax.swing.text.html.HTMLEditorKit.HTMLTextAction;
import javax.swing.text.html.HTMLEditorKit.InsertHTMLTextAction;
import javax.swing.text.html.HTMLEditorKit.LinkController;
import javax.swing.text.html.HTMLEditorKit.Parser;
import javax.swing.text.html.HTMLEditorKit.ParserCallback;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link HTMLEditorKit} (by simply reusing the
 * J8Unit test interface {@link HTMLEditorKitClassTests}).
 */

@RunWith(J8Unit4.class)
public class HTMLEditorKitClassTest
implements HTMLEditorKitClassTests<HTMLEditorKit> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.text.html.HTMLEditorKit]

    @Override
    public Class<HTMLEditorKit> createNewSUT() {
        return HTMLEditorKit.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.swing.text.html.HTMLEditorKit#HTMLEditorKit() public javax.swing.text.html.HTMLEditorKit()}.
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
    public void create_HTMLEditorKit()
    throws Exception {
        // create new instance
        final HTMLEditorKit sut = new HTMLEditorKit();
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.text.html.HTMLEditorKit]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.text.html.HTMLEditorKit]

    /**
     * Specific JUnit test class to proof the type relevant aspects of type {@link Parser} (by simply reusing the J8Unit
     * test interface {@link ParserClassTests}).
     */

    @RunWith(J8Unit4.class)
    public static class ParserClassTest
    implements ParserClassTests<Parser> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.text.html.HTMLEditorKit$Parser]

        @Override
        public Class<Parser> createNewSUT() {
            return Parser.class;
        }

        /**
         * <p>
         * Test method for the hereby targeted constructor-under-test
         * {@link javax.swing.text.html.HTMLEditorKit.Parser#Parser() public
         * javax.swing.text.html.HTMLEditorKit$Parser()}.
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
        public void create_Parser()
        throws Exception {
            fail("Cannot construct an abstract class!");
        }

        // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.text.html.HTMLEditorKit$Parser]

        // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.text.html.HTMLEditorKit$Parser]

    }

    /**
     * Specific JUnit test class to proof the type relevant aspects of type {@link LinkController} (by simply reusing
     * the J8Unit test interface {@link LinkControllerClassTests}).
     */

    @RunWith(J8Unit4.class)
    public static class LinkControllerClassTest
    implements LinkControllerClassTests<LinkController> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.text.html.HTMLEditorKit$LinkController]

        @Override
        public Class<LinkController> createNewSUT() {
            return LinkController.class;
        }

        /**
         * <p>
         * Test method for the hereby targeted constructor-under-test
         * {@link javax.swing.text.html.HTMLEditorKit.LinkController#LinkController() public
         * javax.swing.text.html.HTMLEditorKit$LinkController()}.
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
        public void create_LinkController()
        throws Exception {
            // create new instance
            final LinkController sut = new LinkController();
        }

        // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.text.html.HTMLEditorKit$LinkController]

        // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.text.html.HTMLEditorKit$LinkController]

    }

    /**
     * Specific JUnit test class to proof the type relevant aspects of type {@link ParserCallback} (by simply reusing
     * the J8Unit test interface {@link ParserCallbackClassTests}).
     */

    @RunWith(J8Unit4.class)
    public static class ParserCallbackClassTest
    implements ParserCallbackClassTests<ParserCallback> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.text.html.HTMLEditorKit$ParserCallback]

        @Override
        public Class<ParserCallback> createNewSUT() {
            return ParserCallback.class;
        }

        /**
         * <p>
         * Test method for the hereby targeted constructor-under-test
         * {@link javax.swing.text.html.HTMLEditorKit.ParserCallback#ParserCallback() public
         * javax.swing.text.html.HTMLEditorKit$ParserCallback()}.
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
        public void create_ParserCallback()
        throws Exception {
            // create new instance
            final ParserCallback sut = new ParserCallback();
        }

        // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.text.html.HTMLEditorKit$ParserCallback]

        // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.text.html.HTMLEditorKit$ParserCallback]

    }

    /**
     * Specific JUnit test class to proof the type relevant aspects of type {@link InsertHTMLTextAction} (by simply
     * reusing the J8Unit test interface {@link InsertHTMLTextActionClassTests}).
     */

    @RunWith(J8Unit4.class)
    public static class InsertHTMLTextActionClassTest
    implements InsertHTMLTextActionClassTests<InsertHTMLTextAction> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.text.html.HTMLEditorKit$InsertHTMLTextAction]

        @Override
        public Class<InsertHTMLTextAction> createNewSUT() {
            return InsertHTMLTextAction.class;
        }

        /**
         * <p>
         * Test method for the hereby targeted constructor-under-test
         * {@link javax.swing.text.html.HTMLEditorKit.InsertHTMLTextAction#InsertHTMLTextAction(String, String, javax.swing.text.html.HTML.Tag, javax.swing.text.html.HTML.Tag)
         * public
         * javax.swing.text.html.HTMLEditorKit$InsertHTMLTextAction(java.lang.String,java.lang.String,javax.swing.text.html.HTML$Tag,javax.swing.text.html.HTML$Tag)}.
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
        public void create_InsertHTMLTextAction_String_String_Tag_Tag()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final InsertHTMLTextAction sut = null; // = new InsertHTMLTextAction(String, String,
                                                   // javax.swing.text.html.HTML.Tag, javax.swing.text.html.HTML.Tag);
        }

        /**
         * <p>
         * Test method for the hereby targeted constructor-under-test
         * {@link javax.swing.text.html.HTMLEditorKit.InsertHTMLTextAction#InsertHTMLTextAction(String, String, javax.swing.text.html.HTML.Tag, javax.swing.text.html.HTML.Tag, javax.swing.text.html.HTML.Tag, javax.swing.text.html.HTML.Tag)
         * public
         * javax.swing.text.html.HTMLEditorKit$InsertHTMLTextAction(java.lang.String,java.lang.String,javax.swing.text.html.HTML$Tag,javax.swing.text.html.HTML$Tag,javax.swing.text.html.HTML$Tag,javax.swing.text.html.HTML$Tag)}.
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
        public void create_InsertHTMLTextAction_String_String_Tag_Tag_Tag_Tag()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final InsertHTMLTextAction sut = null; // = new InsertHTMLTextAction(String, String,
                                                   // javax.swing.text.html.HTML.Tag, javax.swing.text.html.HTML.Tag,
                                                   // javax.swing.text.html.HTML.Tag, javax.swing.text.html.HTML.Tag);
        }

        // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.text.html.HTMLEditorKit$InsertHTMLTextAction]

        // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.text.html.HTMLEditorKit$InsertHTMLTextAction]

    }

    /**
     * Specific JUnit test class to proof the type relevant aspects of type {@link HTMLTextAction} (by simply reusing
     * the J8Unit test interface {@link HTMLTextActionClassTests}).
     */

    @RunWith(J8Unit4.class)
    public static class HTMLTextActionClassTest
    implements HTMLTextActionClassTests<HTMLTextAction> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.text.html.HTMLEditorKit$HTMLTextAction]

        @Override
        public Class<HTMLTextAction> createNewSUT() {
            return HTMLTextAction.class;
        }

        /**
         * <p>
         * Test method for the hereby targeted constructor-under-test
         * {@link javax.swing.text.html.HTMLEditorKit.HTMLTextAction#HTMLTextAction(String) public
         * javax.swing.text.html.HTMLEditorKit$HTMLTextAction(java.lang.String)}.
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
        public void create_HTMLTextAction_String()
        throws Exception {
            Assert.fail("Cannot construct an abstract class!");
        }

        // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.text.html.HTMLEditorKit$HTMLTextAction]

        // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.text.html.HTMLEditorKit$HTMLTextAction]

    }

    /**
     * Specific JUnit test class to proof the type relevant aspects of type {@link HTMLFactory} (by simply reusing the
     * J8Unit test interface {@link HTMLFactoryClassTests}).
     */

    @RunWith(J8Unit4.class)
    public static class HTMLFactoryClassTest
    implements HTMLFactoryClassTests<HTMLFactory> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.text.html.HTMLEditorKit$HTMLFactory]

        @Override
        public Class<HTMLFactory> createNewSUT() {
            return HTMLFactory.class;
        }

        /**
         * <p>
         * Test method for the hereby targeted constructor-under-test
         * {@link javax.swing.text.html.HTMLEditorKit.HTMLFactory#HTMLFactory() public
         * javax.swing.text.html.HTMLEditorKit$HTMLFactory()}.
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
        public void create_HTMLFactory()
        throws Exception {
            // create new instance
            final HTMLFactory sut = new HTMLFactory();
        }

        // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.text.html.HTMLEditorKit$HTMLFactory]

        // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.text.html.HTMLEditorKit$HTMLFactory]

    }

}
