package org.j8unit.repository.javax.smartcardio;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ATRTest
implements org.j8unit.repository.javax.smartcardio.ATRTests<javax.smartcardio.ATR> {

    @Override
    public javax.smartcardio.ATR createNewSUT() {
        throw new AssumptionViolatedException("There is no default constructor for [javax.smartcardio.ATR] available.");
    }

}
