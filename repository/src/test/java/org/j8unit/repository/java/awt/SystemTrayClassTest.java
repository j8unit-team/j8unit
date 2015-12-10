package org.j8unit.repository.java.awt;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SystemTrayClassTest
implements org.j8unit.repository.java.awt.SystemTrayClassTests<java.awt.SystemTray> {

    @Override
    public Class<java.awt.SystemTray> createNewSUT() {
        return java.awt.SystemTray.class;
    }

}
