package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class TRANSACTION_UNAVAILABLETest
implements org.j8unit.repository.org.omg.CORBA.TRANSACTION_UNAVAILABLETests<org.omg.CORBA.TRANSACTION_UNAVAILABLE> {

    @Override
    public org.omg.CORBA.TRANSACTION_UNAVAILABLE createNewSUT() {
        return new org.omg.CORBA.TRANSACTION_UNAVAILABLE();
    }

}
