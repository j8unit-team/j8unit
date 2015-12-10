package org.j8unit.repository.javax.swing;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class JDialogTest
implements org.j8unit.repository.javax.swing.JDialogTests<javax.swing.JDialog> {

    @Override
    public javax.swing.JDialog createNewSUT() {
        return new javax.swing.JDialog();
    }

}
