package org.j8unit.repository.java.net;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ConnectExceptionClassTest
implements org.j8unit.repository.java.net.ConnectExceptionClassTests<java.net.ConnectException> {

    @Override
    public Class<java.net.ConnectException> createNewSUT() {
        return java.net.ConnectException.class;
    }

}
