package org.j8unit.repository.javax.smartcardio;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ResponseAPDUTest
implements org.j8unit.repository.javax.smartcardio.ResponseAPDUTests<javax.smartcardio.ResponseAPDU> {

    @Override
    public javax.smartcardio.ResponseAPDU createNewSUT() {
        throw new AssumptionViolatedException("There is no default constructor for [javax.smartcardio.ResponseAPDU] available.");
    }

}
