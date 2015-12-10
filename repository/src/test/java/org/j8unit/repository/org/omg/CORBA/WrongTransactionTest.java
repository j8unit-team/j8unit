package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class WrongTransactionTest
implements org.j8unit.repository.org.omg.CORBA.WrongTransactionTests<org.omg.CORBA.WrongTransaction> {

    @Override
    public org.omg.CORBA.WrongTransaction createNewSUT() {
        return new org.omg.CORBA.WrongTransaction();
    }

}
