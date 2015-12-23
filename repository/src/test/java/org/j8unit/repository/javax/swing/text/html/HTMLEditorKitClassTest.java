package org.j8unit.repository.javax.swing.text.html;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class HTMLEditorKitClassTest
implements org.j8unit.repository.javax.swing.text.html.HTMLEditorKitClassTests<javax.swing.text.html.HTMLEditorKit> {

    @Override
    public Class<javax.swing.text.html.HTMLEditorKit> createNewSUT() {
        return javax.swing.text.html.HTMLEditorKit.class;
    }

    @RunWith(J8Unit4.class)
    public static class HTMLFactoryClassTest
    implements org.j8unit.repository.javax.swing.text.html.HTMLEditorKitClassTests.HTMLFactoryClassTests<javax.swing.text.html.HTMLEditorKit.HTMLFactory> {

        @Override
        public Class<javax.swing.text.html.HTMLEditorKit.HTMLFactory> createNewSUT() {
            return javax.swing.text.html.HTMLEditorKit.HTMLFactory.class;
        }

    }

    @RunWith(J8Unit4.class)
    public static class ParserClassTest
    implements org.j8unit.repository.javax.swing.text.html.HTMLEditorKitClassTests.ParserClassTests<javax.swing.text.html.HTMLEditorKit.Parser> {

        @Override
        public Class<javax.swing.text.html.HTMLEditorKit.Parser> createNewSUT() {
            return javax.swing.text.html.HTMLEditorKit.Parser.class;
        }

    }

    @RunWith(J8Unit4.class)
    public static class ParserCallbackClassTest
    implements
    org.j8unit.repository.javax.swing.text.html.HTMLEditorKitClassTests.ParserCallbackClassTests<javax.swing.text.html.HTMLEditorKit.ParserCallback> {

        @Override
        public Class<javax.swing.text.html.HTMLEditorKit.ParserCallback> createNewSUT() {
            return javax.swing.text.html.HTMLEditorKit.ParserCallback.class;
        }

    }

    @RunWith(J8Unit4.class)
    public static class HTMLTextActionClassTest
    implements
    org.j8unit.repository.javax.swing.text.html.HTMLEditorKitClassTests.HTMLTextActionClassTests<javax.swing.text.html.HTMLEditorKit.HTMLTextAction> {

        @Override
        public Class<javax.swing.text.html.HTMLEditorKit.HTMLTextAction> createNewSUT() {
            return javax.swing.text.html.HTMLEditorKit.HTMLTextAction.class;
        }

    }

    @RunWith(J8Unit4.class)
    public static class LinkControllerClassTest
    implements
    org.j8unit.repository.javax.swing.text.html.HTMLEditorKitClassTests.LinkControllerClassTests<javax.swing.text.html.HTMLEditorKit.LinkController> {

        @Override
        public Class<javax.swing.text.html.HTMLEditorKit.LinkController> createNewSUT() {
            return javax.swing.text.html.HTMLEditorKit.LinkController.class;
        }

    }

    @RunWith(J8Unit4.class)
    public static class InsertHTMLTextActionClassTest
    implements
    org.j8unit.repository.javax.swing.text.html.HTMLEditorKitClassTests.InsertHTMLTextActionClassTests<javax.swing.text.html.HTMLEditorKit.InsertHTMLTextAction> {

        @Override
        public Class<javax.swing.text.html.HTMLEditorKit.InsertHTMLTextAction> createNewSUT() {
            return javax.swing.text.html.HTMLEditorKit.InsertHTMLTextAction.class;
        }

    }

}
