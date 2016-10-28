package org.j8unit.repository.javax.smartcardio;

import javax.smartcardio.CardTerminal;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class CardTerminalTest
implements org.j8unit.repository.javax.smartcardio.CardTerminalTests<CardTerminal> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.smartcardio.CardTerminal]

    @Override
    public CardTerminal createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.smartcardio.CardTerminal], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.smartcardio.CardTerminal]

}
