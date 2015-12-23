package org.j8unit.repository.javax.swing.plaf.basic;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class BasicDesktopIconUIClassTest
implements org.j8unit.repository.javax.swing.plaf.basic.BasicDesktopIconUIClassTests<javax.swing.plaf.basic.BasicDesktopIconUI> {

    @Override
    public Class<javax.swing.plaf.basic.BasicDesktopIconUI> createNewSUT() {
        return javax.swing.plaf.basic.BasicDesktopIconUI.class;
    }

    @RunWith(J8Unit4.class)
    public static class MouseInputHandlerClassTest
    implements
    org.j8unit.repository.javax.swing.plaf.basic.BasicDesktopIconUIClassTests.MouseInputHandlerClassTests<javax.swing.plaf.basic.BasicDesktopIconUI.MouseInputHandler> {

        @Override
        public Class<javax.swing.plaf.basic.BasicDesktopIconUI.MouseInputHandler> createNewSUT() {
            return javax.swing.plaf.basic.BasicDesktopIconUI.MouseInputHandler.class;
        }

    }

}
