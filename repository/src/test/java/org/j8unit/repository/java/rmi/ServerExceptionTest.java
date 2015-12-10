package org.j8unit.repository.java.rmi;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ServerExceptionTest
implements org.j8unit.repository.java.rmi.ServerExceptionTests<java.rmi.ServerException> {

    @Override
    public java.rmi.ServerException createNewSUT() {
        throw new AssertionError("There is no default constructor for [java.rmi.ServerException] available.");
    }

}
