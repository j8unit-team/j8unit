package org.j8unit.repository.javax.swing;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class JOptionPaneClassTest
implements org.j8unit.repository.javax.swing.JOptionPaneClassTests<javax.swing.JOptionPane> {

    @Override
    public Class<javax.swing.JOptionPane> createNewSUT() {
        return javax.swing.JOptionPane.class;
    }

}
