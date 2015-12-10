package org.j8unit.repository.javax.swing;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class JRadioButtonTest
implements org.j8unit.repository.javax.swing.JRadioButtonTests<javax.swing.JRadioButton> {

    @Override
    public javax.swing.JRadioButton createNewSUT() {
        return new javax.swing.JRadioButton();
    }

}
