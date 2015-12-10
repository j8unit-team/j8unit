package org.j8unit.repository.javax.rmi.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ClassDescClassTest
implements org.j8unit.repository.javax.rmi.CORBA.ClassDescClassTests<javax.rmi.CORBA.ClassDesc> {

    @Override
    public Class<javax.rmi.CORBA.ClassDesc> createNewSUT() {
        return javax.rmi.CORBA.ClassDesc.class;
    }

}
