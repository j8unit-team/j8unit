package org.j8unit.repository.java.net;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class UnknownHostExceptionClassTest
implements org.j8unit.repository.java.net.UnknownHostExceptionClassTests<java.net.UnknownHostException> {

    @Override
    public Class<java.net.UnknownHostException> createNewSUT() {
        return java.net.UnknownHostException.class;
    }

}
