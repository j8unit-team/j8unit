package org.j8unit.repository.javax.swing;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class JPanelTest
implements org.j8unit.repository.javax.swing.JPanelTests<javax.swing.JPanel> {

    @Override
    public javax.swing.JPanel createNewSUT() {
        return new javax.swing.JPanel();
    }

}
