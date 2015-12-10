package org.j8unit.repository.javax.swing;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class JTextAreaTest
implements org.j8unit.repository.javax.swing.JTextAreaTests<javax.swing.JTextArea> {

    @Override
    public javax.swing.JTextArea createNewSUT() {
        return new javax.swing.JTextArea();
    }

}
