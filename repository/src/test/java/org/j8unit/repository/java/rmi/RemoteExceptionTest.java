package org.j8unit.repository.java.rmi;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class RemoteExceptionTest
implements org.j8unit.repository.java.rmi.RemoteExceptionTests<java.rmi.RemoteException> {

    @Override
    public java.rmi.RemoteException createNewSUT() {
        return new java.rmi.RemoteException();
    }

}