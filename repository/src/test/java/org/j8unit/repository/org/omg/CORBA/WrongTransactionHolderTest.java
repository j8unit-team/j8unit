package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class WrongTransactionHolderTest
implements org.j8unit.repository.org.omg.CORBA.WrongTransactionHolderTests<org.omg.CORBA.WrongTransactionHolder> {

    @Override
    public org.omg.CORBA.WrongTransactionHolder createNewSUT() {
        return new org.omg.CORBA.WrongTransactionHolder();
    }

}
