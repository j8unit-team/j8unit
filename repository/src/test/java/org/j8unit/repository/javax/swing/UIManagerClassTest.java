package org.j8unit.repository.javax.swing;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class UIManagerClassTest
implements org.j8unit.repository.javax.swing.UIManagerClassTests<javax.swing.UIManager> {

    @RunWith(J8Unit4.class)
    public static class LookAndFeelInfoClassTest
    implements org.j8unit.repository.javax.swing.UIManagerClassTests.LookAndFeelInfoClassTests<javax.swing.UIManager.LookAndFeelInfo> {

        @Override
        public Class<javax.swing.UIManager.LookAndFeelInfo> createNewSUT() {
            return javax.swing.UIManager.LookAndFeelInfo.class;
        }

    }

    @Override
    public Class<javax.swing.UIManager> createNewSUT() {
        return javax.swing.UIManager.class;
    }

}
