package org.j8unit.repository.javax.swing;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class UnsupportedLookAndFeelExceptionClassTest
implements org.j8unit.repository.javax.swing.UnsupportedLookAndFeelExceptionClassTests<javax.swing.UnsupportedLookAndFeelException> {

    @Override
    public Class<javax.swing.UnsupportedLookAndFeelException> createNewSUT() {
        return javax.swing.UnsupportedLookAndFeelException.class;
    }

}
