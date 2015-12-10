package org.j8unit.repository.javax.swing.plaf.basic;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class BasicDesktopIconUITest
implements org.j8unit.repository.javax.swing.plaf.basic.BasicDesktopIconUITests<javax.swing.plaf.basic.BasicDesktopIconUI> {

    @RunWith(J8Unit4.class)
    public static class MouseInputHandlerTest
    implements
    org.j8unit.repository.javax.swing.plaf.basic.BasicDesktopIconUITests.MouseInputHandlerTests<javax.swing.plaf.basic.BasicDesktopIconUI.MouseInputHandler> {

        @Override
        public javax.swing.plaf.basic.BasicDesktopIconUI.MouseInputHandler createNewSUT() {
            throw new AssertionError("There is no default constructor for [javax.swing.plaf.basic.BasicDesktopIconUI.MouseInputHandler] available.");
        }

    }

    @Override
    public javax.swing.plaf.basic.BasicDesktopIconUI createNewSUT() {
        return new javax.swing.plaf.basic.BasicDesktopIconUI();
    }

}
