package org.j8unit.repository.javax.swing;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class JRootPaneTest
implements org.j8unit.repository.javax.swing.JRootPaneTests<javax.swing.JRootPane> {

    @Override
    public javax.swing.JRootPane createNewSUT() {
        return new javax.swing.JRootPane();
    }

}
