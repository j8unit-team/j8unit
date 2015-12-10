package org.j8unit.repository.javax.swing;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class JPasswordFieldTest
implements org.j8unit.repository.javax.swing.JPasswordFieldTests<javax.swing.JPasswordField> {

    @Override
    public javax.swing.JPasswordField createNewSUT() {
        return new javax.swing.JPasswordField();
    }

}
