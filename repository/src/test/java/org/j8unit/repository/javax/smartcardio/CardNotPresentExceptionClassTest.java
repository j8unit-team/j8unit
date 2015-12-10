package org.j8unit.repository.javax.smartcardio;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class CardNotPresentExceptionClassTest
implements org.j8unit.repository.javax.smartcardio.CardNotPresentExceptionClassTests<javax.smartcardio.CardNotPresentException> {

    @Override
    public Class<javax.smartcardio.CardNotPresentException> createNewSUT() {
        return javax.smartcardio.CardNotPresentException.class;
    }

}
