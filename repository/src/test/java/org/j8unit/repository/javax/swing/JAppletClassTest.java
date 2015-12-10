package org.j8unit.repository.javax.swing;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class JAppletClassTest
implements org.j8unit.repository.javax.swing.JAppletClassTests<javax.swing.JApplet> {

    @Override
    public Class<javax.swing.JApplet> createNewSUT() {
        return javax.swing.JApplet.class;
    }

}
