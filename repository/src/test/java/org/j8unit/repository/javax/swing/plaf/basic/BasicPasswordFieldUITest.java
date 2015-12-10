package org.j8unit.repository.javax.swing.plaf.basic;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class BasicPasswordFieldUITest
implements org.j8unit.repository.javax.swing.plaf.basic.BasicPasswordFieldUITests<javax.swing.plaf.basic.BasicPasswordFieldUI> {

    @Override
    public javax.swing.plaf.basic.BasicPasswordFieldUI createNewSUT() {
        return new javax.swing.plaf.basic.BasicPasswordFieldUI();
    }

}
