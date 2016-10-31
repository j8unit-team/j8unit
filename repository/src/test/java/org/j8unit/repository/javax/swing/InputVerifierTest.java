package org.j8unit.repository.javax.swing;

import javax.swing.InputVerifier;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class InputVerifierTest
implements org.j8unit.repository.javax.swing.InputVerifierTests<InputVerifier> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.InputVerifier]

    @Override
    public InputVerifier createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.swing.InputVerifier], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.InputVerifier]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.InputVerifier]

}
