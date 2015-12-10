package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ByteHolderTest
implements org.j8unit.repository.org.omg.CORBA.ByteHolderTests<org.omg.CORBA.ByteHolder> {

    @Override
    public org.omg.CORBA.ByteHolder createNewSUT() {
        return new org.omg.CORBA.ByteHolder();
    }

}
