package org.j8unit.repository.javax.rmi.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class StubDelegateClassTest
implements org.j8unit.repository.javax.rmi.CORBA.StubDelegateClassTests<javax.rmi.CORBA.StubDelegate> {

    @Override
    public Class<javax.rmi.CORBA.StubDelegate> createNewSUT() {
        return javax.rmi.CORBA.StubDelegate.class;
    }

}
