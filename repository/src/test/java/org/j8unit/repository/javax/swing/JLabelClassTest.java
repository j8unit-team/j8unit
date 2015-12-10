package org.j8unit.repository.javax.swing;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class JLabelClassTest
implements org.j8unit.repository.javax.swing.JLabelClassTests<javax.swing.JLabel> {

    @Override
    public Class<javax.swing.JLabel> createNewSUT() {
        return javax.swing.JLabel.class;
    }

}
