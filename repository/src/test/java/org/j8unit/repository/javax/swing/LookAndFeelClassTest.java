package org.j8unit.repository.javax.swing;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class LookAndFeelClassTest
implements org.j8unit.repository.javax.swing.LookAndFeelClassTests<javax.swing.LookAndFeel> {

    @Override
    public Class<javax.swing.LookAndFeel> createNewSUT() {
        return javax.swing.LookAndFeel.class;
    }

}
