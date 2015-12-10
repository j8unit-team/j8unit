package org.j8unit.repository.java.net;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class PortUnreachableExceptionClassTest
implements org.j8unit.repository.java.net.PortUnreachableExceptionClassTests<java.net.PortUnreachableException> {

    @Override
    public Class<java.net.PortUnreachableException> createNewSUT() {
        return java.net.PortUnreachableException.class;
    }

}
