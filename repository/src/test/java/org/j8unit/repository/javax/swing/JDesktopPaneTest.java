package org.j8unit.repository.javax.swing;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class JDesktopPaneTest
implements org.j8unit.repository.javax.swing.JDesktopPaneTests<javax.swing.JDesktopPane> {

    @Override
    public javax.swing.JDesktopPane createNewSUT() {
        return new javax.swing.JDesktopPane();
    }

}
