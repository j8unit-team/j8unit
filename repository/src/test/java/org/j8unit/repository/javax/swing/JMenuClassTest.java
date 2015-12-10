package org.j8unit.repository.javax.swing;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class JMenuClassTest
implements org.j8unit.repository.javax.swing.JMenuClassTests<javax.swing.JMenu> {

    @Override
    public Class<javax.swing.JMenu> createNewSUT() {
        return javax.swing.JMenu.class;
    }

}
