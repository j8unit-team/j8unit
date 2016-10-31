package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.omg.CORBA.IDLType;

@RunWith(J8Unit4.class)
public class IDLTypeClassTest
implements org.j8unit.repository.org.omg.CORBA.IDLTypeClassTests<IDLType> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.CORBA.IDLType]

    @Override
    public Class<IDLType> createNewSUT() {
        return IDLType.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.omg.CORBA.IDLType]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.CORBA.IDLType]

}
