package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class WrongTransactionHolderClassTest
implements org.j8unit.repository.org.omg.CORBA.WrongTransactionHolderClassTests<org.omg.CORBA.WrongTransactionHolder> {

    @Override
    public Class<org.omg.CORBA.WrongTransactionHolder> createNewSUT() {
        return org.omg.CORBA.WrongTransactionHolder.class;
    }

}
