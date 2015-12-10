package org.j8unit.repository.javax.swing;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class JMenuBarClassTest
implements org.j8unit.repository.javax.swing.JMenuBarClassTests<javax.swing.JMenuBar> {

    @Override
    public Class<javax.swing.JMenuBar> createNewSUT() {
        return javax.swing.JMenuBar.class;
    }

}
