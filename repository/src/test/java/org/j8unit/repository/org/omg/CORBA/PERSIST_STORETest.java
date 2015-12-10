package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class PERSIST_STORETest
implements org.j8unit.repository.org.omg.CORBA.PERSIST_STORETests<org.omg.CORBA.PERSIST_STORE> {

    @Override
    public org.omg.CORBA.PERSIST_STORE createNewSUT() {
        return new org.omg.CORBA.PERSIST_STORE();
    }

}
