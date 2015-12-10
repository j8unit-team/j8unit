package org.j8unit.repository.javax.swing;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class JAppletTest
implements org.j8unit.repository.javax.swing.JAppletTests<javax.swing.JApplet> {

    @Override
    public javax.swing.JApplet createNewSUT() {
        return new javax.swing.JApplet();
    }

}
