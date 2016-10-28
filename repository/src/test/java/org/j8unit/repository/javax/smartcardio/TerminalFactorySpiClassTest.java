package org.j8unit.repository.javax.smartcardio;

import javax.smartcardio.TerminalFactorySpi;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class TerminalFactorySpiClassTest
implements org.j8unit.repository.javax.smartcardio.TerminalFactorySpiClassTests<TerminalFactorySpi> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.smartcardio.TerminalFactorySpi]

    @Override
    public Class<TerminalFactorySpi> createNewSUT() {
        return TerminalFactorySpi.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.smartcardio.TerminalFactorySpi]

}
