package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DataInputStreamClassTest
implements org.j8unit.repository.org.omg.CORBA.DataInputStreamClassTests<org.omg.CORBA.DataInputStream> {

    @Override
    public Class<org.omg.CORBA.DataInputStream> createNewSUT() {
        return org.omg.CORBA.DataInputStream.class;
    }

}
