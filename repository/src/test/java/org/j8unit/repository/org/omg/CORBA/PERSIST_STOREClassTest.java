package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class PERSIST_STOREClassTest
implements org.j8unit.repository.org.omg.CORBA.PERSIST_STOREClassTests<org.omg.CORBA.PERSIST_STORE> {

    @Override
    public Class<org.omg.CORBA.PERSIST_STORE> createNewSUT() {
        return org.omg.CORBA.PERSIST_STORE.class;
    }

}
