package org.j8unit.repository.javax.rmi.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class StubClassTest
implements org.j8unit.repository.javax.rmi.CORBA.StubClassTests<javax.rmi.CORBA.Stub> {

    @Override
    public Class<javax.rmi.CORBA.Stub> createNewSUT() {
        return javax.rmi.CORBA.Stub.class;
    }

}
