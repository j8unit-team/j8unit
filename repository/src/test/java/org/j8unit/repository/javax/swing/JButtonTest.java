package org.j8unit.repository.javax.swing;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class JButtonTest
implements org.j8unit.repository.javax.swing.JButtonTests<javax.swing.JButton> {

    @Override
    public javax.swing.JButton createNewSUT() {
        return new javax.swing.JButton();
    }

}
