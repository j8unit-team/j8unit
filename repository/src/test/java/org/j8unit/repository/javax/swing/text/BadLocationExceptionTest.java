package org.j8unit.repository.javax.swing.text;

import javax.swing.text.BadLocationException;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link BadLocationException} (by simply
 * reusing the J8Unit test interface {@link org.j8unit.repository.javax.swing.text.BadLocationExceptionTests}).
 */
@RunWith(J8Unit4.class)
public class BadLocationExceptionTest
implements BadLocationExceptionTests<BadLocationException> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.text.BadLocationException]

    @Override
    public BadLocationException createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.swing.text.BadLocationException], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.text.BadLocationException]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.text.BadLocationException]

}
