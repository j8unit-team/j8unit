package org.j8unit.repository.javax.swing.plaf.basic;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class BasicTableUIClassTest
implements org.j8unit.repository.javax.swing.plaf.basic.BasicTableUIClassTests<javax.swing.plaf.basic.BasicTableUI> {

    @RunWith(J8Unit4.class)
    public static class FocusHandlerClassTest
    implements org.j8unit.repository.javax.swing.plaf.basic.BasicTableUIClassTests.FocusHandlerClassTests<javax.swing.plaf.basic.BasicTableUI.FocusHandler> {

        @Override
        public Class<javax.swing.plaf.basic.BasicTableUI.FocusHandler> createNewSUT() {
            return javax.swing.plaf.basic.BasicTableUI.FocusHandler.class;
        }

    }

    @RunWith(J8Unit4.class)
    public static class KeyHandlerClassTest
    implements org.j8unit.repository.javax.swing.plaf.basic.BasicTableUIClassTests.KeyHandlerClassTests<javax.swing.plaf.basic.BasicTableUI.KeyHandler> {

        @Override
        public Class<javax.swing.plaf.basic.BasicTableUI.KeyHandler> createNewSUT() {
            return javax.swing.plaf.basic.BasicTableUI.KeyHandler.class;
        }

    }

    @RunWith(J8Unit4.class)
    public static class MouseInputHandlerClassTest
    implements
    org.j8unit.repository.javax.swing.plaf.basic.BasicTableUIClassTests.MouseInputHandlerClassTests<javax.swing.plaf.basic.BasicTableUI.MouseInputHandler> {

        @Override
        public Class<javax.swing.plaf.basic.BasicTableUI.MouseInputHandler> createNewSUT() {
            return javax.swing.plaf.basic.BasicTableUI.MouseInputHandler.class;
        }

    }

    @Override
    public Class<javax.swing.plaf.basic.BasicTableUI> createNewSUT() {
        return javax.swing.plaf.basic.BasicTableUI.class;
    }

}
