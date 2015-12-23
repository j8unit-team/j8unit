package org.j8unit.repository.javax.swing.text.html;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class StyleSheetClassTest
implements org.j8unit.repository.javax.swing.text.html.StyleSheetClassTests<javax.swing.text.html.StyleSheet> {

    @Override
    public Class<javax.swing.text.html.StyleSheet> createNewSUT() {
        return javax.swing.text.html.StyleSheet.class;
    }

    @RunWith(J8Unit4.class)
    public static class BoxPainterClassTest
    implements org.j8unit.repository.javax.swing.text.html.StyleSheetClassTests.BoxPainterClassTests<javax.swing.text.html.StyleSheet.BoxPainter> {

        @Override
        public Class<javax.swing.text.html.StyleSheet.BoxPainter> createNewSUT() {
            return javax.swing.text.html.StyleSheet.BoxPainter.class;
        }

    }

    @RunWith(J8Unit4.class)
    public static class ListPainterClassTest
    implements org.j8unit.repository.javax.swing.text.html.StyleSheetClassTests.ListPainterClassTests<javax.swing.text.html.StyleSheet.ListPainter> {

        @Override
        public Class<javax.swing.text.html.StyleSheet.ListPainter> createNewSUT() {
            return javax.swing.text.html.StyleSheet.ListPainter.class;
        }

    }

}
