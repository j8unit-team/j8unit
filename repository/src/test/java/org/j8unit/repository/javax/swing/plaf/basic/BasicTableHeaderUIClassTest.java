package org.j8unit.repository.javax.swing.plaf.basic;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class BasicTableHeaderUIClassTest
implements org.j8unit.repository.javax.swing.plaf.basic.BasicTableHeaderUIClassTests<javax.swing.plaf.basic.BasicTableHeaderUI> {

    @Override
    public Class<javax.swing.plaf.basic.BasicTableHeaderUI> createNewSUT() {
        return javax.swing.plaf.basic.BasicTableHeaderUI.class;
    }

    @RunWith(J8Unit4.class)
    public static class MouseInputHandlerClassTest
    implements
    org.j8unit.repository.javax.swing.plaf.basic.BasicTableHeaderUIClassTests.MouseInputHandlerClassTests<javax.swing.plaf.basic.BasicTableHeaderUI.MouseInputHandler> {

        @Override
        public Class<javax.swing.plaf.basic.BasicTableHeaderUI.MouseInputHandler> createNewSUT() {
            return javax.swing.plaf.basic.BasicTableHeaderUI.MouseInputHandler.class;
        }

    }

}
