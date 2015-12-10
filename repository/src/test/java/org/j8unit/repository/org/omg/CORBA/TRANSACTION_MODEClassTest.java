package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class TRANSACTION_MODEClassTest
implements org.j8unit.repository.org.omg.CORBA.TRANSACTION_MODEClassTests<org.omg.CORBA.TRANSACTION_MODE> {

    @Override
    public Class<org.omg.CORBA.TRANSACTION_MODE> createNewSUT() {
        return org.omg.CORBA.TRANSACTION_MODE.class;
    }

}
