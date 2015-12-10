package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class TRANSACTION_ROLLEDBACKClassTest
implements org.j8unit.repository.org.omg.CORBA.TRANSACTION_ROLLEDBACKClassTests<org.omg.CORBA.TRANSACTION_ROLLEDBACK> {

    @Override
    public Class<org.omg.CORBA.TRANSACTION_ROLLEDBACK> createNewSUT() {
        return org.omg.CORBA.TRANSACTION_ROLLEDBACK.class;
    }

}
