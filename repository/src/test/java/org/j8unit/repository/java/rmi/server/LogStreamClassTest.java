package org.j8unit.repository.java.rmi.server;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class LogStreamClassTest
implements org.j8unit.repository.java.rmi.server.LogStreamClassTests<java.rmi.server.LogStream> {

    @Override
    public Class<java.rmi.server.LogStream> createNewSUT() {
        return java.rmi.server.LogStream.class;
    }

}
