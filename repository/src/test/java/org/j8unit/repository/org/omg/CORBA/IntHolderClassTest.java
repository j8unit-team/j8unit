package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class IntHolderClassTest
implements org.j8unit.repository.org.omg.CORBA.IntHolderClassTests<org.omg.CORBA.IntHolder> {

    @Override
    public Class<org.omg.CORBA.IntHolder> createNewSUT() {
        return org.omg.CORBA.IntHolder.class;
    }

}
