package org.j8unit.repository.java.rmi;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ServerErrorClassTest
implements org.j8unit.repository.java.rmi.ServerErrorClassTests<java.rmi.ServerError> {

    @Override
    public Class<java.rmi.ServerError> createNewSUT() {
        return java.rmi.ServerError.class;
    }

}
