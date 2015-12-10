package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ByteHolderClassTest
implements org.j8unit.repository.org.omg.CORBA.ByteHolderClassTests<org.omg.CORBA.ByteHolder> {

    @Override
    public Class<org.omg.CORBA.ByteHolder> createNewSUT() {
        return org.omg.CORBA.ByteHolder.class;
    }

}
