package org.j8unit.repository.javax.swing.plaf.basic;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class BasicListUIClassTest
implements org.j8unit.repository.javax.swing.plaf.basic.BasicListUIClassTests<javax.swing.plaf.basic.BasicListUI> {

    @Override
    public Class<javax.swing.plaf.basic.BasicListUI> createNewSUT() {
        return javax.swing.plaf.basic.BasicListUI.class;
    }

    @RunWith(J8Unit4.class)
    public static class ListDataHandlerClassTest
    implements
    org.j8unit.repository.javax.swing.plaf.basic.BasicListUIClassTests.ListDataHandlerClassTests<javax.swing.plaf.basic.BasicListUI.ListDataHandler> {

        @Override
        public Class<javax.swing.plaf.basic.BasicListUI.ListDataHandler> createNewSUT() {
            return javax.swing.plaf.basic.BasicListUI.ListDataHandler.class;
        }

    }

    @RunWith(J8Unit4.class)
    public static class MouseInputHandlerClassTest
    implements
    org.j8unit.repository.javax.swing.plaf.basic.BasicListUIClassTests.MouseInputHandlerClassTests<javax.swing.plaf.basic.BasicListUI.MouseInputHandler> {

        @Override
        public Class<javax.swing.plaf.basic.BasicListUI.MouseInputHandler> createNewSUT() {
            return javax.swing.plaf.basic.BasicListUI.MouseInputHandler.class;
        }

    }

    @RunWith(J8Unit4.class)
    public static class PropertyChangeHandlerClassTest
    implements
    org.j8unit.repository.javax.swing.plaf.basic.BasicListUIClassTests.PropertyChangeHandlerClassTests<javax.swing.plaf.basic.BasicListUI.PropertyChangeHandler> {

        @Override
        public Class<javax.swing.plaf.basic.BasicListUI.PropertyChangeHandler> createNewSUT() {
            return javax.swing.plaf.basic.BasicListUI.PropertyChangeHandler.class;
        }

    }

    @RunWith(J8Unit4.class)
    public static class FocusHandlerClassTest
    implements org.j8unit.repository.javax.swing.plaf.basic.BasicListUIClassTests.FocusHandlerClassTests<javax.swing.plaf.basic.BasicListUI.FocusHandler> {

        @Override
        public Class<javax.swing.plaf.basic.BasicListUI.FocusHandler> createNewSUT() {
            return javax.swing.plaf.basic.BasicListUI.FocusHandler.class;
        }

    }

    @RunWith(J8Unit4.class)
    public static class ListSelectionHandlerClassTest
    implements
    org.j8unit.repository.javax.swing.plaf.basic.BasicListUIClassTests.ListSelectionHandlerClassTests<javax.swing.plaf.basic.BasicListUI.ListSelectionHandler> {

        @Override
        public Class<javax.swing.plaf.basic.BasicListUI.ListSelectionHandler> createNewSUT() {
            return javax.swing.plaf.basic.BasicListUI.ListSelectionHandler.class;
        }

    }

}
