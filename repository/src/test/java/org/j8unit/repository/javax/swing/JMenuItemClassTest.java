package org.j8unit.repository.javax.swing;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class JMenuItemClassTest
implements org.j8unit.repository.javax.swing.JMenuItemClassTests<javax.swing.JMenuItem> {

    @Override
    public Class<javax.swing.JMenuItem> createNewSUT() {
        return javax.swing.JMenuItem.class;
    }

}
