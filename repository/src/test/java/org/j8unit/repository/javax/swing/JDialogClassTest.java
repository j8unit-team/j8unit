package org.j8unit.repository.javax.swing;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class JDialogClassTest
implements org.j8unit.repository.javax.swing.JDialogClassTests<javax.swing.JDialog> {

    @Override
    public Class<javax.swing.JDialog> createNewSUT() {
        return javax.swing.JDialog.class;
    }

}
