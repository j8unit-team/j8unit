package org.j8unit.repository.javax.smartcardio;

import javax.smartcardio.CardTerminal;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link CardTerminal} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.smartcardio.CardTerminalClassTests}).
 */

@RunWith(J8Unit4.class)
@SuppressWarnings("restriction")
public class CardTerminalClassTest
implements CardTerminalClassTests<CardTerminal> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.smartcardio.CardTerminal]

    @Override
    public Class<CardTerminal> createNewSUT() {
        return CardTerminal.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.smartcardio.CardTerminal]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.smartcardio.CardTerminal]

}
