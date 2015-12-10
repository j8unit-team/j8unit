package org.j8unit.repository.javax.swing.text.html;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class StyleSheetTest
implements org.j8unit.repository.javax.swing.text.html.StyleSheetTests<javax.swing.text.html.StyleSheet> {

    @RunWith(J8Unit4.class)
    public static class BoxPainterTest
    implements org.j8unit.repository.javax.swing.text.html.StyleSheetTests.BoxPainterTests<javax.swing.text.html.StyleSheet.BoxPainter> {

        @Override
        public javax.swing.text.html.StyleSheet.BoxPainter createNewSUT() {
            throw new AssumptionViolatedException("There is no default constructor for [javax.swing.text.html.StyleSheet.BoxPainter] available.");
        }

    }

    @RunWith(J8Unit4.class)
    public static class ListPainterTest
    implements org.j8unit.repository.javax.swing.text.html.StyleSheetTests.ListPainterTests<javax.swing.text.html.StyleSheet.ListPainter> {

        @Override
        public javax.swing.text.html.StyleSheet.ListPainter createNewSUT() {
            throw new AssumptionViolatedException("There is no default constructor for [javax.swing.text.html.StyleSheet.ListPainter] available.");
        }

    }

    @Override
    public javax.swing.text.html.StyleSheet createNewSUT() {
        return new javax.swing.text.html.StyleSheet();
    }

}
