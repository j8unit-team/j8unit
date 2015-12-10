package org.j8unit.repository.javax.swing;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class UnsupportedLookAndFeelExceptionTest
implements org.j8unit.repository.javax.swing.UnsupportedLookAndFeelExceptionTests<javax.swing.UnsupportedLookAndFeelException> {

    @Override
    public javax.swing.UnsupportedLookAndFeelException createNewSUT() {
        throw new AssumptionViolatedException("There is no default constructor for [javax.swing.UnsupportedLookAndFeelException] available.");
    }

}
