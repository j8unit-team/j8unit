package org.j8unit.repository.javax.swing;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class JFileChooserTest
implements org.j8unit.repository.javax.swing.JFileChooserTests<javax.swing.JFileChooser> {

    @Override
    public javax.swing.JFileChooser createNewSUT() {
        return new javax.swing.JFileChooser();
    }

}
