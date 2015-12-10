package org.j8unit.repository.javax.swing;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class PopupClassTest
implements org.j8unit.repository.javax.swing.PopupClassTests<javax.swing.Popup> {

    @Override
    public Class<javax.swing.Popup> createNewSUT() {
        return javax.swing.Popup.class;
    }

}
