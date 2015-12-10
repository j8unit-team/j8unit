package org.j8unit.repository.javax.rmi.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ClassDescTest
implements org.j8unit.repository.javax.rmi.CORBA.ClassDescTests<javax.rmi.CORBA.ClassDesc> {

    @Override
    public javax.rmi.CORBA.ClassDesc createNewSUT() {
        return new javax.rmi.CORBA.ClassDesc();
    }

}
