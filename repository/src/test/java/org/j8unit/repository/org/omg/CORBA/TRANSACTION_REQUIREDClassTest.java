package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class TRANSACTION_REQUIREDClassTest
implements org.j8unit.repository.org.omg.CORBA.TRANSACTION_REQUIREDClassTests<org.omg.CORBA.TRANSACTION_REQUIRED> {

    @Override
    public Class<org.omg.CORBA.TRANSACTION_REQUIRED> createNewSUT() {
        return org.omg.CORBA.TRANSACTION_REQUIRED.class;
    }

}
