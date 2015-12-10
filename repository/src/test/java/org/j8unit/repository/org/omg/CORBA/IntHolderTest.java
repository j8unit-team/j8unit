package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class IntHolderTest
implements org.j8unit.repository.org.omg.CORBA.IntHolderTests<org.omg.CORBA.IntHolder> {

    @Override
    public org.omg.CORBA.IntHolder createNewSUT() {
        return new org.omg.CORBA.IntHolder();
    }

}
