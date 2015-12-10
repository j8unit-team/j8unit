package org.j8unit.repository.javax.swing;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class JTextFieldTest
implements org.j8unit.repository.javax.swing.JTextFieldTests<javax.swing.JTextField> {

    @Override
    public javax.swing.JTextField createNewSUT() {
        return new javax.swing.JTextField();
    }

}
