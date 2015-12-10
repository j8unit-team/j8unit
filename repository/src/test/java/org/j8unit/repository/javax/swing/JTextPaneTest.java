package org.j8unit.repository.javax.swing;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class JTextPaneTest
implements org.j8unit.repository.javax.swing.JTextPaneTests<javax.swing.JTextPane> {

    @Override
    public javax.swing.JTextPane createNewSUT() {
        return new javax.swing.JTextPane();
    }

}
