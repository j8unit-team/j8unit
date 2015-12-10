package org.j8unit.repository.java.net;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ProtocolExceptionClassTest
implements org.j8unit.repository.java.net.ProtocolExceptionClassTests<java.net.ProtocolException> {

    @Override
    public Class<java.net.ProtocolException> createNewSUT() {
        return java.net.ProtocolException.class;
    }

}
