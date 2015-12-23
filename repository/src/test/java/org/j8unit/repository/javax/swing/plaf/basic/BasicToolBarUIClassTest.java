package org.j8unit.repository.javax.swing.plaf.basic;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class BasicToolBarUIClassTest
implements org.j8unit.repository.javax.swing.plaf.basic.BasicToolBarUIClassTests<javax.swing.plaf.basic.BasicToolBarUI> {

    @Override
    public Class<javax.swing.plaf.basic.BasicToolBarUI> createNewSUT() {
        return javax.swing.plaf.basic.BasicToolBarUI.class;
    }

    @RunWith(J8Unit4.class)
    public static class DockingListenerClassTest
    implements
    org.j8unit.repository.javax.swing.plaf.basic.BasicToolBarUIClassTests.DockingListenerClassTests<javax.swing.plaf.basic.BasicToolBarUI.DockingListener> {

        @Override
        public Class<javax.swing.plaf.basic.BasicToolBarUI.DockingListener> createNewSUT() {
            return javax.swing.plaf.basic.BasicToolBarUI.DockingListener.class;
        }

    }

}
