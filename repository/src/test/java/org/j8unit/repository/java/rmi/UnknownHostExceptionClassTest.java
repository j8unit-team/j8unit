package org.j8unit.repository.java.rmi;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class UnknownHostExceptionClassTest
implements org.j8unit.repository.java.rmi.UnknownHostExceptionClassTests<java.rmi.UnknownHostException> {

    @Override
    public Class<java.rmi.UnknownHostException> createNewSUT() {
        return java.rmi.UnknownHostException.class;
    }

}
