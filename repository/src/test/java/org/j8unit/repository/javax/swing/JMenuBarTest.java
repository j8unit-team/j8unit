package org.j8unit.repository.javax.swing;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class JMenuBarTest
implements org.j8unit.repository.javax.swing.JMenuBarTests<javax.swing.JMenuBar> {

    @Override
    public javax.swing.JMenuBar createNewSUT() {
        return new javax.swing.JMenuBar();
    }

}
