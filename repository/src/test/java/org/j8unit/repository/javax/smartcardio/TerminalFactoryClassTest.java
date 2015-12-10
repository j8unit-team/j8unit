package org.j8unit.repository.javax.smartcardio;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class TerminalFactoryClassTest
implements org.j8unit.repository.javax.smartcardio.TerminalFactoryClassTests<javax.smartcardio.TerminalFactory> {

    @Override
    public Class<javax.smartcardio.TerminalFactory> createNewSUT() {
        return javax.smartcardio.TerminalFactory.class;
    }

}
