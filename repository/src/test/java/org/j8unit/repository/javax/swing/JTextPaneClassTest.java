package org.j8unit.repository.javax.swing;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class JTextPaneClassTest
implements org.j8unit.repository.javax.swing.JTextPaneClassTests<javax.swing.JTextPane> {

    @Override
    public Class<javax.swing.JTextPane> createNewSUT() {
        return javax.swing.JTextPane.class;
    }

}
