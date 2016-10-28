package org.j8unit.repository.javax.smartcardio;

import javax.smartcardio.TerminalFactorySpi;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class TerminalFactorySpiTest
implements org.j8unit.repository.javax.smartcardio.TerminalFactorySpiTests<TerminalFactorySpi> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.smartcardio.TerminalFactorySpi]

    @Override
    public TerminalFactorySpi createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.smartcardio.TerminalFactorySpi], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.smartcardio.TerminalFactorySpi]

}
