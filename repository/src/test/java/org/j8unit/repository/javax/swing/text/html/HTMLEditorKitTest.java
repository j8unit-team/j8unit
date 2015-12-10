package org.j8unit.repository.javax.swing.text.html;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class HTMLEditorKitTest
implements org.j8unit.repository.javax.swing.text.html.HTMLEditorKitTests<javax.swing.text.html.HTMLEditorKit> {

    @RunWith(J8Unit4.class)
    public static class HTMLFactoryTest
    implements org.j8unit.repository.javax.swing.text.html.HTMLEditorKitTests.HTMLFactoryTests<javax.swing.text.html.HTMLEditorKit.HTMLFactory> {

        @Override
        public javax.swing.text.html.HTMLEditorKit.HTMLFactory createNewSUT() {
            return new javax.swing.text.html.HTMLEditorKit.HTMLFactory();
        }

    }

    @RunWith(J8Unit4.class)
    public static class InsertHTMLTextActionTest
    implements
    org.j8unit.repository.javax.swing.text.html.HTMLEditorKitTests.InsertHTMLTextActionTests<javax.swing.text.html.HTMLEditorKit.InsertHTMLTextAction> {

        @Override
        public javax.swing.text.html.HTMLEditorKit.InsertHTMLTextAction createNewSUT() {
            throw new AssumptionViolatedException("There is no default constructor for [javax.swing.text.html.HTMLEditorKit.InsertHTMLTextAction] available.");
        }

    }

    @RunWith(J8Unit4.class)
    public static class LinkControllerTest
    implements org.j8unit.repository.javax.swing.text.html.HTMLEditorKitTests.LinkControllerTests<javax.swing.text.html.HTMLEditorKit.LinkController> {

        @Override
        public javax.swing.text.html.HTMLEditorKit.LinkController createNewSUT() {
            return new javax.swing.text.html.HTMLEditorKit.LinkController();
        }

    }

    @RunWith(J8Unit4.class)
    public static class ParserCallbackTest
    implements org.j8unit.repository.javax.swing.text.html.HTMLEditorKitTests.ParserCallbackTests<javax.swing.text.html.HTMLEditorKit.ParserCallback> {

        @Override
        public javax.swing.text.html.HTMLEditorKit.ParserCallback createNewSUT() {
            return new javax.swing.text.html.HTMLEditorKit.ParserCallback();
        }

    }

    @Override
    public javax.swing.text.html.HTMLEditorKit createNewSUT() {
        return new javax.swing.text.html.HTMLEditorKit();
    }

}
