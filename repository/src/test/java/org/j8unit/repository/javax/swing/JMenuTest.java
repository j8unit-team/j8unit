package org.j8unit.repository.javax.swing;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class JMenuTest
implements org.j8unit.repository.javax.swing.JMenuTests<javax.swing.JMenu> {

    @Override
    public javax.swing.JMenu createNewSUT() {
        return new javax.swing.JMenu();
    }

}
