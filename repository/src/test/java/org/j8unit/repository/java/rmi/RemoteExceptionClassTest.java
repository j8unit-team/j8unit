package org.j8unit.repository.java.rmi;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class RemoteExceptionClassTest
implements org.j8unit.repository.java.rmi.RemoteExceptionClassTests<java.rmi.RemoteException> {

    @Override
    public Class<java.rmi.RemoteException> createNewSUT() {
        return java.rmi.RemoteException.class;
    }

}