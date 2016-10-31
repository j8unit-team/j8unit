package org.j8unit.repository.javax.swing;

import javax.swing.UnsupportedLookAndFeelException;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class UnsupportedLookAndFeelExceptionTest
implements org.j8unit.repository.javax.swing.UnsupportedLookAndFeelExceptionTests<UnsupportedLookAndFeelException> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.UnsupportedLookAndFeelException]

    @Override
    public UnsupportedLookAndFeelException createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.swing.UnsupportedLookAndFeelException], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.UnsupportedLookAndFeelException]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.UnsupportedLookAndFeelException]

}
