package org.j8unit.repository.javax.swing;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class KeyStrokeClassTest
implements org.j8unit.repository.javax.swing.KeyStrokeClassTests<javax.swing.KeyStroke> {

    @Override
    public Class<javax.swing.KeyStroke> createNewSUT() {
        return javax.swing.KeyStroke.class;
    }

}
