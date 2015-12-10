package org.j8unit.repository.javax.swing;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class JTabbedPaneTest
implements org.j8unit.repository.javax.swing.JTabbedPaneTests<javax.swing.JTabbedPane> {

    @Override
    public javax.swing.JTabbedPane createNewSUT() {
        return new javax.swing.JTabbedPane();
    }

}
