package org.j8unit.repository.javax.swing.plaf.basic;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class BasicScrollPaneUIClassTest
implements org.j8unit.repository.javax.swing.plaf.basic.BasicScrollPaneUIClassTests<javax.swing.plaf.basic.BasicScrollPaneUI> {

    @Override
    public Class<javax.swing.plaf.basic.BasicScrollPaneUI> createNewSUT() {
        return javax.swing.plaf.basic.BasicScrollPaneUI.class;
    }

    @RunWith(J8Unit4.class)
    public static class PropertyChangeHandlerClassTest
    implements
    org.j8unit.repository.javax.swing.plaf.basic.BasicScrollPaneUIClassTests.PropertyChangeHandlerClassTests<javax.swing.plaf.basic.BasicScrollPaneUI.PropertyChangeHandler> {

        @Override
        public Class<javax.swing.plaf.basic.BasicScrollPaneUI.PropertyChangeHandler> createNewSUT() {
            return javax.swing.plaf.basic.BasicScrollPaneUI.PropertyChangeHandler.class;
        }

    }

    @RunWith(J8Unit4.class)
    public static class ViewportChangeHandlerClassTest
    implements
    org.j8unit.repository.javax.swing.plaf.basic.BasicScrollPaneUIClassTests.ViewportChangeHandlerClassTests<javax.swing.plaf.basic.BasicScrollPaneUI.ViewportChangeHandler> {

        @Override
        public Class<javax.swing.plaf.basic.BasicScrollPaneUI.ViewportChangeHandler> createNewSUT() {
            return javax.swing.plaf.basic.BasicScrollPaneUI.ViewportChangeHandler.class;
        }

    }

    @RunWith(J8Unit4.class)
    public static class HSBChangeListenerClassTest
    implements
    org.j8unit.repository.javax.swing.plaf.basic.BasicScrollPaneUIClassTests.HSBChangeListenerClassTests<javax.swing.plaf.basic.BasicScrollPaneUI.HSBChangeListener> {

        @Override
        public Class<javax.swing.plaf.basic.BasicScrollPaneUI.HSBChangeListener> createNewSUT() {
            return javax.swing.plaf.basic.BasicScrollPaneUI.HSBChangeListener.class;
        }

    }

    @RunWith(J8Unit4.class)
    public static class VSBChangeListenerClassTest
    implements
    org.j8unit.repository.javax.swing.plaf.basic.BasicScrollPaneUIClassTests.VSBChangeListenerClassTests<javax.swing.plaf.basic.BasicScrollPaneUI.VSBChangeListener> {

        @Override
        public Class<javax.swing.plaf.basic.BasicScrollPaneUI.VSBChangeListener> createNewSUT() {
            return javax.swing.plaf.basic.BasicScrollPaneUI.VSBChangeListener.class;
        }

    }

}
