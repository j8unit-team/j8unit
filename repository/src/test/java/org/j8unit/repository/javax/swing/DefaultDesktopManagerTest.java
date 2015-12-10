package org.j8unit.repository.javax.swing;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DefaultDesktopManagerTest
implements org.j8unit.repository.javax.swing.DefaultDesktopManagerTests<javax.swing.DefaultDesktopManager> {

    @Override
    public javax.swing.DefaultDesktopManager createNewSUT() {
        return new javax.swing.DefaultDesktopManager();
    }

}
