package org.j8unit.repository.javax.swing.plaf.basic;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class BasicComboPopupClassTest
implements org.j8unit.repository.javax.swing.plaf.basic.BasicComboPopupClassTests<javax.swing.plaf.basic.BasicComboPopup> {

    @Override
    public Class<javax.swing.plaf.basic.BasicComboPopup> createNewSUT() {
        return javax.swing.plaf.basic.BasicComboPopup.class;
    }

    @RunWith(J8Unit4.class)
    public static class InvocationKeyHandlerClassTest
    implements
    org.j8unit.repository.javax.swing.plaf.basic.BasicComboPopupClassTests.InvocationKeyHandlerClassTests<javax.swing.plaf.basic.BasicComboPopup.InvocationKeyHandler> {

        @Override
        public Class<javax.swing.plaf.basic.BasicComboPopup.InvocationKeyHandler> createNewSUT() {
            return javax.swing.plaf.basic.BasicComboPopup.InvocationKeyHandler.class;
        }

    }

    @RunWith(J8Unit4.class)
    public static class ListDataHandlerClassTest
    implements
    org.j8unit.repository.javax.swing.plaf.basic.BasicComboPopupClassTests.ListDataHandlerClassTests<javax.swing.plaf.basic.BasicComboPopup.ListDataHandler> {

        @Override
        public Class<javax.swing.plaf.basic.BasicComboPopup.ListDataHandler> createNewSUT() {
            return javax.swing.plaf.basic.BasicComboPopup.ListDataHandler.class;
        }

    }

}
