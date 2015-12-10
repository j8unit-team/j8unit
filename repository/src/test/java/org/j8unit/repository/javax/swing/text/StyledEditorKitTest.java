package org.j8unit.repository.javax.swing.text;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class StyledEditorKitTest
implements org.j8unit.repository.javax.swing.text.StyledEditorKitTests<javax.swing.text.StyledEditorKit> {

    @RunWith(J8Unit4.class)
    public static class AlignmentActionTest
    implements org.j8unit.repository.javax.swing.text.StyledEditorKitTests.AlignmentActionTests<javax.swing.text.StyledEditorKit.AlignmentAction> {

        @Override
        public javax.swing.text.StyledEditorKit.AlignmentAction createNewSUT() {
            throw new AssumptionViolatedException("There is no default constructor for [javax.swing.text.StyledEditorKit.AlignmentAction] available.");
        }

    }

    @RunWith(J8Unit4.class)
    public static class BoldActionTest
    implements org.j8unit.repository.javax.swing.text.StyledEditorKitTests.BoldActionTests<javax.swing.text.StyledEditorKit.BoldAction> {

        @Override
        public javax.swing.text.StyledEditorKit.BoldAction createNewSUT() {
            return new javax.swing.text.StyledEditorKit.BoldAction();
        }

    }

    @RunWith(J8Unit4.class)
    public static class FontFamilyActionTest
    implements org.j8unit.repository.javax.swing.text.StyledEditorKitTests.FontFamilyActionTests<javax.swing.text.StyledEditorKit.FontFamilyAction> {

        @Override
        public javax.swing.text.StyledEditorKit.FontFamilyAction createNewSUT() {
            throw new AssumptionViolatedException("There is no default constructor for [javax.swing.text.StyledEditorKit.FontFamilyAction] available.");
        }

    }

    @RunWith(J8Unit4.class)
    public static class FontSizeActionTest
    implements org.j8unit.repository.javax.swing.text.StyledEditorKitTests.FontSizeActionTests<javax.swing.text.StyledEditorKit.FontSizeAction> {

        @Override
        public javax.swing.text.StyledEditorKit.FontSizeAction createNewSUT() {
            throw new AssumptionViolatedException("There is no default constructor for [javax.swing.text.StyledEditorKit.FontSizeAction] available.");
        }

    }

    @RunWith(J8Unit4.class)
    public static class ForegroundActionTest
    implements org.j8unit.repository.javax.swing.text.StyledEditorKitTests.ForegroundActionTests<javax.swing.text.StyledEditorKit.ForegroundAction> {

        @Override
        public javax.swing.text.StyledEditorKit.ForegroundAction createNewSUT() {
            throw new AssumptionViolatedException("There is no default constructor for [javax.swing.text.StyledEditorKit.ForegroundAction] available.");
        }

    }

    @RunWith(J8Unit4.class)
    public static class ItalicActionTest
    implements org.j8unit.repository.javax.swing.text.StyledEditorKitTests.ItalicActionTests<javax.swing.text.StyledEditorKit.ItalicAction> {

        @Override
        public javax.swing.text.StyledEditorKit.ItalicAction createNewSUT() {
            return new javax.swing.text.StyledEditorKit.ItalicAction();
        }

    }

    @RunWith(J8Unit4.class)
    public static class UnderlineActionTest
    implements org.j8unit.repository.javax.swing.text.StyledEditorKitTests.UnderlineActionTests<javax.swing.text.StyledEditorKit.UnderlineAction> {

        @Override
        public javax.swing.text.StyledEditorKit.UnderlineAction createNewSUT() {
            return new javax.swing.text.StyledEditorKit.UnderlineAction();
        }

    }

    @Override
    public javax.swing.text.StyledEditorKit createNewSUT() {
        return new javax.swing.text.StyledEditorKit();
    }

}
