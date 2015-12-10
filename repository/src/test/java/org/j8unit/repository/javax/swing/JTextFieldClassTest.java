package org.j8unit.repository.javax.swing;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class JTextFieldClassTest
implements org.j8unit.repository.javax.swing.JTextFieldClassTests<javax.swing.JTextField> {

    @Override
    public Class<javax.swing.JTextField> createNewSUT() {
        return javax.swing.JTextField.class;
    }

}
