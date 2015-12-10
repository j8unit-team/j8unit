package org.j8unit.repository.java.rmi.server;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class LogStreamTest
implements org.j8unit.repository.java.rmi.server.LogStreamTests<java.rmi.server.LogStream> {

    @Override
    public java.rmi.server.LogStream createNewSUT() {
        throw new AssumptionViolatedException("There is no default constructor for [java.rmi.server.LogStream] available.");
    }

}
