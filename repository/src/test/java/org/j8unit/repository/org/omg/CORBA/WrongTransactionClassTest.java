package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class WrongTransactionClassTest
implements org.j8unit.repository.org.omg.CORBA.WrongTransactionClassTests<org.omg.CORBA.WrongTransaction> {

    @Override
    public Class<org.omg.CORBA.WrongTransaction> createNewSUT() {
        return org.omg.CORBA.WrongTransaction.class;
    }

}
