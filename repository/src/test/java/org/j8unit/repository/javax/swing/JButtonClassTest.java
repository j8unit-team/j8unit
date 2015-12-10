package org.j8unit.repository.javax.swing;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class JButtonClassTest
implements org.j8unit.repository.javax.swing.JButtonClassTests<javax.swing.JButton> {

    @Override
    public Class<javax.swing.JButton> createNewSUT() {
        return javax.swing.JButton.class;
    }

}
