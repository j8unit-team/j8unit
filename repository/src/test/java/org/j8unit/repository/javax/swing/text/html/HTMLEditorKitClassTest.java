package org.j8unit.repository.javax.swing.text.html;

import static org.junit.Assert.fail;
import javax.swing.text.html.HTML.Tag;
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

@RunWith(J8Unit4.class)
public class HTMLEditorKitClassTest
implements org.j8unit.repository.javax.swing.text.html.HTMLEditorKitClassTests<HTMLEditorKit> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.text.html.HTMLEditorKit]

    @Override
    public Class<HTMLEditorKit> createNewSUT() {
        return HTMLEditorKit.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link HTMLEditorKit#HTMLEditorKit() public
     * javax.swing.text.html.HTMLEditorKit()}.
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

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.text.html.HTMLEditorKit]

    @RunWith(J8Unit4.class)
    public static class ParserClassTest
    implements org.j8unit.repository.javax.swing.text.html.HTMLEditorKitClassTests.ParserClassTests<Parser> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.text.html.HTMLEditorKit$Parser]

        @Override
        public Class<Parser> createNewSUT() {
            return Parser.class;
        }

        /**
         * <p>
         * Test method for the hereby targeted constructor-under-test {@link Parser#Parser() public
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

        // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.text.html.HTMLEditorKit$Parser]

    }

    @RunWith(J8Unit4.class)
    public static class HTMLTextActionClassTest
    implements org.j8unit.repository.javax.swing.text.html.HTMLEditorKitClassTests.HTMLTextActionClassTests<HTMLTextAction> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.text.html.HTMLEditorKit$HTMLTextAction]

        @Override
        public Class<HTMLTextAction> createNewSUT() {
            return HTMLTextAction.class;
        }

        /**
         * <p>
         * Test method for the hereby targeted constructor-under-test {@link HTMLTextAction#HTMLTextAction(String)
         * public javax.swing.text.html.HTMLEditorKit$HTMLTextAction(java.lang.String)}.
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

        // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.text.html.HTMLEditorKit$HTMLTextAction]

    }

    @RunWith(J8Unit4.class)
    public static class InsertHTMLTextActionClassTest
    implements org.j8unit.repository.javax.swing.text.html.HTMLEditorKitClassTests.InsertHTMLTextActionClassTests<InsertHTMLTextAction> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.text.html.HTMLEditorKit$InsertHTMLTextAction]

        @Override
        public Class<InsertHTMLTextAction> createNewSUT() {
            return InsertHTMLTextAction.class;
        }

        /**
         * <p>
         * Test method for the hereby targeted constructor-under-test
         * {@link InsertHTMLTextAction#InsertHTMLTextAction(String, String, Tag, Tag, Tag, Tag) public
         * javax.swing.text.html.HTMLEditorKit$InsertHTMLTextAction(java.lang.String,java.lang.String,javax.swing.text.html.HTML$Tag,javax.swing.text.html.HTML$Tag,javax.swing.text.html.HTML$Tag,javax.swing.text.html.HTML$Tag)}
         * .
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
            final InsertHTMLTextAction sut = null; // = new InsertHTMLTextAction(String, String, Tag, Tag, Tag, Tag);
        }

        /**
         * <p>
         * Test method for the hereby targeted constructor-under-test
         * {@link InsertHTMLTextAction#InsertHTMLTextAction(String, String, Tag, Tag) public
         * javax.swing.text.html.HTMLEditorKit$InsertHTMLTextAction(java.lang.String,java.lang.String,javax.swing.text.html.HTML$Tag,javax.swing.text.html.HTML$Tag)}
         * .
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
            final InsertHTMLTextAction sut = null; // = new InsertHTMLTextAction(String, String, Tag, Tag);
        }

        // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.text.html.HTMLEditorKit$InsertHTMLTextAction]

    }

    @RunWith(J8Unit4.class)
    public static class LinkControllerClassTest
    implements org.j8unit.repository.javax.swing.text.html.HTMLEditorKitClassTests.LinkControllerClassTests<LinkController> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.text.html.HTMLEditorKit$LinkController]

        @Override
        public Class<LinkController> createNewSUT() {
            return LinkController.class;
        }

        /**
         * <p>
         * Test method for the hereby targeted constructor-under-test {@link LinkController#LinkController() public
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

        // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.text.html.HTMLEditorKit$LinkController]

    }

    @RunWith(J8Unit4.class)
    public static class HTMLFactoryClassTest
    implements org.j8unit.repository.javax.swing.text.html.HTMLEditorKitClassTests.HTMLFactoryClassTests<HTMLFactory> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.text.html.HTMLEditorKit$HTMLFactory]

        @Override
        public Class<HTMLFactory> createNewSUT() {
            return HTMLFactory.class;
        }

        /**
         * <p>
         * Test method for the hereby targeted constructor-under-test {@link HTMLFactory#HTMLFactory() public
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

        // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.text.html.HTMLEditorKit$HTMLFactory]

    }

    @RunWith(J8Unit4.class)
    public static class ParserCallbackClassTest
    implements org.j8unit.repository.javax.swing.text.html.HTMLEditorKitClassTests.ParserCallbackClassTests<ParserCallback> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.text.html.HTMLEditorKit$ParserCallback]

        @Override
        public Class<ParserCallback> createNewSUT() {
            return ParserCallback.class;
        }

        /**
         * <p>
         * Test method for the hereby targeted constructor-under-test {@link ParserCallback#ParserCallback() public
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

        // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.text.html.HTMLEditorKit$ParserCallback]

    }

}
