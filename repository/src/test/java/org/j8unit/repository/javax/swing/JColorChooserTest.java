package org.j8unit.repository.javax.swing;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class JColorChooserTest
implements org.j8unit.repository.javax.swing.JColorChooserTests<javax.swing.JColorChooser> {

    @Override
    public javax.swing.JColorChooser createNewSUT() {
        return new javax.swing.JColorChooser();
    }

}
