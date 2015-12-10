package org.j8unit.repository.javax.swing;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class JWindowTest
implements org.j8unit.repository.javax.swing.JWindowTests<javax.swing.JWindow> {

    @Override
    public javax.swing.JWindow createNewSUT() {
        return new javax.swing.JWindow();
    }

}
