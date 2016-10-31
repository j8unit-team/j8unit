package org.j8unit.repository.javax.swing;

import javax.swing.KeyStroke;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class KeyStrokeTest
implements org.j8unit.repository.javax.swing.KeyStrokeTests<KeyStroke> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.KeyStroke]

    @Override
    public KeyStroke createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.swing.KeyStroke], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.KeyStroke]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.KeyStroke]

}
