package org.j8unit.repository.javax.smartcardio;

import javax.smartcardio.CardTerminal;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class CardTerminalClassTest
implements org.j8unit.repository.javax.smartcardio.CardTerminalClassTests<CardTerminal> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.smartcardio.CardTerminal]

    @Override
    public Class<CardTerminal> createNewSUT() {
        return CardTerminal.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.smartcardio.CardTerminal]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.smartcardio.CardTerminal]

}
