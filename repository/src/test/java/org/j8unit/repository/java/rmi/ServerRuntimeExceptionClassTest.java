package org.j8unit.repository.java.rmi;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ServerRuntimeExceptionClassTest
implements org.j8unit.repository.java.rmi.ServerRuntimeExceptionClassTests<java.rmi.ServerRuntimeException> {

    @Override
    public Class<java.rmi.ServerRuntimeException> createNewSUT() {
        return java.rmi.ServerRuntimeException.class;
    }

}
