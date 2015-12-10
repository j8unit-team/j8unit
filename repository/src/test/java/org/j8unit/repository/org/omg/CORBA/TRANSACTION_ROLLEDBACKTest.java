package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class TRANSACTION_ROLLEDBACKTest
implements org.j8unit.repository.org.omg.CORBA.TRANSACTION_ROLLEDBACKTests<org.omg.CORBA.TRANSACTION_ROLLEDBACK> {

    @Override
    public org.omg.CORBA.TRANSACTION_ROLLEDBACK createNewSUT() {
        return new org.omg.CORBA.TRANSACTION_ROLLEDBACK();
    }

}
