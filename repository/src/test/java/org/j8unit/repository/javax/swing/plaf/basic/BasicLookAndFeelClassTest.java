package org.j8unit.repository.javax.swing.plaf.basic;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class BasicLookAndFeelClassTest
implements org.j8unit.repository.javax.swing.plaf.basic.BasicLookAndFeelClassTests<javax.swing.plaf.basic.BasicLookAndFeel> {

    @Override
    public Class<javax.swing.plaf.basic.BasicLookAndFeel> createNewSUT() {
        return javax.swing.plaf.basic.BasicLookAndFeel.class;
    }

}
