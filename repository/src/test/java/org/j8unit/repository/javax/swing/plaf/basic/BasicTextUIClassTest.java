package org.j8unit.repository.javax.swing.plaf.basic;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class BasicTextUIClassTest
implements org.j8unit.repository.javax.swing.plaf.basic.BasicTextUIClassTests<javax.swing.plaf.basic.BasicTextUI> {

    @RunWith(J8Unit4.class)
    public static class BasicCaretClassTest
    implements org.j8unit.repository.javax.swing.plaf.basic.BasicTextUIClassTests.BasicCaretClassTests<javax.swing.plaf.basic.BasicTextUI.BasicCaret> {

        @Override
        public Class<javax.swing.plaf.basic.BasicTextUI.BasicCaret> createNewSUT() {
            return javax.swing.plaf.basic.BasicTextUI.BasicCaret.class;
        }

    }

    @RunWith(J8Unit4.class)
    public static class BasicHighlighterClassTest
    implements
    org.j8unit.repository.javax.swing.plaf.basic.BasicTextUIClassTests.BasicHighlighterClassTests<javax.swing.plaf.basic.BasicTextUI.BasicHighlighter> {

        @Override
        public Class<javax.swing.plaf.basic.BasicTextUI.BasicHighlighter> createNewSUT() {
            return javax.swing.plaf.basic.BasicTextUI.BasicHighlighter.class;
        }

    }

    @Override
    public Class<javax.swing.plaf.basic.BasicTextUI> createNewSUT() {
        return javax.swing.plaf.basic.BasicTextUI.class;
    }

}
