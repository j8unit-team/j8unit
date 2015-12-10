package org.j8unit.repository.javax.swing;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class MenuElementClassTest
implements org.j8unit.repository.javax.swing.MenuElementClassTests<javax.swing.MenuElement> {

    @Override
    public Class<javax.swing.MenuElement> createNewSUT() {
        return javax.swing.MenuElement.class;
    }

}
