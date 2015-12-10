package org.j8unit.repository.javax.smartcardio;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class CardNotPresentExceptionTest
implements org.j8unit.repository.javax.smartcardio.CardNotPresentExceptionTests<javax.smartcardio.CardNotPresentException> {

    @Override
    public javax.smartcardio.CardNotPresentException createNewSUT() {
        throw new AssumptionViolatedException("There is no default constructor for [javax.smartcardio.CardNotPresentException] available.");
    }

}
