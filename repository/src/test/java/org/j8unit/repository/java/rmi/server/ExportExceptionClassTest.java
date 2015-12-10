package org.j8unit.repository.java.rmi.server;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ExportExceptionClassTest
implements org.j8unit.repository.java.rmi.server.ExportExceptionClassTests<java.rmi.server.ExportException> {

    @Override
    public Class<java.rmi.server.ExportException> createNewSUT() {
        return java.rmi.server.ExportException.class;
    }

}
