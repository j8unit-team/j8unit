package org.j8unit.repository.javax.xml.crypto;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class MarshalExceptionTest
implements org.j8unit.repository.javax.xml.crypto.MarshalExceptionTests<javax.xml.crypto.MarshalException> {

    @Override
    public javax.xml.crypto.MarshalException createNewSUT() {
        return new javax.xml.crypto.MarshalException();
    }

}
