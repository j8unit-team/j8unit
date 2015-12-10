package org.j8unit.repository.javax.swing.plaf.basic;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class BasicTextFieldUITest
implements org.j8unit.repository.javax.swing.plaf.basic.BasicTextFieldUITests<javax.swing.plaf.basic.BasicTextFieldUI> {

    @Override
    public javax.swing.plaf.basic.BasicTextFieldUI createNewSUT() {
        return new javax.swing.plaf.basic.BasicTextFieldUI();
    }

}
