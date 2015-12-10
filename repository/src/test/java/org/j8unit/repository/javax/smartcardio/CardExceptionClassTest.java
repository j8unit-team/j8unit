package org.j8unit.repository.javax.smartcardio;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class CardExceptionClassTest
implements org.j8unit.repository.javax.smartcardio.CardExceptionClassTests<javax.smartcardio.CardException> {

    @Override
    public Class<javax.smartcardio.CardException> createNewSUT() {
        return javax.smartcardio.CardException.class;
    }

}
