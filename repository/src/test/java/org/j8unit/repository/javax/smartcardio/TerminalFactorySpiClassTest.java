package org.j8unit.repository.javax.smartcardio;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class TerminalFactorySpiClassTest
implements org.j8unit.repository.javax.smartcardio.TerminalFactorySpiClassTests<javax.smartcardio.TerminalFactorySpi> {

    @Override
    public Class<javax.smartcardio.TerminalFactorySpi> createNewSUT() {
        return javax.smartcardio.TerminalFactorySpi.class;
    }

}
