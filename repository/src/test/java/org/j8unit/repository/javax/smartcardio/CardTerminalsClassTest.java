package org.j8unit.repository.javax.smartcardio;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class CardTerminalsClassTest
implements org.j8unit.repository.javax.smartcardio.CardTerminalsClassTests<javax.smartcardio.CardTerminals> {

    @Override
    public Class<javax.smartcardio.CardTerminals> createNewSUT() {
        return javax.smartcardio.CardTerminals.class;
    }

    @RunWith(J8Unit4.class)
    public static class StateClassTest
    implements org.j8unit.repository.javax.smartcardio.CardTerminalsClassTests.StateClassTests<javax.smartcardio.CardTerminals.State> {

        @Override
        public Class<javax.smartcardio.CardTerminals.State> createNewSUT() {
            return javax.smartcardio.CardTerminals.State.class;
        }

    }

}
