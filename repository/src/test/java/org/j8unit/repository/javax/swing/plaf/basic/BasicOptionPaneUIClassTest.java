package org.j8unit.repository.javax.swing.plaf.basic;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class BasicOptionPaneUIClassTest
implements org.j8unit.repository.javax.swing.plaf.basic.BasicOptionPaneUIClassTests<javax.swing.plaf.basic.BasicOptionPaneUI> {

    @RunWith(J8Unit4.class)
    public static class ButtonActionListenerClassTest
    implements
    org.j8unit.repository.javax.swing.plaf.basic.BasicOptionPaneUIClassTests.ButtonActionListenerClassTests<javax.swing.plaf.basic.BasicOptionPaneUI.ButtonActionListener> {

        @Override
        public Class<javax.swing.plaf.basic.BasicOptionPaneUI.ButtonActionListener> createNewSUT() {
            return javax.swing.plaf.basic.BasicOptionPaneUI.ButtonActionListener.class;
        }

    }

    @RunWith(J8Unit4.class)
    public static class ButtonAreaLayoutClassTest
    implements
    org.j8unit.repository.javax.swing.plaf.basic.BasicOptionPaneUIClassTests.ButtonAreaLayoutClassTests<javax.swing.plaf.basic.BasicOptionPaneUI.ButtonAreaLayout> {

        @Override
        public Class<javax.swing.plaf.basic.BasicOptionPaneUI.ButtonAreaLayout> createNewSUT() {
            return javax.swing.plaf.basic.BasicOptionPaneUI.ButtonAreaLayout.class;
        }

    }

    @RunWith(J8Unit4.class)
    public static class PropertyChangeHandlerClassTest
    implements
    org.j8unit.repository.javax.swing.plaf.basic.BasicOptionPaneUIClassTests.PropertyChangeHandlerClassTests<javax.swing.plaf.basic.BasicOptionPaneUI.PropertyChangeHandler> {

        @Override
        public Class<javax.swing.plaf.basic.BasicOptionPaneUI.PropertyChangeHandler> createNewSUT() {
            return javax.swing.plaf.basic.BasicOptionPaneUI.PropertyChangeHandler.class;
        }

    }

    @Override
    public Class<javax.swing.plaf.basic.BasicOptionPaneUI> createNewSUT() {
        return javax.swing.plaf.basic.BasicOptionPaneUI.class;
    }

}
