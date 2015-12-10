package org.j8unit.repository.javax.swing.plaf.basic;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class BasicToolBarUITest
implements org.j8unit.repository.javax.swing.plaf.basic.BasicToolBarUITests<javax.swing.plaf.basic.BasicToolBarUI> {

    @RunWith(J8Unit4.class)
    public static class DockingListenerTest
    implements org.j8unit.repository.javax.swing.plaf.basic.BasicToolBarUITests.DockingListenerTests<javax.swing.plaf.basic.BasicToolBarUI.DockingListener> {

        @Override
        public javax.swing.plaf.basic.BasicToolBarUI.DockingListener createNewSUT() {
            throw new AssumptionViolatedException("There is no default constructor for [javax.swing.plaf.basic.BasicToolBarUI.DockingListener] available.");
        }

    }

    @Override
    public javax.swing.plaf.basic.BasicToolBarUI createNewSUT() {
        return new javax.swing.plaf.basic.BasicToolBarUI();
    }

}
