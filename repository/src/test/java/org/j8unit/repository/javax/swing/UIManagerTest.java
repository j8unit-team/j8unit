package org.j8unit.repository.javax.swing;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class UIManagerTest
implements org.j8unit.repository.javax.swing.UIManagerTests<javax.swing.UIManager> {

    @RunWith(J8Unit4.class)
    public static class LookAndFeelInfoTest
    implements org.j8unit.repository.javax.swing.UIManagerTests.LookAndFeelInfoTests<javax.swing.UIManager.LookAndFeelInfo> {

        @Override
        public javax.swing.UIManager.LookAndFeelInfo createNewSUT() {
            throw new AssumptionViolatedException("There is no default constructor for [javax.swing.UIManager.LookAndFeelInfo] available.");
        }

    }

    @Override
    public javax.swing.UIManager createNewSUT() {
        return new javax.swing.UIManager();
    }

}
