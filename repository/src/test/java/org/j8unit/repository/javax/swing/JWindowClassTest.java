package org.j8unit.repository.javax.swing;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class JWindowClassTest
implements org.j8unit.repository.javax.swing.JWindowClassTests<javax.swing.JWindow> {

    @Override
    public Class<javax.swing.JWindow> createNewSUT() {
        return javax.swing.JWindow.class;
    }

}
