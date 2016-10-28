package org.j8unit.repository.javax.smartcardio;

import javax.smartcardio.CardNotPresentException;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class CardNotPresentExceptionTest
implements org.j8unit.repository.javax.smartcardio.CardNotPresentExceptionTests<CardNotPresentException> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.smartcardio.CardNotPresentException]

    @Override
    public CardNotPresentException createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.smartcardio.CardNotPresentException], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.smartcardio.CardNotPresentException]

}
