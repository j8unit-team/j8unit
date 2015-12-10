package org.j8unit.repository.javax.swing.text;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class BadLocationExceptionTest
implements org.j8unit.repository.javax.swing.text.BadLocationExceptionTests<javax.swing.text.BadLocationException> {

    @Override
    public javax.swing.text.BadLocationException createNewSUT() {
        throw new AssumptionViolatedException("There is no default constructor for [javax.swing.text.BadLocationException] available.");
    }

}
