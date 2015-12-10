package org.j8unit.repository.javax.smartcardio;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class CardTerminalClassTest
implements org.j8unit.repository.javax.smartcardio.CardTerminalClassTests<javax.smartcardio.CardTerminal> {

    @Override
    public Class<javax.smartcardio.CardTerminal> createNewSUT() {
        return javax.smartcardio.CardTerminal.class;
    }

}
