package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class IDLTypeClassTest
implements org.j8unit.repository.org.omg.CORBA.IDLTypeClassTests<org.omg.CORBA.IDLType> {

    @Override
    public Class<org.omg.CORBA.IDLType> createNewSUT() {
        return org.omg.CORBA.IDLType.class;
    }

}
