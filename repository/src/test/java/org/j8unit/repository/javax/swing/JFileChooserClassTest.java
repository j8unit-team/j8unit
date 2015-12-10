package org.j8unit.repository.javax.swing;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class JFileChooserClassTest
implements org.j8unit.repository.javax.swing.JFileChooserClassTests<javax.swing.JFileChooser> {

    @Override
    public Class<javax.swing.JFileChooser> createNewSUT() {
        return javax.swing.JFileChooser.class;
    }

}
