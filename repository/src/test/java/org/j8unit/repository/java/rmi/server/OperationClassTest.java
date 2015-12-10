package org.j8unit.repository.java.rmi.server;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class OperationClassTest
implements org.j8unit.repository.java.rmi.server.OperationClassTests<java.rmi.server.Operation> {

    @Override
    public Class<java.rmi.server.Operation> createNewSUT() {
        return java.rmi.server.Operation.class;
    }

}
