package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class IDLTypeOperationsClassTest
implements org.j8unit.repository.org.omg.CORBA.IDLTypeOperationsClassTests<org.omg.CORBA.IDLTypeOperations> {

    @Override
    public Class<org.omg.CORBA.IDLTypeOperations> createNewSUT() {
        return org.omg.CORBA.IDLTypeOperations.class;
    }

}
