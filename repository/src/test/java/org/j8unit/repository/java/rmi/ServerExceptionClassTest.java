package org.j8unit.repository.java.rmi;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ServerExceptionClassTest
implements org.j8unit.repository.java.rmi.ServerExceptionClassTests<java.rmi.ServerException> {

    @Override
    public Class<java.rmi.ServerException> createNewSUT() {
        return java.rmi.ServerException.class;
    }

}
